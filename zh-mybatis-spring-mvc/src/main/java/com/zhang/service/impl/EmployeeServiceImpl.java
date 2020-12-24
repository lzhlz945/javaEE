package com.zhang.service.impl;

import com.zhang.bean.Employee;
import com.zhang.dao.EmployeeMapper;
import com.zhang.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.service.impl
 * @date:2020/12/24
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;
    @Override
    public List<Employee> getEmps() {
        List<Employee> list= employeeMapper.getEmps();
        return list;

    }
}
