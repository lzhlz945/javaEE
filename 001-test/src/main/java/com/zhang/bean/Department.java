package com.zhang.bean;

import lombok.Data;

import java.util.List;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.bean
 * @date:2020/12/22
 */
@Data
public class Department {
    private Integer id;
    private String deptName;
    private List<Employee> emps;

}
