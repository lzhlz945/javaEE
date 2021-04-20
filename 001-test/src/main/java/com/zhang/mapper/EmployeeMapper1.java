package com.zhang.mapper;

import com.zhang.tx.bean.Employee;

import java.util.List;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.mapper
 * @date:2020/12/21
 */
public interface EmployeeMapper1 {
   Employee getId(Integer id);
   Employee getId1(Integer id);
   Employee getId3(Integer id);
   List<Employee> getId4(String lastName);
   Employee selectByDiscriminator(Integer id);
   List<Employee> test3(Integer id);
   List<Employee> selectByDeptId(Integer deptId);

   void addBath(Employee employee);
   List<Employee> getEmps();

}
