
  package com.reveture.repos;
  
  
 import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

 import com.reveture.models.Customer; 
 import com.reveture.models.Employee;
import com.reveture.utils.ConnectionUtil;
  
  
  public class EmployeeDAOImpl implements EmployeedDAO {

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "SELECT * FROM employee";
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			List<Employee> list = new ArrayList<>();
			
			
			while(result.next()) {
				
				
				Employee employee = new Employee();
				employee.setAccountID(result.getInt("account_id"));
				employee.setFullName(result.getString("full_name"));
				employee.setUserName(result.getString("user_name"));
				employee.setPassword(result.getString("pass_word"));
				employee.setAccountLevel(result.getInt("account_level"));
				employee.setAccountType(result.getString("account_type"));
				employee.setAccountBalance(result.getDouble("account_balance"));
				

				list.add(employee);
			}
			
			return list;
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
	return null;
	
	}
	
	public Employee findByname(int id){
  
	 try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "SELECT * FROM employee WHERE account_id = ?;";
			
			PreparedStatement statement = conn.prepareStatement(sql);
			
			//This is where SQL injection is checked for.
			statement.setInt(1, id);
			
			ResultSet result = statement.executeQuery();
			
			Employee employee = new Employee();
			
			//ResultSets have a cursor similarly to Scanners or other I/O classes. 
			while(result.next()) {
				
				employee.setAccountID(result.getInt("account_id"));
				employee.setFullName(result.getString("full_name"));
				employee.setUserName(result.getString("user_name"));
				employee.setPassword(result.getString("pass_word"));
				employee.setAccountLevel(result.getInt("account_leve"));
				employee.setAccountType(result.getString("account_type"));
				employee.setAccountBalance(result.getDouble("account_balance"));
				
			}
			
			
			
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
  

	@Override
	public Employee findEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer findCustomer(int id) {
		// TODO Auto-generated method stub
		return null;
	}
  
  
  
  }
  
  
 