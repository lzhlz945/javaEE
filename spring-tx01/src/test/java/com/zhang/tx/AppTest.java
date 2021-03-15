package com.zhang.tx;

import static org.junit.Assert.assertTrue;

import com.zhang.tx.service.impl.AccountServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    private ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
    private AccountServiceImpl accountService=context.getBean("accountServiceImpl",AccountServiceImpl.class);
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    /**
     * 基于注解的事务
     */
   /* @Test
    public void test01(){
        accountService.transfer();
    }*/

    /**
     * 基于xml的事务
     */
    @Test
    public void test02(){
        /*ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        AccountService accountService=context.getBean("accountServiceImpl",AccountServiceImpl.class);*/
        accountService.transfer();
    }
}
