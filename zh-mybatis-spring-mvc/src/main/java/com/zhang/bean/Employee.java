package com.zhang.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.bean
 * @date:2020/12/21
 */
@Data
//@Alias("qq") 第三种：类上注解的形式
public class Employee implements Serializable {

    private Integer id;
    private String lastName;
    private String gender;
    private String email;
    private Department dept;


    public Employee() {

    }

    public Employee( String lastName, String gender, String email) {

        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
    }

    public Employee(Integer id, String lastName, String gender, String email, Department dept) {
        this.id = id;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.dept = dept;
    }
}
