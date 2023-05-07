package com.cloudTech.cloudtechexample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloudTech.cloudtechexample.dao.EmployeeDaoImpl;
import com.cloudTech.cloudtechexample.entity.Employee;

@Service
public class EmployeeServiceImpl {

	@Autowired
	private EmployeeDaoImpl daoImpl;
	
	public void saveEmployee(Employee employee) {
		daoImpl.saveEmployee(employee);
		
	}

}
