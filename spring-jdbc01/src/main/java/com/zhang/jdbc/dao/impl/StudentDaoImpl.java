package com.zhang.jdbc.dao.impl;

import com.zhang.jdbc.dao.StudentDao;
import com.zhang.jdbc.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.jdbc.dao.impl
 * @date:2021/1/7
 */
@Repository
public class StudentDaoImpl implements StudentDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    //批量添加
    @Override
    public void insertStudent(Student[] student) {
        List<Object[]> list=new ArrayList<>();
        Object[] args1=new Object[]{student[0].getName(),student[0].getStatus()};
        Object[] args2=new Object[]{student[1].getName(),student[1].getStatus()};
        Object[] args3=new Object[]{student[2].getName(),student[2].getStatus()};

            list.add(args1);
            list.add(args2);
            list.add(args3);
        String sql="insert into student(name,status) values(?,?)";
        jdbcTemplate.batchUpdate(sql,list);
    }

    //修改
    @Override
    public void updateStudent(Student student) {

        String sql="update student set name=?,status=? where id=?";

        jdbcTemplate.update(sql,student.getName(),student.getStatus(),student.getId());
    }

    //删除

    @Override
    public void deleteStudent(Integer id) {
        String sql="delete from student where id=?";
        jdbcTemplate.update(sql,id);
    }

    //返回总条数

    @Override
    public Long returnCount() {
        String sql="select count(*) from student";
        //参数1：sql
        //参数2：返回值类型
        return jdbcTemplate.queryForObject(sql,Long.class);
    }

    //查询返回对象

    @Override
    public Student selectById(Integer id) {
        String sql="select * from student where id=?";
        //第二个参数：RowMapper 是接口，针对返回不同类型数据，使用这个接口里面实现类完成
        //数据封装
        return jdbcTemplate.queryForObject(sql,new
                BeanPropertyRowMapper<Student>(Student.class),id);
    }
}
