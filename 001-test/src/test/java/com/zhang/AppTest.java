package com.zhang;

import static org.junit.Assert.assertTrue;

import com.zhang.mapper.EmployeeMapper1;
import com.zhang.tx.bean.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void testPlugin() throws Exception{
        String resources="mybatis-config.xml";
        InputStream stream = Resources.getResourceAsStream(resources);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(stream);
        SqlSession sqlSession = factory.openSession();
        EmployeeMapper1 mapper = sqlSession.getMapper(EmployeeMapper1.class);
        Employee id = mapper.getId(1);
        System.out.println(id);

    }
}
