package com.javaweb.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConnectionJDBCUtils {
//	static final String DB_URL = "jdbc:mysql://localhost:3306/qltn";
//	static final String USER = "root";
//	static final String PASS = "123456";
	
	@Value("${spring.datasource.url}")
	private String DB_URL;
	
	@Value("${spring.datasource.username}")
	private String USER;
	
	@Value("${spring.datasource.password}")
	private String PASS;
		
	
	public Connection getConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println(DB_URL + " "  +  USER  + " " + PASS);
			return conn;
		}
		catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return conn;
	}
}
