package com.zhang.aop.bean;

import org.springframework.stereotype.Component;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.aop.bean
 * @date:2021/1/6
 */
@Component
public class User {
    public void add(){
        System.out.println("add.....");
    }
}
