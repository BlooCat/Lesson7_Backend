package com.k003.lesson7.spring_aop_aspectj_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Hello hello = (Hello) context.getBean("hello");
        hello.method1();
        System.out.println("\n");
        hello.method2();
        System.out.println("\n");
        hello.method3();
    }
}