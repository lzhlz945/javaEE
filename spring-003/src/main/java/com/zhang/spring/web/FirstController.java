package com.zhang.spring.web;

import com.zhang.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.spring.web
 * @date:2021/1/6
 */
@Controller(value = "firstController")
public class FirstController {

    @Autowired
    @Qualifier(value = "userServiceImpl1")
    private UserService userService;
    public void test(){
        userService.add();
    }

}
