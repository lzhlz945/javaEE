package com.zhang.spring.entity;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.spring.entity
 * @date:2021/1/5
 */
public class Factory1 {
    public static U2 factor() throws Exception {
        Class<U2> aClass = (Class<U2>) Class.forName("com.zhang.spring.entity.U2");
        U2 u2 = aClass.newInstance();
        return u2;
    }
}
