package com.zhang.spring.beans;

import lombok.Data;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.spring.beans
 * @date:2021/1/5
 */
@Data
public class Emp {
    private Integer id;
    private String name;
    private Dept dept;
}
