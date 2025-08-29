package tests;

public class test4 {
    //数字加密案例,加密规则：每位数加5，再对10求余，最后将数字顺序反转
    public static void main(String[] args) {
        System.out.println(encrypt(1983));
    }
    public static String encrypt(int number){
        //接收输入数字并拆分
        int[] numbers = split(number);
        //遍历数组中每个数字并加密
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (numbers[i] + 5) % 10;
        }
        reverse(numbers);
        String data = "";
        for (int i = 0; i < numbers.length; i++) {
            data += numbers[i];
        }
        return data;
    }
    public static void reverse(int[] numbers){
        //通过双指针法（一个从数组头部开始，一个从数组尾部开始），交换元素的位置，直到指针相遇。
        for (int i = 0,j = numbers.length - 1; i < j; i++, j--) {
            int temp = numbers[j];
            numbers[j] = numbers[i];
            numbers[i] =temp;
        }
    }
    public static int[] split(int number){
        int[] numbers = new int[4];
        numbers[0] = number / 1000;//最高位数字
        numbers[1] = (number/100) % 10;
        numbers[2] = (number/10) % 10;
        numbers[3] = number % 10;
        return numbers;
    }
}
