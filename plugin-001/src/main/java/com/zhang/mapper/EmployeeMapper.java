package com.zhang.mapper;


import com.zhang.bean.Employee;

import java.util.List;

public interface EmployeeMapper {
	
	public Employee getEmpById(Integer id);

	List<Employee> getList();

}
