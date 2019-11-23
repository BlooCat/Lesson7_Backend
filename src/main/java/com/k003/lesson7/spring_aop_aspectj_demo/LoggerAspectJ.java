package com.k003.lesson7.spring_aop_aspectj_demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class LoggerAspectJ {
    @Before("execution(* com.k003.lesson7.spring_aop_aspectj_demo.Hello.*(..))")
    public void logBefore(JoinPoint joinPoint){
        System.out.println("Before method: " +
                joinPoint.getSignature().getName());
    }

    @After("execution(* com.k003.lesson7.spring_aop_aspectj_demo.Hello.*(..))")
    public void logAfter(JoinPoint joinPoint){
        System.out.println("After method: " +
                joinPoint.getSignature().getName());
    }

    @AfterReturning(pointcut = "execution(* " +
            "com.k003.lesson7.spring_aop_aspectj_demo.Hello.method2(..))",returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result){
        System.out.println("After return method: " +
                joinPoint.getSignature().getName());
        System.out.println("Method returned value is: " + result);
    }

    @AfterThrowing(pointcut = "execution(* " +
            "com.k003.lesson7.spring_aop_aspectj_demo.Hello.*(..))", throwing = "error")
    public void logThrow(JoinPoint joinPoint, Throwable error){
        System.out.println("Exception is: " +
                joinPoint.getSignature().getName());
        System.out.println("Exception is: " + error);
    }

//    @Around("execution(* com.k003.lesson7.spring_aop_aspectj_demo.Hello.*(..))")
//    public void logAround(ProceedingJoinPoint joinPoint) throws Throwable{
//        System.out.println("Before Method: " + joinPoint.getSignature().getName());
//        try {
//            joinPoint.proceed();
//        } catch (IllegalArgumentException e){
//            System.out.println("around - throw advice method: " +
//                    joinPoint.getSignature().getName());
//            throw e;
//        }
//        System.out.println("After Method: " + joinPoint.getSignature().getName());
//    }
}
