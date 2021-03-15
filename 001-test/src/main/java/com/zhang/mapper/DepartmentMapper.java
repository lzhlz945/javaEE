package com.zhang.mapper;

import com.zhang.tx.bean.Department;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.mapper
 * @date:2020/12/22
 */
public interface DepartmentMapper {
    Department getById(Integer id);
    Department getByIdAndE(Integer id);
    Department getByIdStep(Integer id);
}
