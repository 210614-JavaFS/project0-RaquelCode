package com.reveture.repos;

import java.util.List;

import com.reveture.models.Customer;
import com.reveture.models.Employee;

public interface EmployeedDAO {
	

	public List<Employee> findAll();
	
	public Employee findByname(int id);
	
	public Employee findEmployee(int id);
	
	public Customer findCustomer(int id);

}
