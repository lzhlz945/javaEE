package com.zhang.jdbc;

import static org.junit.Assert.assertTrue;

import com.zhang.jdbc.entity.Student;
import com.zhang.jdbc.service.StudentService;
import com.zhang.jdbc.service.impl.StudentServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    private ApplicationContext context=new ClassPathXmlApplicationContext("jdbc-spring.xml");
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }


    //jdbc测试批量添加/删除/修该差不多/List<Object> 作为参数
    @Test
    public void test01(){
        StudentService studentService = context.getBean("studentServiceImpl", StudentServiceImpl.class);
        Student[] students=new Student[3];
        Student student = new Student();
        student.setName("zs");
        student.setStatus("1");
        Student student1 = new Student();
        student1.setName("zs");
        student1.setStatus("1");
        Student student2 = new Student();
        student2.setName("zs");
        student2.setStatus("1");
        students[0]=student;
        students[1]=student1;
        students[2]=student2;
        studentService.insertStudent(students);


    }
    //jdbc测试修改
    @Test
    public void test02(){
        StudentService studentService = context.getBean("studentServiceImpl", StudentServiceImpl.class);
        Student student = new Student();
        student.setId(1);
        student.setName("测试修改");
        student.setStatus("0修改状态");
        studentService.updateStudent(student);
    }

    //jdbc测试删除
    @Test
    public void test03(){
        StudentService studentService = context.getBean("studentServiceImpl", StudentServiceImpl.class);
        Student student = new Student();
        student.setId(1);
        studentService.deleteStudent(student.getId());
    }

    //jdbc测试count(*)
    @Test
    public void test04(){
        StudentService studentService = context.getBean("studentServiceImpl", StudentServiceImpl.class);

        Long aLong = studentService.returnCount();
        System.out.println(aLong);
    }

    //.queryForObject(sql,new
    //                BeanPropertyRowMapper<Student>(Student.class),id); 返回对象
    @Test
    public void test05(){

        StudentService studentService = context.getBean("studentServiceImpl", StudentServiceImpl.class);
        Student student = studentService.selectById(2);
        System.out.println(student);
    }
}
