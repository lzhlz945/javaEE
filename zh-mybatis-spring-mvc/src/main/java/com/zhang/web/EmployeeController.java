package com.zhang.web;

import com.zhang.bean.Employee;
import com.zhang.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.web
 * @date:2020/12/24
 */
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/getemps.do")
    public String emps(Model model){
      List<Employee> list1= employeeService.getEmps();
      model.addAttribute("allEmps",list1);

        return "list";

    }
}
