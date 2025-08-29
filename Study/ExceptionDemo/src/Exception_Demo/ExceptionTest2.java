package Exception_Demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionTest2 {
    public static void main(String[] args) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date d = sdf.parse("2029-09-09 09:09:09");//编译时错误，因为parse()方法抛出了ParseException异常
            System.out.println(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
