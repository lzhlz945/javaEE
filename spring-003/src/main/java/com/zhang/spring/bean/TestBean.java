package com.zhang.spring.bean;

import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.spring.bean
 * @date:2021/1/6
 */
@Data
public class TestBean implements BeanPostProcessor {
    private String name;

    public void setName(String name) {
        this.name = name;
        System.out.println("第二步set属性");
    }

    public TestBean() {
        System.out.println("第一步无参构造");
    }

    public void initMethod(){
        System.out.println("第三部初始化方法");

    }

    public void destroyMethod(){
        System.out.println("第五步销毁对象");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("初始化方法之前做什么");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("初始化方法之后做什么");
        return bean;
    }
}
