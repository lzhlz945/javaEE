package com.zhang.bean;

import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.bean
 * @date:2020/12/21
 */
@Data
//@Alias("qq") 第三种：类上注解的形式
public class Employee {
    private Integer id;
    private String lastName;
    private char gender;
    private String email;
}