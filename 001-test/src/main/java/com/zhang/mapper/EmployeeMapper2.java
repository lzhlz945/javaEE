package com.zhang.mapper;

import com.zhang.bean.Employee;
import org.apache.ibatis.annotations.Param;

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
    List<Employee> getEmployee4(Employee employee);
    List<Employee> getEmployee2(Employee employee);
    void updateById(Employee employee);
    void insert1(@Param("emps") List<Employee> list);
    void insert2(@Param("emps") List<Employee> list);

}
