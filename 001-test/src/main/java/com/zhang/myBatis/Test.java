package com.zhang.myBatis;

import com.zhang.bean.Department;
import com.zhang.bean.Employee;
import com.zhang.mapper.DepartmentMapper;
import com.zhang.mapper.EmployeeMapper;
import com.zhang.mapper.EmployeeMapper1;
import com.zhang.mapper.EmployeeMapper2;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

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
            Employee employee = mapper.selectByDiscriminator(2);
            System.out.println(employee);
            System.out.println(employee.getDept());

            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }

    @org.junit.jupiter.api.Test
    public void test07() throws IOException {
        SqlSessionFactory factory = this.getSqlSessionFactory();
        SqlSession sqlSession = factory.openSession();
        try {

            DepartmentMapper  mapper = sqlSession.getMapper(DepartmentMapper .class);
            Department byIdAndE = mapper.getByIdAndE(1);
            List<Employee> emps = byIdAndE.getEmps();
            for (Employee emp : emps) {
                System.out.println(emp);
            }

            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }

    @org.junit.jupiter.api.Test
    public void test08() throws IOException {
        SqlSessionFactory factory = this.getSqlSessionFactory();
        SqlSession sqlSession = factory.openSession();
        try {

            DepartmentMapper  mapper = sqlSession.getMapper(DepartmentMapper.class);
            Department byIdStep = mapper.getByIdStep(1);

            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }

    @org.junit.jupiter.api.Test
    public void test09() throws IOException {
        SqlSessionFactory factory = this.getSqlSessionFactory();
        SqlSession sqlSession = factory.openSession();
        try {

            EmployeeMapper2   mapper = sqlSession.getMapper(EmployeeMapper2 .class);
            List<Employee> list=new ArrayList<>();

            Employee employee = new Employee(1, null, "0", null);
            list.add(new Employee(47,"ss","1","ss@qq.com",new Department(3)));
            list.add(new Employee(48,"ssd","0","ssd@qq.com",new Department(4)));
            mapper.insert1(list);

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
            Employee employee = new Employee((Integer) 1, "qssss", "1", "qq@qq.com");

            Map<String,Object> map=new HashMap<>();
            map.put("id",2);
            map.put("lastName","sa");
            Employee sa = mapper.getIdAndName4(map);
            List<Integer> list=new ArrayList<>();
            list.add(2);
            list.add(3);
            list.add(6);
           /* Employee sa = mapper.getIdAndName5(list);
            System.out.println(sa);*/
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }


    }
}
