package com.zhang.aop;



import static org.junit.Assert.assertTrue;

import com.zhang.aop.bean.Student;
import com.zhang.aop.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private ApplicationContext context=new ClassPathXmlApplicationContext("aspect01-spring.xml");
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }


    @Test
    public void testBeforan(){
        User user = context.getBean("user", User.class);
        user.add();
    }

    /**
     * 基于xml的aop
     *
     */
    @Test
    public void testBeforxml(){
        ApplicationContext context=new ClassPathXmlApplicationContext("aspect02-spring.xml");
        Student student = context.getBean("student", Student.class);
        student.add();
    }

    @Test
    public void testBeforxml1(){
        ApplicationContext context=new ClassPathXmlApplicationContext("aspect03xml-spring.xml");
        Student student = context.getBean("student", Student.class);
        student.add();
    }
}
