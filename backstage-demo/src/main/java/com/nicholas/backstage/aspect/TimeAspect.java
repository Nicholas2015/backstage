package com.nicholas.backstage.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Date;

@Aspect
@Component
public class TimeAspect {

    @Around("execution(* com.nicholas.backstage.controller.UserController.*(..))")
    public Object handleControllerMethod(ProceedingJoinPoint point) throws Throwable {
        System.out.println("Time Aspect Start");

        Object[] args = point.getArgs();
        for (Object arg : args){
            System.out.println("arg is " + arg);
        }

        Long start = new Date().getTime();
        Object obj = point.proceed();
        System.out.println("Time Aspect 耗时："+(new Date().getTime() - start));
        System.out.println("Time Aspect End");
        return obj;
    }
}
