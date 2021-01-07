package com.zhang.jdbc.service.impl;

import com.zhang.jdbc.dao.StudentDao;
import com.zhang.jdbc.entity.Student;
import com.zhang.jdbc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.jdbc.service.impl
 * @date:2021/1/7
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    //批量添加
    @Override
    public void insertStudent(Student[] student) {
        studentDao.insertStudent(student);
    }

    //修改
    @Override
    public void updateStudent(Student student) {
        studentDao.updateStudent(student);
    }

    //删除
    @Override
    public void deleteStudent(Integer id) {
        studentDao.deleteStudent(id);
    }

    //返回总条数

    @Override
    public Long returnCount() {
        return studentDao.returnCount();
    }

    //查询返回对象
    @Override
    public Student selectById(Integer id) {
        return studentDao.selectById(id);
    }
}
