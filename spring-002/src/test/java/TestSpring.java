import com.zhang.spring.Cus;
import com.zhang.spring.Stu;
import com.zhang.spring.factoryBean.MyBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    /**
     * 测试集合、数组和map的属性注入
     */
    @Test
    public void testo1(){

        ApplicationContext context=new ClassPathXmlApplicationContext("application-002.xml");
        Stu bean = context.getBean("stu", Stu.class);
        System.out.println(bean.toString());


    }

  /**
     * 名称空间 util
   * <util:
     */
    @Test
    public void testUtil(){

        ApplicationContext context=new ClassPathXmlApplicationContext("application-002.xml");
        Stu bean = context.getBean("stu3", Stu.class);
        System.out.println(bean.toString());


    }

    /**
     *
   * factoryBean定义和返回的对象类型可以不一样
     */
    @Test
    public void testFactoryBean(){

        ApplicationContext context=new ClassPathXmlApplicationContext("factoryBean-config.xml");
        Cus bean = context.getBean("myBean", Cus.class);
        System.out.println(bean.toString());


    }
   /**
     *
     * bean的是单例还是？
     *
     */
    @Test
    public void testSingleTon(){

        ApplicationContext context=new ClassPathXmlApplicationContext("factoryBean-config.xml");
        Cus bean2 = context.getBean("cus", Cus.class);
        Cus bean1 = context.getBean("cus", Cus.class);
        System.out.println(bean1);
        System.out.println(bean2);
        System.out.println(bean1==bean2);


    }
}
