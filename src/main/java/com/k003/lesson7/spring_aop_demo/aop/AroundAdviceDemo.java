package com.k003.lesson7.spring_aop_demo.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdviceDemo implements MethodInterceptor {

    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("After - Before method: " +
                methodInvocation.getMethod().getName());

        try {
            // proceed to original method call
            Object result = methodInvocation.proceed();

            // same with AfterReturningAdvice
            System.out.println("around - before method: " + methodInvocation.getMethod().getName());

            return result;

        } catch (IllegalArgumentException e) {
            // same with ThrowsAdvice
            System.out.println("around - throw advice method: " + methodInvocation.getMethod().getName());
            throw e;
        }
    }
}
