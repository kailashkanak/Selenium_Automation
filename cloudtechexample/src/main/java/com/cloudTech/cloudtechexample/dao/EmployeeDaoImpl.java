package com.cloudTech.cloudtechexample.dao;

import org.springframework.stereotype.Component;

import com.cloudTech.cloudtechexample.entity.Employee;

@Component
public class EmployeeDaoImpl {
	
	public void saveEmployee(Employee employee) {
		System.out.println(employee.getFirstName());

	}

}
