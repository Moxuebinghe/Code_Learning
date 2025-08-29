package Exception_Demo;

public class ExceptionTest3 {
    public static void main(String[] args) {//抛出异常
        try {
            saveAge(10);
            System.out.println("保存年龄成功");
            saveAge(210);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("保存年龄失败");
        }
    }
    public static void saveAge(int age) throws Exception{
        if(age > 0 && age < 120){
            System.out.println(("年龄被保存：" + age));
        }else {
            // 自定义异常，用来封装错误信息
            throw new AgeIllegalRuntimeException("/age is illegal");
        }
    }
}
