package com.zhang.spring.entity;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.spring.entity
 * @date:2021/1/5
 */
public class School {
    private String name;
    private Integer StuId;

    public School() {
    }

    public School(String name, Integer stuId) {
        this.name = name;
        StuId = stuId;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", StuId=" + StuId +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStuId() {
        return StuId;
    }

    public void setStuId(Integer stuId) {
        StuId = stuId;
    }
}
