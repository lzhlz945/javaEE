package com.zhang.mapper;

import com.zhang.bean.Employee;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

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
