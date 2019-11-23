package com.k003.lesson7.spring_aop_demo.aop;

import org.springframework.aop.ThrowsAdvice;

public class ThrowAdviceDemo implements ThrowsAdvice {
    public void afterThrowing(IllegalArgumentException e ) throws Throwable{
        System.out.println("Throw after method: ");
    }
}
