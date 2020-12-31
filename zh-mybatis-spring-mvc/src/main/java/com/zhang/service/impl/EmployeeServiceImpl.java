package com.zhang.service.impl;

import com.zhang.bean.Employee;
import com.zhang.dao.EmployeeMapper;
import com.zhang.service.EmployeeService;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.service.impl
 * @date:2020/12/24
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Resource
    private EmployeeMapper employeeMapper;
    @Autowired
    private SqlSessionTemplate sqlSession;
    @Override
    public List<Employee> getEmps() {


        /*EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        for (int i = 0; i < 1000; i++) {

        mapper.addEmps(new Employee(UUID.randomUUID().toString().substring(0,4),"1","wsw"));
        }*/
        List<Employee> list= employeeMapper.getEmps();
        return list;

    }
}
