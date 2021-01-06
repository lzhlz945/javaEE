package com.zhang.spring.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.spring.bean
 * @date:2021/1/6
 */
@Service(value = "service1")
@Data
public class Service1 {
    @Value("123")
    private String name;
}
