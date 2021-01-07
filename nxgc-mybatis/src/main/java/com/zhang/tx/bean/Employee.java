package com.zhang.tx.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.tx.bean
 * @date:2020/12/21
 */
@Data
//@Alias("qq") 第三种：类上注解的形式
public class Employee implements Serializable {

    private Integer id;
    private String lastName;
    private String gender;
    private String email;
    private Integer dId;


    public Employee() {

    }

    public Employee(Integer id, String lastName, String gender, String email, Integer dId) {
        this.id = id;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.dId = dId;
    }
}
