package com.zhang.mapper;


import com.zhang.tx.bean.Employee;

import java.util.List;

public interface EmployeeMapper {
	
	public Employee getEmpById(Integer id);

	List<Employee> getList();
	void add(Employee employee);

}
