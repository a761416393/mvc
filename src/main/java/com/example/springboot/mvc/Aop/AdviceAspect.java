package com.example.springboot.mvc.Aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class AdviceAspect {

    //定义切点
    @Pointcut("execution(* com.example.springboot.mvc.Service.Imp..*(..))")
    public void testService(){

    }

    @Before("testService()")
    public void doBefore(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();

        System.out.println("--方法调用前切面---"+method.getName().toString());
    }

    @After("testService()")
    public void doAfter(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();

        System.out.println("--方法调用后切面---"+method.getName().toString());
    }

    @Around("testService()")
    public Object doAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        MethodSignature signature = (MethodSignature) proceedingJoinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("--环绕通知--方法调用前切面---"+method.getName().toString());

        Object object = proceedingJoinPoint.proceed();

        System.out.println("--环绕通知--方法调用后切面---"+method.getName().toString());

        return object;

    }


}
