// CodeWarrior IDE
// 设计：DS18B20温度传感器
#include <hidef.h>      /* common defines and macros */
#include "derivative.h"      /* derivative-specific definitions */
void delay(void)
{  
    unsigned int i,j;
    for(i=0;i<10;i++) 
        for(j=0;j<1000;) j++;
}
void SPI_Init() { 
  SPI0BR=0x44;
  SPI0CR1=0x50;
  SPI0CR2=0x00;  
}
void SPI_send_char(unsigned char send_data) {
  while((SPI0SR&0x20)==0);
  SPI0DRL=send_data;
}
unsigned char SPI_rev_char(void) {  
  while((SPI0SR&0x80)==0);
  return SPI0DRL;
}
void main(void)
 {     unsigned char i;
       EnableInterrupts;
       PORTB=0x00;
       DDRB=0xFF; //B口输出
       DDRA=0xFF; //A口输出
       SPI_Init(); //SPI模块初始化
       i=0x55;
       PORTA=0x00; //A口产生PL或MR输入信号
       delay();
       PORTA=0xFF;
       SPI_send_char(i); //SPI发送一个字节，启动SPI      
       PORTB=SPI_rev_char(); //SPI接收一个字节,DIP开关状态在B口小灯上显示
       
       for(;;)
        { 
        
        }
 }
