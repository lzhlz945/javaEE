package com.zhang.mapper;

import com.zhang.tx.bean.Employee;
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
public interface EmployeeMapper {
    //返回单挑map resultType="map"

    //返回map,list中的对象，resultType=bean.class
    @MapKey("email")
    Map<Integer,Employee> getMapWEm(String lastName);
    Employee getId(Integer id);
    Employee getId1(Integer id);
    Employee getIdAndName1(Integer id,String lastName);
    Employee getIdAndName2(Integer id,String lastName);
    Employee getIdAndName3(@Param("id") Integer id, @Param("lastName") String lastName);
    Employee getIdAndName4(Map<String,Object> map);
    Employee getIdAndName5(List<Integer> list);
    //add
    void insertEmployee(Employee employee);
    void insertEmployee1(Employee employee);
    void insertEmployee2(Employee employee);
    //update
    void updateEmployee(Employee employee);
    //delete
    void deleteEmployee(Employee employee);
}
