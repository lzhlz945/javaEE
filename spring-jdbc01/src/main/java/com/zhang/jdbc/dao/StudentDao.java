package com.zhang.jdbc.dao;

import com.zhang.jdbc.entity.Student;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.jdbc.dao
 * @date:2021/1/7
 */
public interface StudentDao {

    //批量添加
    void insertStudent(Student[] student);

    //修改
    void updateStudent(Student student);

    //删除
    void deleteStudent(Integer id);

    //返回总条数
    Long returnCount();

    //查询返回对象
    Student selectById(Integer id);
}
