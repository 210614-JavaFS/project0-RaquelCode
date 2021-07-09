package com.reveture.UtilsDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionDB {
	
	
public static Connection getConnection() throws SQLException {
		
		//For many frameworks using JDBC it is necessary to "register" the driver 
		//in order for the framework to be aware of it. 
		try {
			Class.forName("org.postgresql.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url = "jdbc:postgresql://database-1.ceux8nympyyb.us-west-1.rds.amazonaws.com";
		String username = "postgres"; //It is possible to use env variables to hide this information
		String password = "password"; // you would access them with System.getenv("var-name");
		
		return DriverManager.getConnection(url, username, password);
	}

}
