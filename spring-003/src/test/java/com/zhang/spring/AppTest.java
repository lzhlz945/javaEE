package com.zhang.spring;

import static org.junit.Assert.assertTrue;

import com.zhang.spring.bean.MyBean;
import com.zhang.spring.bean.TestBean;
import lombok.Data;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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


}
