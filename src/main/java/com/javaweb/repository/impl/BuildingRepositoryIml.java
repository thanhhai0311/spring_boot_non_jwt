package com.javaweb.repository.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.javaweb.repository.BuildingRepository;
import com.javaweb.repository.entity.BuildingEntity;

@Repository
public class BuildingRepositoryIml implements BuildingRepository {

	static final String DB_URL = "jdbc:mysql://localhost:3306/qltn";
	static final String USER = "root";
	static final String PASS = "123456";

	@Override
	public List<BuildingEntity> findAllBuilding() {

		String sql = "SELECT * FROM ToaNha";
		List<BuildingEntity> result = new ArrayList<>();
		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {

			while (rs.next()) {
				BuildingEntity buildingEntity = new BuildingEntity();
				buildingEntity.setIdToaNha(rs.getString("idToaNha"));
				buildingEntity.setTenNha(rs.getString("tenNha"));
				buildingEntity.setIdQuan(rs.getString("idQuan"));
				buildingEntity.setPhuong(rs.getString("phuong"));
				buildingEntity.setDuong(rs.getString("duong"));
				buildingEntity.setKetCau(rs.getString("ketCau"));
				buildingEntity.setSoTangHam(rs.getInt("soTangHam"));
				buildingEntity.setDienTichSan(rs.getFloat("dienTichSan"));
				buildingEntity.setHuong(rs.getString("huong"));
				buildingEntity.setDienTichThue(rs.getString("dienTichThue"));
				buildingEntity.setGiaThue(rs.getFloat("giaThue"));
				buildingEntity.setMoTaGia(rs.getString("moTaGia"));
				buildingEntity.setPhiDichVu(rs.getFloat("phiDichVu"));
				buildingEntity.setPhiOto(rs.getFloat("phiOto"));
				buildingEntity.setPhiNgoaiGio(rs.getFloat("phiNgoaiGio"));
				buildingEntity.setTienDien(rs.getFloat("tienDien"));
				buildingEntity.setDatCoc(rs.getFloat("datCoc"));
				buildingEntity.setThanhToan(rs.getFloat("thanhToan"));
				buildingEntity.setThoiHanThue(rs.getDate("thoiHanThue"));
				buildingEntity.setThoiGianTrangTri(rs.getDate("thoiGianTrangTri"));
				buildingEntity.setPhiMoiGioi(rs.getFloat("phiMoiGioi"));
				buildingEntity.setIdLoaiToaNha(rs.getString("idLoaiToaNha"));
				buildingEntity.setGhiChu(rs.getString("ghiChu"));
				result.add(buildingEntity);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Connected database failed...");
		}
		return result;
	}

}
