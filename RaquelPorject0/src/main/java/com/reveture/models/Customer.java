package com.reveture.models;

import java.util.Objects;

public class Customer {
	
	private int UsernameID;
	private String FullName;
	private String Address;
	private String PhoneNumber;
	private String Email;
	public Customer(int usernameID, String fullName, String address, String phoneNumber, String email) {
		super();
		UsernameID = usernameID;
		FullName = fullName;
		Address = address;
		PhoneNumber = phoneNumber;
		Email = email;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getUsernameID() {
		return UsernameID;
	}
	public void setUsernameID(int usernameID) {
		UsernameID = usernameID;
	}
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Address, Email, FullName, PhoneNumber, UsernameID);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(Address, other.Address) && Objects.equals(Email, other.Email)
				&& Objects.equals(FullName, other.FullName) && Objects.equals(PhoneNumber, other.PhoneNumber)
				&& UsernameID == other.UsernameID;
	}
	@Override
	public String toString() {
		return "Customer [UsernameID=" + UsernameID + ", FullName=" + FullName + ", Address=" + Address
				+ ", PhoneNumber=" + PhoneNumber + ", Email=" + Email + "]";
	}
	public void setEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}
	public void setHasSaving(boolean boolean1) {
		// TODO Auto-generated method stub
		
	}
	public void setHasChecking(boolean boolean1) {
		// TODO Auto-generated method stub
		
	}
	
}
	