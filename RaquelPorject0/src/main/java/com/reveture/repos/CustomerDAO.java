package com.reveture.repos;

import java.util.List;

import com.reveture.models.Customer;

public interface CustomerDAO {
	
	public List<Customer>findAll();
	
	public Customer findCustomerAccount(int id);
	
	public boolean addCustomerAccount(Customer customer); // make sure it works first
	
	public boolean createSavingAccount(int id);
	
	public boolean createCheckingAccount(int id);
	
	public boolean updateSavingAccount(int id, double amount);
	
	public boolean updateCheckingAccount(int id, double amount);
	
	public void showBalanceAccount(int id);
	
	public boolean transferMoneyAcccount(int id);

	Customer findCustomer(int id);

}
