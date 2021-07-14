package com.reveture;

import com.reveture.controller.EmployeeController;


public class Driver {
	
	private static EmployeeController employeeController = new EmployeeController();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Here are your Home");
		
		employeeController.showAllEmployee();
		
	}

}
