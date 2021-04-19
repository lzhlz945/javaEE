package com.zhang.tx.bean;

import lombok.Data;

@Data
public class Employee {
	
	private Integer id;
	private String lastName;
	private String email;
	private String gender;
	private Integer did;

	public Employee() {
	}

	public Employee(String lastName, String email, String gender) {
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
	}

	public Integer getId() {
		return id;
	}

}
