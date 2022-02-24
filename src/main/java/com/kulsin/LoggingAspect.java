package com.kulsin;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    public LoggingAspect() {
    }

    @Before("execution(String print*(*))") // This is the Advice
    public void beforeMethod() {
        System.out.println("Before method execution!");

    }

    @After("execution(String print*(*))") // This is the Advice
    public void afterMethod() {
        System.out.println("After method execution!");
    }

}
