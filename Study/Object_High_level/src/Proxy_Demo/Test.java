package Proxy_Demo;

public class Test {
    public static void main(String[] args) {
    /*
        需求：
            外面的人想要大明星唱一首歌
             1. 获取代理的对象
                代理对象 = ProxyUtil.createProxy(大明星的对象);
             2. 再调用代理的唱歌方法
                代理对象.唱歌的方法("name");
     */
        BigStar bigStar = new BigStar("张三");
        Star proxy = ProxyUtil.createProxy(bigStar);    //创建代理对象

        String result = proxy.sing("明天你好"); //实际上会调用 BigStar 类中的 sing 方法
        // 这是因为代理对象 proxy 是通过 ProxyUtil.createProxy(bigStar) 创建的，它代理了 bigStar 对象的所有方法调用
        // 代理对象的所有方法调用都会被拦截并转发到 invoke 方法中处理
        System.out.println(result);

        System.out.println("------------------");
        proxy.dance();
    }
}
