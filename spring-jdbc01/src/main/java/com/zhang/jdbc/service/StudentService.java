package com.zhang.jdbc.service;

import com.zhang.jdbc.entity.Student;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.jdbc.service
 * @date:2021/1/7
 */
public interface StudentService {

    //批量添加
    void insertStudent(Student[] student);

    //修改
    void updateStudent(Student student);

    //删除
    void deleteStudent(Integer id);

    //查询返回某个值
    Long returnCount();

    //查询返回对象
    Student selectById(Integer id);

}
