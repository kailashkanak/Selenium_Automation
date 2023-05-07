package com.cloudTech.cloudtechexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloudTech.cloudtechexample.entity.Employee;
import com.cloudTech.cloudtechexample.service.EmployeeServiceImpl;

@RestController
public class EmployeeController {
	private EmployeeServiceImpl employeeServiceImpl;
	@GetMapping("/employee/save")
	public void saveEmployee(Employee employee) {
		Employee emp = new Employee();
		emp.setId(1);
		emp.setFirstName("kailash");
		emp.setLastName("Kanak");
		emp.setAddress("Hajipur");
		employeeServiceImpl.saveEmployee(emp);
		
	}
//	private Employee setEmployeeData() {
//		Employee emp = new Employee();
//		emp.setId(1);
//		emp.setFirstName("kailash");
//		emp.setLastName("Kanak");
//		emp.setAddress("Hajipur");
//		return emp;
//	}

}
