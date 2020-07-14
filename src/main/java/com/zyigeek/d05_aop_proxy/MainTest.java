package com.zyigeek.d05_aop_proxy;

public class MainTest {
    public static void main(String[] args) {
        /*原来的日志实现
        ICount c1=new CountLogImpl();
        System.out.println(c1);
        int result= c1.add(10,20);
        System.out.println("-->result : "+result);
        */
        //通过动态代理做日志实现
        ICount target=new CountImpl();
        //将目标对象传入，获得代理对象
        ICount proxy=new CountLogProxy(target).getProxy();
        System.out.println(proxy.getClass().getName());
        //3.执行计算器方法
        int result1=proxy.add(5,6);
        int result2=proxy.div(10,0);
    }
}
