package com.zhang.spring.autowire;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "emp")
@Data
public class Emp {
    @Autowired
    @Qualifier(value = "dept")
    private Dept dept;


    public void test() {
        System.out.println(dept);
    }
}
