// CodeWarrior IDE
// 设计：DS18B20温度传感器
#include <hidef.h>      /* common defines and macros */ 
#include "derivative.h"      /* derivative-specific definitions */
#define RowSize 4
#define ColumnSize 4
#define uint unsigned int
#define uchar unsigned char
#define DQOut PTJ_PTJ0
#define DQIn PTIJ_PTIJ0
#define DQDDR DDRJ_DDRJ0 
const uchar  DisplayDecode[]=
{~0x3f,~0x06,~0x5b,~0x4f,~0x66,~0x6d,~0x7d,~0x07,~0x7f,~0x6f,~0x77,~0x7c,~0x39,~0x5e,~0x79,~0x71,	//0~9对应的段码
~0xbf,~0x86,~0xdb,~0xcf,~0xe6,~0xed,~0xfd,~0x87,~0xff,~0xef };  //0~9后加小数点对应的段码
const uchar KeyDecode[]=
{ 0x0d,0x0c,0x0b,0x0a,0x0e,0x09,0x06,0x03,0x00,0x08,0x05,0x02,0x0f,0x07,0x04,0x01};   //键码
unsigned long ADresult; //AD结果为0~2000
uint wendu;
uint integer,decimal; 
byte data1;
byte data2;
byte data3;
byte data4;
/********锁相环*******/
void pllclk()   //外部时钟为16MHz，锁相环时钟为80MHz，总线时钟为40MHz
{
    SYNR=0x53;         //PLLCLK =2*OSCCLK*(SYNR + 1)/(REFDV + 1)
    REFDV=0x07;
    while(CRGFLG_LOCK==0); //时钟校正同步
    CLKSEL_PLLSEL=1;
}
/********初始化I/O,PIT,AD********/
void Init_PORT() 
{
  PUCR|=0x01; 
  DDRB=0xFF;//输出
  DDRA=0X0F;//键盘
  DDRP=0xFF;
  DDRT=0xFF;
  DDRE=0x00;
}

void Init_ATD()  //AN15
{ 
  ATD0CTL1=0x0f; //选择8位转换精度
  ATD0CTL2=0x40; //打开CCF快速清零，关闭外部触发输入，关闭中断
  ATD0CTL3=0x88; //数据右对齐，non-fifo，转换序列长度为1
  ATD0CTL4=0xE3; //采样时间为24个ATD时钟周期，ATDClk=8MB/8=1MHz
}   

/********延时1us***********/ 
void delay(uint countert)  //1.05us
{
   uint i,j;
   for(i=0;i<countert;i++)
   for(j=0;j<7;j++);
}

void delayms(uint countert)//0.6ms
	{  
    		uint i,j; 
    		for(i=0;i<countert;i++) 
        		for(j=0;j<4000;) j++;
	}
	
void delay15us(uint temp)   
{
    PITCFLMT_PITE=0; //关闭PIT定时器
    PITCE_PCE0=1;    //定时器通道0使能 
    PITMTLD0=40-1;  //8位微定时器初值设定。
    PITLD0=15*temp-1;//16 位定时器初值设定。
    PITINTE_PINTE0=0; //不中断
    PITCFLMT_PITE=1;  //PIT定时器使能
    for(;;) 
    {
        if(PITTF_PTF0 == 1)
        break;
    }
    PITCFLMT_PITE= 0;   //关闭定时器   
    PITCE_PCE0=0;    //关闭定时器通道0
}
/*********显示********/
void Show()
{
  uchar DisplayNumber;
  for(DisplayNumber=0;DisplayNumber<4;DisplayNumber++) 
  {
	  switch(DisplayNumber)
    {
     case 0:
       PTT=0xf7;
       if(data1==20)
          PTP=~0x40;
       else if(data1==0)
           PTP=~0;
       else
          PTP=DisplayDecode[data1];
       delayms(1);
       break;            
     case 1:
        PTT=0xfb;
        if(data1==20)
        PTP=~0x40;
          else
        PTP=DisplayDecode[data2];
        delayms(1);
        break;
     case 2:
        PTT=0xfd;
        PTP=DisplayDecode[data3];
        delayms(1);
        break;            
     case 3:
        PTT=0xfe;
        PTP=DisplayDecode[data4];
        delayms(1);
        break;            
     default:
        break;     
   }
  delayms(5);	 
	}  
}
/********DS18B20复位初始化*******/
void Init_DS18B20()
{
  DQDDR=1;      //数据线所连的J0口作为输出
  DQOut=0;      //发出低电平
  delay15us(33);
  DQDDR=0;      //J0口作为输入，判断数据线DQ状态
  delay15us(4);
  while(DQIn);  //直至J口的数据存储器中有值，即DS18B20响应
  {asm("nop");}
  delay15us(25);
}

/**********读数据*********/
uchar Read_DS18B20() 
{
  uchar i;
  uchar tmp=0;
  for(i=0;i<8;i++) 
  {
    tmp >>= 1; //读写从低位开始
    DQDDR = 1; //J口作为输出，改变总线状态
    DQOut=0;   //Read init，J口拉低总线，读周期开始
    delay(2);
    DQDDR = 0;  //J口作为输入，被DS18B20占用
    delay15us(1);
    if(DQIn==1) //若J口的寄存器内有数，采集送出数据
    tmp |= 0x80;
    delay15us(4);
  }  
  return tmp;
}
/**********写数据*********/
void Writebyte_DS18B20(byte cmd)
{                        
  uchar i; 
  for(i=0;i<8;i++) 
  {
      DQDDR = 1;   
      DQOut = 0;   //总线被拉低，写周期开始
      delay(6);
     if(cmd & 0x01)  	  //低位在前，写1
            DQDDR = 0;  //释放总线，状态由DS18B20决定                	
     else               //写0
        {
            DQDDR = 1;
            DQOut = 0;    	         
        }
    cmd >>= 1;
    delay15us(4);//等待采样
    DQDDR = 0;
    delay(10);
  }  
}

/**********读取*********/
uint Read() 
{
  uint t;
  uchar Temp[2];           //Temp[0]为低位
  DQOut = 1;
  Init_DS18B20();
  Writebyte_DS18B20(0xcc); //跳过设备号
  Writebyte_DS18B20(0x44); //启动DS18B20进行温度转换
  Init_DS18B20();
  Writebyte_DS18B20(0xcc);
  Writebyte_DS18B20(0xbe); //读取内部RAM中温度数据
  Temp[0] = Read_DS18B20();//存Bit[7:0]
  Temp[1] = Read_DS18B20();//存Bit[15:8]
  Init_DS18B20();
  t=(Temp[1]<<8)|Temp[0];  //存Bit[15:0]
  return(t);

}
/**********转换*********/
void Trans()
{
     wendu=Read();   //读取温度值
		 if(wendu<2001)  //温度为零上
		 {		
       	 	wendu&=0x07ff;
      		integer=wendu/16;        //温度整数部分
       		decimal=(wendu*25/4)%100; //小数部分
        	data1=(integer%100)/10;
        	data2=integer%10+16;     //显示小数点
        	data3=decimal/10;
        	data4=decimal%10;
		 }
		 else
		 {			
  			wendu=~(wendu-1);				
       		integer=wendu/16;        //温度整数部分
  			decimal=(wendu*25/4)%100; //小数部分
        	data1=20;
       		if(integer/10==0)       
        	{
            	data2 = integer%10+16;  //格式为：-*.**
            	data3 = decimal/10;
            	data4 = decimal%10; 
        	} 
        	else                         //格式为：-**.*
        	{
            	data2=integer/10;             
            	data3=integer%10+16;
            	data4=decimal/10;
        	}
		 }
		 PORTB=wendu;
	     Show( );	
}
/*******变阻器ATD*********/
void ATD() 
{ 
 	ATD0CTL5=0x2F;          //连续转换                         
 	while(!(ATD0STAT0&0x80));    //查询ATD是否完成
    ADresult=ATD0DR0;
    ADresult &= 0x00ff;
    ADresult = ADresult *125/16;
    integer = ADresult /100;
    decimal = ADresult %100;
    data1 = integer /10;
    data2 = integer %10+16;
    data3 = decimal/10;
    data4 = decimal%10;
    Show();  	//显示
    PORTB= ATD0DR0;   
}    

/*******键盘扫描*******/ 
uchar KeyScan()  
{
  	unsigned char Input1=0;
  	unsigned char Output,Keynumber,Keyvalue1;
  	unsigned char i; 
  	Keyvalue1=0xFF;
  	Output=0xF0;
	PORTA=Output;
	if((PORTA>>4)!=0x0F)
	{
	  Show();
	  if((PORTA>>4)!=0x0F)
	  { 
	    Output=0x01;
	    for(i=0;i<RowSize;i++) 
	    {
	      PORTA=~Output; 
	      if((PORTA>>4)!=0x0F)
	      {
	        switch((PORTA>>4)) 
		      {
		        case 0x0E:Keynumber=0;break;
		        case 0x0D:Keynumber=1;break; 
		        case 0x0B:Keynumber=2;break;
		        case 0x07:Keynumber=3;break; 
		      }
		    Keynumber=Keynumber+i*ColumnSize;
		    Keyvalue1=KeyDecode[Keynumber]; 
		    Output=0xF0;
	        PORTA=Output;
	        Input1=PORTA;
	        Input1=Input1&0xF0;
		    Input1=Input1>>4;
	        while((PORTA>>4)!=0x0F) 
Show();
		    break;
	      }
	      else Output<<=1;
	    }
	  }
	}
	return(Keyvalue1);
}



//************主函数***********//

void main(void) {
   unsigned char c,d;
  pllclk();
  Init_PORT();
  EnableInterrupts;
  delayms(2000);
	Init_ATD();
  for(;;)
  { 
   c=KeyScan(); 
   if(c==0x0f) 
      { for(;;) 
      {  d=KeyScan();
      if(d==0x0e) break;
      Trans();}
      }
   else               
      ATD();
  }   

}
