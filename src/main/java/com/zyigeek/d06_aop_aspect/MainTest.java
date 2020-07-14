package com.zyigeek.d06_aop_aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("beans_aop.xml");

        ICount bean=(ICount) ac.getBean("countImpl");
        int result1=bean.add(10,20);
        System.out.println("-->result1 = "+result1);
        int result2=bean.div(10,20);
        System.out.println("-->result2 = "+result2);
        int result3=bean.div(10,0);
        System.out.println("-->result3 = "+result3);
    }
}
