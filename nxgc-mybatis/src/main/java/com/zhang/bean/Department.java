package com.zhang.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.bean
 * @date:2020/12/22
 */
@Data
public class Department implements Serializable {
    private Integer id;
    private String deptName;


}
