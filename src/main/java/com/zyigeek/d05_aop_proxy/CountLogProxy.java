package com.zyigeek.d05_aop_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;

/*
* 计算器-日志实现的动态代理类
* 动态代理设计模式的原理
*   将通过动态代理对象（非业务逻辑）来进行操作目标对象的方法（业务逻辑）逻辑，代理对象可以决定何时何地以及是否来操作
* */
public class CountLogProxy {
    private ICount target;

    public CountLogProxy(ICount target){
        this.target=target;
    }

    //获得代理对象的方法
    public ICount getProxy(){
        //代理对象
        ICount proxy=null;
        //1.类加载器
        ClassLoader classLoader = target.getClass().getClassLoader();
        //2.类类型
        Class[] interfaces = target.getClass().getInterfaces();
        //3.执行器
        InvocationHandler h=new InvocationHandler() {

            /*
            * 执行方法：公共的非业务逻辑的方法体放置在此处
            * proxy 正在返回的代理对象，一般情况下在此方法中不建议使用
            * method 正在调用的方法
            * orgs 在执行方法时，传递的参数
            * */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //获得方法名
                String methodName = method.getName();
                //获得参数列表
                List<Object> arg= Arrays.asList(args);
                System.out.println("日志追踪：the method "+methodName+" begin with "+arg);
                Object result=null;
                try{
                    //执行目标方法
                    result=method.invoke(target,args);
                    System.out.println("日志追踪：the method "+methodName+" result "+result);
                }catch(Exception e){
                    System.out.println("日志追踪：the method "+methodName+" end with "+e.getMessage());
                }
                //后置通知
                System.out.println("日志追踪：the method "+methodName+" end with ");
                return result;
            }
        };
        //创建代理对象
        proxy= (ICount) Proxy.newProxyInstance(classLoader,interfaces,h);
        return proxy;
    }
}
