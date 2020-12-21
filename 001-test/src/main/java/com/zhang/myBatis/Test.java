package com.zhang.myBatis;

import com.zhang.bean.Employee;
import com.zhang.mapper.EmployeeMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

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
        SqlSession session = sqlSessionFactory.openSession();

        try {
            Employee employee = session.selectOne("EmployeeMapper.getEmpById", 1);
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
            Employee employee = new Employee((Integer) 1, "qssss", '1', "qq@qq.com");

            /*mapper.insertEmployee(employee);*/

           /* mapper.updateEmployee(employee);*/
            mapper.deleteEmployee(employee);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }


    }
}
