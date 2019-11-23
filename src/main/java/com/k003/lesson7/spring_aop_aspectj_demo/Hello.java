package com.k003.lesson7.spring_aop_aspectj_demo;

public class Hello {
    public void method1() {
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("method 1");
    }

    public String method2() {
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("method 2");
        return "hello";
    }

    public void method3() {
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("method 3");
        throw new IllegalArgumentException();
    }
}