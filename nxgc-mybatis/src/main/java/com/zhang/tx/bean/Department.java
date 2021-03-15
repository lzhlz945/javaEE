package com.zhang.tx.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.tx.bean
 * @date:2020/12/22
 */
@Data
public class Department implements Serializable {
    private Integer id;
    private String deptName;


}
