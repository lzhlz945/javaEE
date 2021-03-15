package com.zhang.spring;

import static org.junit.Assert.assertTrue;

import com.zhang.spring.autowire.Dept;
import com.zhang.spring.autowire.Emp;
import com.zhang.spring.bean.MyBean;
import com.zhang.spring.bean.Service1;
import com.zhang.spring.bean.TestBean;
import com.zhang.spring.config.SpringConfig;
import com.zhang.spring.web.FirstController;
import lombok.Data;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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

    /**
     *测试注解
     */
    @Test
    public void test04() throws SQLException {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("annotation-001.xml");
        Service1 service1 = context.getBean("service1", Service1.class);

        String name = service1.getName();
        System.out.println(name);
    }

    /**
     *测试注解
     *  @Autowired  @Qualifier(value = "userServiceImpl1") @Resources
     */
    @Test
    public void test05() throws SQLException {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("annotation-002.xml");
        FirstController firstController = context.getBean("firstController", FirstController .class);
        firstController.test();


    }

    /**
     * 完成自定义配置
     */
    @Test
    public void test06(){
      ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        FirstController firstController = context.getBean("firstController", FirstController.class);
        firstController.test();

        Dept dept1 = context.getBean("dept", Dept.class);
        System.out.println(dept1);
        Emp e = context.getBean("emp", Emp.class);
        Dept dept = e.getDept();
        System.out.println(dept);

    }


}
