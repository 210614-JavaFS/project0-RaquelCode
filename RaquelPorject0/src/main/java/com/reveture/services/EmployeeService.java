package com.reveture.services;

import java.util.List;

import com.reveture.models.Employee;
import com.reveture.repos.EmployeeDAOImpl;

public class EmployeeService {
	
	private static EmployeeDAOImpl employeeDao = new EmployeeDAOImpl();
	
	public List<Employee> getAllEmployees(){
		
	
		
		return employeeDao.findAll();
	}
	
	public Employee getEmployee(int id) {
		return employeeDao.findEmployee(id);
	
}


}
