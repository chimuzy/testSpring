package com.zyigeek.d06_aop_aspect;

import org.springframework.stereotype.Component;

@Component
public class CountImpl implements ICount {
    @Override
    public int add(int a, int b) {
        int result=a+b;
        return result;
    }

    @Override
    public int sub(int a, int b) {
        int result=a-b;
        return result;
    }

    @Override
    public int mul(int a, int b) {
        int result=a*b;
        return result;
    }

    @Override
    public int div(int a, int b) {
        int result=a/b;
        return result;
    }
}
