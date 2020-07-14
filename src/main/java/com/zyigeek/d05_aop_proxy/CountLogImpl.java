package com.zyigeek.d05_aop_proxy;

public class CountLogImpl implements ICount {
    @Override
    public int add(int a, int b) {
        int result=a+b;
        System.out.println("CountImpl.add("+a+","+b+")");
        System.out.println("CountImpl.add.result=("+result+")");
        return result;
    }

    @Override
    public int sub(int a, int b) {
        int result=a-b;
        System.out.println("CountImpl.sub("+a+","+b+")");
        System.out.println("CountImpl.sub.result=("+result+")");
        return result;
    }

    @Override
    public int mul(int a, int b) {
        int result=a*b;
        System.out.println("CountImpl.mul("+a+","+b+")");
        System.out.println("CountImpl.mul.result=("+result+")");
        return result;
    }

    @Override
    public int div(int a, int b) {
        int result=a/b;
        System.out.println("CountImpl.div("+a+","+b+")");
        System.out.println("CountImpl.div.result=("+result+")");
        return result;
    }
}
