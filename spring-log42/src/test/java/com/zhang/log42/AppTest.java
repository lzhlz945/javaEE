package com.zhang.log42;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.context.support.GenericApplicationContext;

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

    /**
     * spring5新功能
     * Spring5 核心容器支持函数式风格 GenericApplicationContext
     */
    @Test
    public void test01(){
        GenericApplicationContext context=new GenericApplicationContext();
        //清空容器
        context.refresh();
        //参数1 ：全类名
        context.registerBean(User.class,()-> new User());
        User bean = context.getBean("com.zhang.log42.User", User.class);
        System.out.println(bean);
    }
}
