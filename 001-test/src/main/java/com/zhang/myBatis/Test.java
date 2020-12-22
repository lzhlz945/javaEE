package com.zhang.myBatis;

import com.zhang.bean.Employee;
import com.zhang.mapper.EmployeeMapper;
import com.zhang.mapper.EmployeeMapper1;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.myBatis
 * @date:2020/12/21
 */
public class Test {

    public Test() {
    }

    public SqlSessionFactory getSqlSessionFactory() throws IOException {
        String resource = "mybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        return (new SqlSessionFactoryBuilder()).build(inputStream);
    }
    @org.junit.jupiter.api.Test
    public void test01() throws IOException {

        String resources="mybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(resources);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession(true);

        try {
            Employee employee = session.selectOne("EmployeeMapper.getEmpById", 2);
            System.out.println(employee);
        } finally {
            session.close();
        }


    }
    @org.junit.jupiter.api.Test
    public void test02() throws IOException {

        String resources="mybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(resources);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();

        try {
            EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
            System.out.println(mapper);
            Employee e = mapper.getId(1);
            System.out.println(e);
        } finally {
            session.close();
        }


    }
    @org.junit.jupiter.api.Test
    public void test03() throws IOException {
        SqlSessionFactory factory = this.getSqlSessionFactory();
        SqlSession sqlSession = factory.openSession();
        try {
            EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
//            Employee employee = new Employee( 122,"qssss", null, "qq@qq.com");

//           mapper.insertEmployee2(employee);
//            System.out.println(employee.getId());

            /* mapper.updateEmployee(employee);*/
           /* mapper.deleteEmployee(employee);*/
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }


    }
    @org.junit.jupiter.api.Test
    public void test05() throws IOException {
        SqlSessionFactory factory = this.getSqlSessionFactory();
        SqlSession sqlSession = factory.openSession();
        try {
            EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
            Map<Integer, Employee> mapWEm = mapper.getMapWEm("%x%");
            for (Map.Entry<Integer, Employee> entry : mapWEm.entrySet()) {

                System.out.println(entry.getKey()+":"+entry.getValue());
            }
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }

    @org.junit.jupiter.api.Test
    public void test06() throws IOException {
        SqlSessionFactory factory = this.getSqlSessionFactory();
        SqlSession sqlSession = factory.openSession();
        try {

            EmployeeMapper1 mapper = sqlSession.getMapper(EmployeeMapper1.class);
            Employee employee = mapper.getId1(1);
            System.out.println(employee);
            System.out.println(employee.getDept().getId());
            System.out.println(employee.getDept().getDeptName());
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }


    @org.junit.jupiter.api.Test
    public void test04() throws IOException {
        SqlSessionFactory factory = this.getSqlSessionFactory();
        SqlSession sqlSession = factory.openSession();
        try {
            EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
           /* Employee employee = new Employee((Integer) 1, "qssss", "1", "qq@qq.com");

           *//* Map<String,Object> map=new HashMap<>();
            map.put("id",2);
            map.put("lastName","sa");
            Employee sa = mapper.getIdAndName4(map);*//*
            List<Integer> list=new ArrayList<>();
            list.add(2);
            list.add(3);
            list.add(6);
            Employee sa = mapper.getIdAndName5(list);
            System.out.println(sa);*/
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }


    }
}
