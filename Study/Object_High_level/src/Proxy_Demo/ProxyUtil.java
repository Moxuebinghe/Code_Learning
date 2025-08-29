package Proxy_Demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {//代理工具类
    public static Star createProxy(BigStar bigStar){
        /*      java.lang.reflect.Proxy类：提供了为对象产生代理对象的方法：
        public static Object newProxyInstance(ClassLoader loader,
        Class<?>[] interfaces, InvocationHandler h)
        参数一：用于指定用哪个类加载器，去加载生成的代理类
        参数二：指定接口（数组），用于指定生成的代理有哪些方法
        参数三：用来指定生成的代理对象要干什么事情
        */
        Star starProxy = (Star) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(),
                new Class[]{Star.class},
                new InvocationHandler() {   // new一个代理对象，实现InvocationHandler接口
                    @Override   //当调用代理对象的方法时，会先进入invoke方法（回调方法）
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        /*
                         * 输入的对象参数一：代理的对象
                         * 参数二：要运行的方法 sing
                         * 参数三：调用sing方法时，传递的实参
                         * */
                        if("sing".equals(method.getName())){
                            System.out.println("准备话筒，收钱");
                        }else if("dance".equals(method.getName())){
                            System.out.println("准备场地，收钱");
                        }//调用大明星里面唱歌或者跳舞的方法
                        return method.invoke(bigStar,args);
                    }
                }
        );
        return starProxy;
    }
}


