package com.reveture.controller;



import java.util.List;


import com.reveture.models.Employee;
import com.reveture.services.EmployeeService;

public class EmployeeController {
	
	private static EmployeeService employeeService = new EmployeeService();
	
	public void showAllEmployee() {
	
	List<Employee> employees = employeeService.getAllEmployees();
	
	
	for(Employee empl:employees) {
		
		System.out.println(empl);
	}
	
	

    }

}
