package com.javaweb.repository.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Repository;

import com.javaweb.repository.DienTichThueRepository;
import com.javaweb.utils.ConnectionJDBCUtils;

@Repository
public class DienTichThueRepositoryImpl implements DienTichThueRepository{

	@Override
	public String getDienTichThue(String idToaNha) {
		String result = "";
		String sql = "SELECT * FROM dientichthue dtt WHERE dtt.idToaNha = '" +  idToaNha + "' ";
		System.out.println(sql);
		try (Connection conn = ConnectionJDBCUtils.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql) ) {
			while (rs.next()) {
				result += rs.getString("dienTich") + ", ";
			}
			result.substring(0, result.length()-3);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Connected database failed...");
		}
		return result;
	}

}
