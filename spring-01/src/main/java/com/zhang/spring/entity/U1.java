package com.zhang.spring.entity;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.spring.entity
 * @date:2021/1/5
 */
public class U1 {
    //U1有个
    public void excute() throws Exception {
        //想使用U2的add();
        U2 factor = Factory1.factor();
        factor.add();

    }

    public static void main(String[] args) throws Exception {
        U1 u1 = new U1();
        u1.excute();
    }
}
