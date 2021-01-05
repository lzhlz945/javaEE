import com.zhang.spring.Stu;
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
}
