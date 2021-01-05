package com.zhang.spring.entity;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.spring.entity
 * @date:2021/1/5
 */
public class User {
    private String name;
    private Integer age;
    public String helloSpring(){
        return this.name;
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

    public User() {
        System.out.println("无参构造被使用了----");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
