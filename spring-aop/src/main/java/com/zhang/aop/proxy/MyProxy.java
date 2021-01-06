package com.zhang.aop.proxy;

import com.zhang.aop.proxy.impl.FatherImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.aop.proxy
 * @date:2021/1/6
 */
public class MyProxy {
    public static Object myProxy(Object o){
        InvocationHandler myHandller = new MyHandller(o);

        Object o1 = Proxy.newProxyInstance(o.getClass().getClassLoader(), o.getClass().getInterfaces(), myHandller);
        return o1;


    }

    public static void main(String[] args) {
        FatherImpl father = new FatherImpl();
        Father father1 = (Father) myProxy(father);
        father1.doSomThing();

    }
}
