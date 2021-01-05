package com.zhang.spring;

import static org.junit.Assert.assertTrue;

import com.zhang.spring.entity.School;
import com.zhang.spring.entity.Student;
import com.zhang.spring.entity.Student1;
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

    /**
     * Di:(使用set and  get)属性注入
     */

    @Test
    public void testDi(){

        ApplicationContext context=new ClassPathXmlApplicationContext("application-01.xml");
        Student student = context.getBean("student", Student.class);
        Integer age = student.getAge();
        String name = student.getName();
        School school = student.getSchool();

        System.out.println(school);
        System.out.println("age:" +age);
        System.out.println("name:" +name);

        System.out.println("------------------------------");
        School school1 = context.getBean("school", School.class);
        String name1 = school1.getName();
        Integer stuId = school1.getStuId();
        System.out.println("name1:"+name1);
        System.out.println("stuId:"+stuId);

    }

    /**
     * 构造器注入
     */

    @Test
    public void testGzq(){
        ApplicationContext context=new ClassPathXmlApplicationContext("application-01.xml");

        Student1 student1 = context.getBean("student1", Student1.class);
        System.out.println(student1);



    }
    /**
     * IOC 操作 Bean 管理（xml 注入其他类型属性）
     * 1、字面量
     * （1）null 值
     * <!--null 值--> <property name="address">
     *  <null/>
     * </property> （2）属性值包含特殊符号
     * <!--属性值包含特殊符号
     *  1 把<>进行转义 &lt; &gt;
     *  2 把带特殊符号内容写到 CDATA
     * --><property name="address">
     *  <value><![CDATA[<<南京>>]]></value>
     * </property>
     */

    @Test
    public void testxq(){
        ApplicationContext context=new ClassPathXmlApplicationContext("application-01.xml");

        School school2 = context.getBean("school2", School.class);
        System.out.println(school2);


    }
}
