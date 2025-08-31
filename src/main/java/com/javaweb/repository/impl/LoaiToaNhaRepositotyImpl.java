package com.javaweb.repository.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Repository;

import com.javaweb.repository.LoaiToaNhaRepository;

@Repository
public class LoaiToaNhaRepositotyImpl implements LoaiToaNhaRepository {

	static final String DB_URL = "jdbc:mysql://localhost:3306/qltn";
	static final String USER = "root";
	static final String PASS = "123456";
	
	
	@Override
	public String getTenById(String id) {
		// TODO Auto-generated method stub
		String result = "";
		// TODO Auto-generated method stub
		String sql = "SELECT tenLoaiToaNha FROM loaitoanha WHERE idLoaiToaNha = '" + id + "'";
		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql) ) {
			while (rs.next()) {
				result += rs.getString("tenLoaiToaNha");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Connected database failed...");
		}
		return result;
	}

}
