package com.reveture.models;

import java.util.Objects;

public class Employee {
	
	private int accountID;
	private String fullName;
	private String userName;
	private String password;
	private int accountLevel;
	private String accountType;
	private Double accountBalance;
	public Employee(int accountID, String fullName, String userName, String password, int accountLevel,
			String accountType, Double accountBalance) {
		super();
		this.accountID = accountID;
		this.fullName = fullName;
		this.userName = userName;
		this.password = password;
		this.accountLevel = accountLevel;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}
	public Employee() {
		super();
		
		
		// TODO Auto-generated constructor stub
		
	}
	
	
	public int getAccountID() {
		return accountID;
	}
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAccountLevel() {
		return accountLevel;
	}
	public void setAccountLevel(int accountLevel) {
		this.accountLevel = accountLevel;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public Double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(Double accountBalance) {
		this.accountBalance = accountBalance;
	}
	@Override
	public int hashCode() {
		return Objects.hash(accountBalance, accountID, accountLevel, accountType, fullName, password, userName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(accountBalance, other.accountBalance) && accountID == other.accountID
				&& Objects.equals(accountLevel, other.accountLevel) && Objects.equals(accountType, other.accountType)
				&& Objects.equals(fullName, other.fullName) && Objects.equals(password, other.password)
				&& Objects.equals(userName, other.userName);
	}
	@Override
	public String toString() {
		return "Employee [accountID=" + accountID + ", fullName=" + fullName + ", userName=" + userName + ", password="
				+ password + ", accountLevel=" + accountLevel + ", accountType=" + accountType + ", accountBalance="
				+ accountBalance + "]";
	}
	

}
