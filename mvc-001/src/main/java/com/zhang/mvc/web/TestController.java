package com.zhang.mvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/testParam",method = RequestMethod.GET)
    public String test04(@RequestParam(value = "id",defaultValue = "1",required = false) Integer id){
        System.out.println("RequestParam请求"+id);
        return "success";
    }

    @RequestMapping(value = "/testHeader")
    public String test05(@RequestHeader(value = "Accept-Language") String id){
        System.out.println("RequestHeader请求"+id);
        return "success";
    }

    @RequestMapping(value = "/testCookie")
    public String test06(@CookieValue(value = "JSESSIONID") String sessionId){
        System.out.println("CookieValue请求"+sessionId);
        return "success";
    }
}
