package com.zhang.mvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.mvc.web
 * @date:2021/1/12
 */
@Controller
public class TestController {

    @RequestMapping("/hello.do")
    public String test(){

        return "success";
    }
}
