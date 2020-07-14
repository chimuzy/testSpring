package com.zyigeek.d01_hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainTest {
    public static void main(String[] args) {
        HelloWord helloWord=new HelloWord();
        helloWord.setUsername("zy1");
        helloWord.work();
        System.out.println("---------------------");
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWord h=(HelloWord) ac.getBean("h");
        h.work();
    }
}
