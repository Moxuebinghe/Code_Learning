package tests;

public class test1 {
    public static void main(String[] args) {
        //计算机票价格
        double price = calculate(1000, 11, "头等舱");
        System.out.println("优惠价是：" + price);
    }
    public static double calculate(double price, int month, String type){
        if(month >=5 && month <=10){//旺季
            switch (type){
                case "头等舱":
                    price *= 0.9;
                    break;
                case "经济舱":
                    price *= 0.85;
                    break;
            }
        }else{//淡季
            switch (type){
                case "头等舱":
                    price *= 0.7;
                    break;
                case "经济舱":
                    price *= 0.65;
                    break;
            }
        }
        return price;
    }
}
