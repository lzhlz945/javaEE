package com.zhang;

import static org.junit.Assert.assertTrue;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhang.mapper.EmployeeMapper1;
import com.zhang.tx.bean.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.UUID;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    public SqlSessionFactory getFactory() throws IOException {
        String resources="mybatis-config.xml";
        InputStream stream = Resources.getResourceAsStream(resources);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(stream);
        return factory;
    }

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void testPlugin() throws Exception{
        SqlSessionFactory factory = getFactory();
        SqlSession sqlSession = factory.openSession();
        EmployeeMapper1 mapper = sqlSession.getMapper(EmployeeMapper1.class);
        Employee id = mapper.getId(1);
        System.out.println(id);
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void testPageH() throws IOException{
        SqlSessionFactory factory = getFactory();

        SqlSession sqlSession = factory.openSession();

        EmployeeMapper1 mapper = sqlSession.getMapper(EmployeeMapper1.class);

        Page<Employee> page=PageHelper.startPage(5,1);
        List<Employee> employee = mapper.selectByDeptId(1);
        for (Employee e : employee) {
            System.out.println(e);

        }
        PageInfo<Employee> pageInfo=new PageInfo<Employee>(employee,5);
        System.out.println(employee);
        System.out.println(page.getPageNum());
        System.out.println(pageInfo.getNavigatePages());

        sqlSession.commit();
        sqlSession.close();


    }

    @Test
    public void testBath() throws IOException{
        SqlSessionFactory factory = getFactory();

        SqlSession sqlSession = factory.openSession(ExecutorType.BATCH);

        EmployeeMapper1 mapper = sqlSession.getMapper(EmployeeMapper1.class);

        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            mapper.addBath(new Employee(UUID.randomUUID().toString().substring(0, 5), "1", "name+"+i+"+@qq.com"));
        }


        long end = System.currentTimeMillis();
        System.out.println("时间:"+(start-end));

        List<Employee> employee = mapper.selectByDeptId(1);


        sqlSession.commit();
        sqlSession.close();


    }
}
