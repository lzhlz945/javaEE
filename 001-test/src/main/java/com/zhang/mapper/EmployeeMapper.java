package com.zhang.mapper;

import com.zhang.bean.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.mapper
 * @date:2020/12/21
 */
public interface EmployeeMapper {

    Employee getId(Integer id);
    Employee getIdAndName1(Integer id,String lastName);
    Employee getIdAndName2(Integer id,String lastName);
    Employee getIdAndName3(@Param("id") Integer id, @Param("lastName") String lastName);
    Employee getIdAndName4(Map<String,Object> map);
    Employee getIdAndName5(List<Integer> list);
    //add
    void insertEmployee(Employee employee); void insertEmployee1(Employee employee);
    //update
    void updateEmployee(Employee employee);
    //delete
    void deleteEmployee(Employee employee);
}
