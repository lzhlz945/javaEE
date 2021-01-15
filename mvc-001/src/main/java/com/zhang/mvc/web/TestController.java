package com.zhang.mvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

    @RequestMapping(value = "/test/get/{id}",method = RequestMethod.GET)
    public String test01(@PathVariable("id") Integer id){
        System.out.println(id);
        return "success";
    }

    @RequestMapping(value = "/test/post",method = RequestMethod.POST)
    public String test01(){
        System.out.println("post请求");
        return "success";
    }

    @RequestMapping(value = "/test/delete/{id}",method = RequestMethod.DELETE)
    public String test02(@PathVariable("id") Integer id){
        System.out.println("delete请求"+id);
        return "success";
    }

    @RequestMapping(value = "/test/put/{id}",method = RequestMethod.PUT)
    public String test03(@PathVariable("id") Integer id){
        System.out.println("put请求"+id);
        return "success";
    }
}
