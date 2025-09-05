package com.javaweb.repository.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "khachhang")
public class KhachHangEntity {

	@Id
	private String idKhachHang;

	@Column(name = "tenKhachHang")
	private String tenKhachHang;

	@Column(name = "sdtKhachHang")
	private String sdtKhachHang;

	@Column(name = "email")
	private String email;

	@OneToMany(mappedBy = "khachHang")
	private List<NhanVienKhachHangEntity> nvkhs = new ArrayList<NhanVienKhachHangEntity>();

	public String getIdKhachHang() {
		return idKhachHang;
	}

	public void setIdKhachHang(String idKhachHang) {
		this.idKhachHang = idKhachHang;
	}

	public String getTenKhachHang() {
		return tenKhachHang;
	}

	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}

	public String getSdtKhachHang() {
		return sdtKhachHang;
	}

	public void setSdtKhachHang(String sdtKhachHang) {
		this.sdtKhachHang = sdtKhachHang;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<NhanVienKhachHangEntity> getNvkhs() {
		return nvkhs;
	}

	public void setNvkhs(List<NhanVienKhachHangEntity> nvkhs) {
		this.nvkhs = nvkhs;
	}

}
