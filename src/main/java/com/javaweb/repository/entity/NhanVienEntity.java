package com.javaweb.repository.entity;

public class NhanVienEntity {
	private String idNhanVien, tenNhanVien, sdtNhanVien, email, username, password;

	public NhanVienEntity() {
		super();
	}

	public NhanVienEntity(String idNhanVien, String tenNhanVien, String sdtNhanVien, String email, String username,
			String password) {
		super();
		this.idNhanVien = idNhanVien;
		this.tenNhanVien = tenNhanVien;
		this.sdtNhanVien = sdtNhanVien;
		this.email = email;
		this.username = username;
		this.password = password;
	}

	public String getIdNhanVien() {
		return idNhanVien;
	}

	public void setIdNhanVien(String idNhanVien) {
		this.idNhanVien = idNhanVien;
	}

	public String getTenNhanVien() {
		return tenNhanVien;
	}

	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}

	public String getSdtNhanVien() {
		return sdtNhanVien;
	}

	public void setSdtNhanVien(String sdtNhanVien) {
		this.sdtNhanVien = sdtNhanVien;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
