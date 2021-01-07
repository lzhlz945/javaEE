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
   Employee getId4(Integer id);
   Employee selectByDiscriminator(Integer id);

   List<Employee> selectByDeptId(Integer deptId);
}
