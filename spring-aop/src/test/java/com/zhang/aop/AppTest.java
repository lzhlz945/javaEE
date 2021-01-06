package com.zhang.aop;



import static org.junit.Assert.assertTrue;

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
    public void testBefor(){
        User user = context.getBean("user", User.class);
        user.add();
    }
}
