package com.zhang.mvc.pojo;

import java.util.Arrays;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.mvc.pojo
 * @date:2021/1/15
 */
public class User {

    private String userName;
    private String password;
    private String name;
    private Integer age;
    private String email;
    private Adress adress;
    private String[] lll;

    public User() {
    }

    public User(String userName, String password, String name, Integer age, String email) {
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", adress=" + adress +
                ", lll=" + Arrays.toString(lll) +
                '}';
    }

    public String[] getLll() {
        return lll;
    }

    public void setLll(String[] lll) {
        this.lll = lll;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }
}
