package com.javaweb.repository.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "nhanvien")
public class NhanVienEntity {
//	private String idNhanVien, tenNhanVien, sdtNhanVien, email, username, password;

	@Id
	private String idNhanVien;

	@Column(name = "tenNhanVien")
	private String tenNhanVien;

	@Column(name = "sdtNhanVien")
	private String sdtNhanVien;

	@Column(name = "email")
	private String email;

	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;

	@ManyToMany(mappedBy = "nhanViens")
	private List<BuildingEntity> buildings = new ArrayList<BuildingEntity>();

	@ManyToMany
	@JoinTable(name = "nhanvien_role", joinColumns = @JoinColumn(name = "idNhanVien"), inverseJoinColumns = @JoinColumn(name = "idRole"))
	private List<RoleEntity> roles = new ArrayList<RoleEntity>();

	@OneToMany(mappedBy = "nhanVien")
	private List<NhanVienKhachHangEntity> nvkhs = new ArrayList<NhanVienKhachHangEntity>();

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

	public List<BuildingEntity> getBuildings() {
		return buildings;
	}

	public void setBuildings(List<BuildingEntity> buildings) {
		this.buildings = buildings;
	}

	public List<RoleEntity> getRoles() {
		return roles;
	}

	public void setRoles(List<RoleEntity> roles) {
		this.roles = roles;
	}

	public List<NhanVienKhachHangEntity> getNvkhs() {
		return nvkhs;
	}

	public void setNvkhs(List<NhanVienKhachHangEntity> nvkhs) {
		this.nvkhs = nvkhs;
	}

}
