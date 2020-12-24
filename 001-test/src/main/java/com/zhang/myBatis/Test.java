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
        String resource = "myBits/mybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        return (new SqlSessionFactoryBuilder()).build(inputStream);
    }
    @org.junit.jupiter.api.Test
    public void test01() throws IOException {

        String resources= "myBits/mybatis.xml";
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

        String resources= "myBits/mybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(resources);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();

        try {
            EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
            System.out.println(mapper);
            Employee e = mapper.getId1(1);
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
            Employee employee = new Employee(77, "ss", "1", "12");
            mapper.insertEmployee1(employee);

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

            Employee employee = new Employee(1, "s", "0", null);
            List<Employee> sql = mapper.getSql();
            for (Employee employee1 : sql) {
                System.out.println(employee1);
            }

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

    /**
     * mybatis一级缓存 失效情况：
     * 1、sqlSession不同
     * 2、查询条件改变
     * 3、清空了一级缓存
     * 4、在第一次查之间进行了其他数据库curd操作
     * 5、
     * @throws IOException
     */
    @org.junit.jupiter.api.Test
    public void test10() throws IOException {
        SqlSessionFactory factory = this.getSqlSessionFactory();
        SqlSession sqlSession = factory.openSession();
        SqlSession sqlSession1 = factory.openSession();
        try {

         /*失败1
           EmployeeMapper  mapper = sqlSession.getMapper(EmployeeMapper .class);
            EmployeeMapper  mapper1 = sqlSession1.getMapper(EmployeeMapper .class);

            Employee employee = new Employee(1, "s", "0", null);
            Employee e1 = mapper.getId(1);
            Employee e2 = mapper1.getId(1);*/
            /*失败2
            EmployeeMapper  mapper = sqlSession.getMapper(EmployeeMapper .class);
            Employee e1 = mapper.getId(1);
            Employee e2 = mapper.getId(3);*/
          /*失败3
            EmployeeMapper  mapper = sqlSession.getMapper(EmployeeMapper .class);
            Employee employee = new Employee(122, "s", "0", null);
            Employee e1 = mapper.getId(1);
            mapper.insertEmployee1(employee);
            Employee e2 = mapper.getId(1);*/
          /*失败4
            EmployeeMapper  mapper = sqlSession.getMapper(EmployeeMapper .class);
            Employee e1 = mapper.getId(1);
            sqlSession.clearCache();
            Employee e2 = mapper.getId(1);
            System.out.println(e1);
            System.out.println(e2);*/

            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }

    /**
     *
     * @throws IOException
     * 二级缓存：（全局缓存）：基于namespace级别的缓存：一个namespace对应一个二级缓存：
     * 		工作机制：
     * 		1、一个会话，查询一条数据，这个数据就会被放在当前会话的一级缓存中；
     * 		2、如果会话关闭；一级缓存中的数据会被保存到二级缓存中；新的会话查询信息，就可以参照二级缓存中的内容；
     * 		3、sqlSession===EmployeeMapper==>Employee
     * 						DepartmentMapper===>Department
     * 			不同namespace查出的数据会放在自己对应的缓存中（map）
     * 			效果：数据会从二级缓存中获取
     * 				查出的数据都会被默认先放在一级缓存中。
     * 				只有会话提交或者关闭以后，一级缓存中的数据才会转移到二级缓存中
     * 		使用：
     * 			1）、开启全局二级缓存配置：<setting name="cacheEnabled" value="true"/>
     * 			2）、去mapper.xml中配置使用二级缓存：
     * 				<cache></cache>
     * 			3）、我们的POJO需要实现序列化接口
     * 		和缓存有关的设置/属性：
     *  		1）、cacheEnabled=true：false：关闭缓存（二级缓存关闭）(一级缓存一直可用的)
     *  		2）、每个select标签都有useCache="true"：
     *  				false：不使用缓存（一级缓存依然使用，二级缓存不使用）
     *  		3）、【每个增删改标签的：flushCache="true"：（一级二级都会清除）】
     *  				增删改执行完成后就会清楚缓存；
     *  				测试：flushCache="true"：一级缓存就清空了；二级也会被清除；
     *  				查询标签：flushCache="false"：
     *  					如果flushCache=true;每次查询之后都会清空缓存；缓存是没有被使用的；
     *  		4）、sqlSession.clearCache();只是清楚当前session的一级缓存；
     *  		5）、localCacheScope：本地缓存作用域：（一级缓存SESSION）；当前会话的所有数据保存在会话缓存中；
     *  							STATEMENT：可以禁用一级缓存；
     */
    @org.junit.jupiter.api.Test
    public void test11() throws IOException {
        SqlSessionFactory factory = this.getSqlSessionFactory();
        SqlSession sqlSession = factory.openSession();
        SqlSession sqlSession1 = factory.openSession();
        try {

            EmployeeMapper mapper1 = sqlSession.getMapper(EmployeeMapper.class);
            EmployeeMapper mapper2 = sqlSession1.getMapper(EmployeeMapper.class);
            Employee e1 = mapper1.getId(1);
            sqlSession.commit();
            Employee e2 = mapper2.getId(1);
            System.out.println(e1);
            System.out.println(e2);

            sqlSession1.commit();
        } finally {
            sqlSession.close();
            sqlSession1.close();
        }
    }
}
