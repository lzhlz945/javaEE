package com.zhang.mapper;

import com.zhang.bean.Employee;

import java.util.List;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.mapper
 * @date:2020/12/23
 */
public interface EmployeeMapper2 {

    Employee getEmployee(Employee employee);
    Employee getEmployee1(Employee employee);
    List<Employee> getEmployee3(List<Integer> list);
    List<Employee> getEmployee2(Employee employee);
    void updateById(Employee employee);

}
