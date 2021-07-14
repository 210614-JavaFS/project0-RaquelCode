package com.reveture.repos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.reveture.models.Customer;
import com.reveture.models.Employee;
import com.reveture.utils.ConnectionUtil;

public class CustomerDAOImpl implements CustomerDAO{
	
	
	private static EmployeedDAO employeeDao = new EmployeeDAOImpl();
	
	public List<Customer>findAll(){
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "SELECT * FROM customer";
			
			Statement statement = conn.createStatement();
			
			ResultSet result = statement.executeQuery(sql);
			
			List<Customer> list = new ArrayList<>();
			
			//ResultSets have a cursor similarly to Scanners or other I/O classes. 
			while(result.next()) {
				Customer customer = new Customer();
				customer.setUsernameID(result.getInt("user_name"));
				customer.setFullName(result.getString("full_name"));
				customer.setAddress(result.getString("address"));
				customer.setPhoneNumber(result.getString("phone_number"));
				customer.setEmail(result.getString("email"));
				
				list.add(customer);
			}
			
			return list;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	@Override
	public Customer findCustomer(int id) {
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "SELECT * FROM customer WHERE customer_id = ?";
			
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setInt(1, id);	
			ResultSet result = statement.executeQuery();
			
			Customer customer = new Customer();
			//ResultSets have a cursor similarly to Scanners or other I/O classes. 
			while(result.next()) {
				
				customer.setUsernameID(result.getInt("user_name"));
				customer.setFullName(result.getString("full_name"));
				customer.setAddress(result.getString("address"));
				customer.setPhoneNumber(result.getString("phone_number"));
				customer.setEmail(result.getString("email"));
				
				
				
			}
			return customer;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	
	
	
	
	
	
	
	
	
	

	

	
	

	@Override
	public Customer findCustomerAccount(int id) {
		
		try(Connection conn = ConnectionUtil.getConnection()){
				String sql = "SELECT * FROM customer WHERE customer_id = ?";
				
				PreparedStatement statement = conn.prepareStatement(sql);
				statement.setInt(1, id);	
				ResultSet result = statement.executeQuery();
				
				Customer customer = new Customer();
				//ResultSets have a cursor similarly to Scanners or other I/O classes. 
				while(result.next()) {
					
					customer.setUsernameID(result.getInt("user_name"));
					customer.setFullName(result.getString("full_name"));
					customer.setAddress(result.getString("address"));
					customer.setPhoneNumber(result.getString("phone_number"));
					customer.setEmail(result.getString("email"));
					
					
					
				}
				return customer;
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
			return null;
			
		}

	@Override
	public boolean addCustomerAccount(Customer customer) {
		
		
			try(Connection conn = ConnectionUtil.getConnection()){
				String sql = "INSERT INTO customer(UsernameID, FullName,Address,Email,)\r\n"
						+ "	VALUES (?, ?,?,?,?, 1);";
				int index = 0;
				PreparedStatement statement = conn.prepareStatement(sql);
				
				statement.setInt(++index, customer.getUsernameID());
				statement.setString(++index, customer.getFullName());
				statement.setString(++index, customer.getAddress());
				statement.setString(++index, customer.getEmail());
				
				
				
				statement.execute();
				
				return true;
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
		
		
		
		
		return false;
	}

	@Override
	public boolean createSavingAccount(int id) {
		
		
		
			try(Connection conn = ConnectionUtil.getConnection()){
				String sql = "INSERT INTO account_balance(balance, account_id)\r\n"
						+ " SELECT 0, ? FROM customer WHERE user_name = ?;";
				PreparedStatement statement = conn.prepareStatement(sql);
				
				statement.setDouble(1, id);
				statement.setInt(2, id);
				statement.execute();
				
				return true;
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
		
			return false;
	
	}

	@Override
	public boolean createCheckingAccount(int id) {
		
		
			try(Connection conn = ConnectionUtil.getConnection()){
				String sql = "INSERT INTO account_type (balance, account_id)\r\n"
						+ " SELECT 0, ? FROM customer WHERE user_name = ?;";
				int index = 0;
				PreparedStatement statement = conn.prepareStatement(sql);
				
				statement.setDouble(++index, id);
				statement.setInt(++index, id);
				statement.execute();
				
				return true;
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
			return false;
		
		
	
	}

	@Override
	public boolean updateSavingAccount(int id, double amount) {
		
		try(Connection conn = ConnectionUtil.getConnection()){
				String sql = "UPDATE account_type\r\n"
						+ "SET account_balance = ? WHERE account_id = ? ";
				PreparedStatement statement = conn.prepareStatement(sql);
				
				statement.setDouble(1, amount);
				statement.setInt(2, id);
				statement.execute();
				
				return true;
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
		
			return false;
		
		
	}

	@Override
	public boolean updateCheckingAccount(int id, double amount) {
		
		
			try(Connection conn = ConnectionUtil.getConnection()){
				String sql = "UPDATE account_type\r\n"
						+ "SET balance = ? WHERE customer_id = ? ";
				PreparedStatement statement = conn.prepareStatement(sql);
				
				statement.setDouble(1, amount);
				statement.setInt(2, id);
				statement.execute();
				
				return true;
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
		
		
		
		return false;
	}

	@Override
	public void showBalanceAccount(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean transferMoneyAcccount(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
