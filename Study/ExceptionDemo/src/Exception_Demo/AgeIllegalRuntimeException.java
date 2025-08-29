package Exception_Demo;

public class AgeIllegalRuntimeException extends RuntimeException{
    //必须继承RuntimeException,才是一个运行时异常类
    public AgeIllegalRuntimeException() {
    }

    public AgeIllegalRuntimeException(String  message)
    {
        super(message);
    }
}
