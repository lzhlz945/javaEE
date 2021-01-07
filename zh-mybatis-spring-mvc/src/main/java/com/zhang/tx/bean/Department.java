package com.zhang.tx.bean;

import lombok.Data;

import java.util.List;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.tx.bean
 * @date:2020/12/22
 */
@Data
public class Department {
    private Integer id;
    private String deptName;
    private List<Employee> emps;

    public Department(Integer id) {
        this.id = id;
    }
}
