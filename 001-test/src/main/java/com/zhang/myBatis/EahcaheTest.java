package com.zhang.myBatis;

import com.zhang.mapper.EmployeeMapper1;
import com.zhang.tx.bean.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.lf5.util.Resource;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.myBatis
 * @date:2021/4/19
 */
public class EahcaheTest {

    public SqlSessionFactory getSqlSession() throws IOException {
        String resource="mybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        return sessionFactory;

    }

    /**
     * 测试一级缓存失效场景
     * 一：sqlSession不同
     * 二：之间执行了curd
     * 三：查询条件不同
     * 四：clear清除了缓存
     */
    @Test
    public void TestYJhc() throws IOException {

        SqlSessionFactory sqlSession = getSqlSession();
        SqlSession sqlSession1 = sqlSession.openSession();
        EmployeeMapper1 mapper1 = sqlSession1.getMapper(EmployeeMapper1.class);
        EmployeeMapper1 mapper2 = sqlSession1.getMapper(EmployeeMapper1.class);
        mapper1.getEmps();

        mapper2.getEmps();

    }


}
