package com.zhang.spring;

import static org.junit.Assert.assertTrue;

import com.zhang.spring.autowire.Emp;
import com.zhang.spring.bean.MyBean;
import com.zhang.spring.bean.TestBean;
import lombok.Data;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * Unit test for simple App.
 */
public class AppTest

{
    private ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("application-003.xml");
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }


    @Test
    public void test01(){
        TestBean testBean = context.getBean("testBean", TestBean.class);
        System.out.println("第四步创建对象");
        testBean.getName();
        context.close();

    }

    /**
     * 自动注入：
     * byName:根据属性和id名一致
     * byType:属性的类型一致，只匹配一个
     */
    @Test
    public void test02(){
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("autowire.xml");
        Emp testBean = context.getBean("emp2", Emp.class);

        System.out.println(testBean);
    }

    /**
     *测试连接池
     */
    @Test
    public void test03() throws SQLException {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("properties-spring.xml");
        DataSource dataSource = context.getBean("dataSource", DataSource.class);

        System.out.println(dataSource.getConnection());
    }


}
