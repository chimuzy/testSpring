package com.zyigeek.d02_ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    public static void main(String[] args) {
        ApplicationContext ref=new ClassPathXmlApplicationContext("bean_ref.xml");
        Person person=ref.getBean(Person.class);
        System.out.println(person);
    }
}
