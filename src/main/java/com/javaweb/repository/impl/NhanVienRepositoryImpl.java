package com.javaweb.repository.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.javaweb.repository.NhanVienRepository;

@Repository
public class NhanVienRepositoryImpl implements NhanVienRepository {

	
	static final String DB_URL = "jdbc:mysql://localhost:3306/qltn";
	static final String USER = "root";
	static final String PASS = "123456";
	
	
	@Override
	public List<String> getTenById(String idToaNha) {
		List<String> result = new ArrayList<String>();
		// TODO Auto-generated method stub
		String sql = "SELECT tenNhanVien FROM nhanvien nv JOIN toanha_nhanvien tnnv ON nv.idNhanVien = tnnv.idNhanVien JOIN toanha tn ON tn.idToaNha = tnnv.idToaNha WHERE tn.idToaNha = '" + idToaNha + "'";
		System.out.println(sql);
		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql) ) {
			while (rs.next()) {
				result.add(rs.getString("tenNhanVien"));
				//System.out.println(result);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Connected database failed...");
		}
		return result;
	}

	@Override
	public List<String> getSdtById(String idToaNha) {
		List<String> result = new ArrayList<String>();
		// TODO Auto-generated method stub
		String sql = "SELECT sdtNhanVien FROM nhanvien nv JOIN toanha_nhanvien tnnv ON nv.idNhanVien = tnnv.idNhanVien JOIN toanha tn ON tn.idToaNha = tnnv.idToaNha WHERE tn.idToaNha = '" + idToaNha + "'";
		System.out.println(sql);
		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql) ) {
			while (rs.next()) {
				result.add(rs.getString("sdtNhanVien"));
				//System.out.println(result);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Connected database failed...");
		}
		return result;
	}

	
	
}
