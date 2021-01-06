package com.zhang.aop.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.aop.proxy
 * @date:2021/1/6
 */
public class MyHandller implements InvocationHandler {
    private Object object;

    public MyHandller(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("代理前做什么！！！");
        Object invoke = method.invoke(object, args);
        System.out.println("代理后做什么！！！");
        return invoke;

    }
}
