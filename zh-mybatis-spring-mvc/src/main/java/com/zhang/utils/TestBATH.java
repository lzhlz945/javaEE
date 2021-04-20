package com.zhang.utils;

import com.zhang.tx.bean.Employee;
import com.zhang.tx.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.utils
 * @date:2020/12/28
 */
@Controller
public class TestBATH {

    @Autowired
    private SqlSessionTemplate template;
    @Autowired
    private  EmployeeService employeeService;

    @Test
    public void test01(){



        List<Employee> emps = employeeService.getEmps();
        System.out.println(emps);


    }
}
