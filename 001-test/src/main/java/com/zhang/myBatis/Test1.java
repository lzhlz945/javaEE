package com.zhang.myBatis;

import lombok.Data;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.myBatis
 * @date:2020/12/25
 */
public class Test1 {


    @Test
    public void test01(){
        List<Student> list=new ArrayList<>();
        list.add(new Student(1,"001",22));
        list.add(new Student(2,"002",23));
        list.add(new Student(2,"002",23));
        list.add(new Student(2,"002",23));
        list.add(new Student(3,"003",24));
        list.add(new Student(3,"003",24));
        list.add(new Student(3,"003",24));


        Comparator<Student> studentComparator = Comparator.comparing((Student p) -> p.getId())
                .thenComparing(p -> p.getName())
                .thenComparingInt(p -> p.getAge());
        for (Student student : list) {
            int compare = studentComparator.compare(student, student);
            System.out.println(compare);
            System.out.println(student);
        }
        System.out.println(studentComparator);
        System.out.println("-------------------");
        Student student1 = new Student(1, "001", 22);
        Student student2 = new Student(2, "001", 22);
        int compare = studentComparator.compare(student1, student2);
        System.out.println(compare);


    }
}
@Data
class Student implements Comparator<Student> {
    private Integer id;
    private String name;
    private Integer age;

    public Student(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compare(Student o1, Student o2) {

        return 0;
    }
}
