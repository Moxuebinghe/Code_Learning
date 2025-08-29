package Proxy_Demo;

public interface Star {
// 此接口需要各个被代理对象与代理，共同实现
// 目的是让代理能够调用被代理对象内的方法
    //唱歌
    public abstract String sing(String name);

    //跳舞
    public abstract void dance();

}
