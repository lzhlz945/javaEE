package com.zhang.spring;

import static org.junit.Assert.assertTrue;

import com.zhang.spring.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
    public void testFirstSpring(){

        ApplicationContext context=new ClassPathXmlApplicationContext("application-01.xml");
        User user = context.getBean("user", User.class);
        Integer age = user.getAge();
        String name = user.getName();
        String s = user.helloSpring();
        System.out.println(s);
        System.out.println("age:" +age);
        System.out.println("name:" +name);

    }
}
