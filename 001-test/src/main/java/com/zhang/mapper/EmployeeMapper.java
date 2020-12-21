package com.zhang.mapper;

import com.zhang.bean.Employee;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.mapper
 * @date:2020/12/21
 */
public interface EmployeeMapper {

    Employee getId(Integer id);
    //add
    void insertEmployee(Employee employee);
    //update
    void updateEmployee(Employee employee);
    //delete
    void deleteEmployee(Employee employee);
}
