package com.zhang.spring.entity;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.spring.entity
 * @date:2021/1/5
 */

public class Student {

    private String name;
    private Integer age;
    private School school;

    public Student() {
    }

    public Student(String name, Integer age, School school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
