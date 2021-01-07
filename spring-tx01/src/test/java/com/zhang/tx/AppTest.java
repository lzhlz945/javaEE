package com.zhang.tx;

import static org.junit.Assert.assertTrue;

import com.zhang.bean.Account;
import com.zhang.service.AccountService;
import com.zhang.service.impl.AccountServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    private ApplicationContext context=new ClassPathXmlApplicationContext("tx-spring.xml");
    private AccountService accountService=context.getBean("accountServiceImpl",AccountServiceImpl.class);
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
        accountService.transfer();
    }
}
