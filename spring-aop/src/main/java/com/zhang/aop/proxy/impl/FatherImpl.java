package com.zhang.aop.proxy.impl;

import com.zhang.aop.proxy.Father;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.aop.proxy.impl
 * @date:2021/1/6
 */
public class FatherImpl implements Father {
    @Override
    public void doSomThing() {
        System.out.println(123);
    }
}
