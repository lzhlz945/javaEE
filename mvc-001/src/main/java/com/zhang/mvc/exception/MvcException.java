package com.zhang.mvc.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.mvc.exception
 * @date:2021/1/20
 */
@ControllerAdvice
public class MvcException  {


    @ExceptionHandler(value = {ArithmeticException.class})
    public String arithmeticException(Exception e, Model model){
        System.out.println(e+"ArithmeticException");
        model.addAttribute("exception",e);
        return "error";
    }
}
