package com.zhang.aop.befor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.aop.befor
 * @date:2021/1/6
 */
@Component
@Aspect
@Order(1)
public class UserProxy {
    @Before(value ="execution(* com.zhang.aop.bean.User.add(..))")
    public void befor(){
        System.out.println("在之前....");
    }

    //后置通知（返回通知）
    @AfterReturning(value = "execution(* com.zhang.aop.bean.User.add(..))")
    public void afterReturning() {
        System.out.println("afterReturning.........");
    }
    //最终通知
    @After(value = "execution(* com.zhang.aop.bean.User.add(..))")
    public void after() {
        System.out.println("after.........");
    }
    //异常通知
    @AfterThrowing(value = "execution(* com.zhang.aop.bean.User.add(..))")
    public void afterThrowing() {
        System.out.println("afterThrowing.........");
    }
    //环绕通知
    @Around(value = "execution(* com.zhang.aop.bean.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws
            Throwable {
        System.out.println("环绕之前.........");
        //被增强的方法执行
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后.........");
    }
    //相同的切入点抽取
    @Pointcut(value = "execution(* com.zhang.aop.bean.User.add(..))")
    public void pointCut(){

    }

    @Before(value = "pointCut()")
    public void befor1(){

    }
}
