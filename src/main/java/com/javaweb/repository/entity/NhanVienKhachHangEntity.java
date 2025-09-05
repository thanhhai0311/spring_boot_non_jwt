package com.javaweb.repository.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "nhanvien_khachhang")
public class NhanVienKhachHangEntity {
	@Id
	private String idNVKH;

	@ManyToOne
	@JoinColumn(name = "idNhanVien")
	private NhanVienEntity nhanVien;

	@ManyToOne
	@JoinColumn(name = "idKhachHang")
	private KhachHangEntity khachHang;

	@OneToMany(mappedBy = "nvkh")
	private List<GiaoDichEntity> giaoDichs = new ArrayList<GiaoDichEntity>();

	public String getIdNVKH() {
		return idNVKH;
	}

	public void setIdNVKH(String idNVKH) {
		this.idNVKH = idNVKH;
	}

	public NhanVienEntity getNhanVien() {
		return nhanVien;
	}

	public void setNhanVien(NhanVienEntity nhanVien) {
		this.nhanVien = nhanVien;
	}

	public KhachHangEntity getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(KhachHangEntity khachHang) {
		this.khachHang = khachHang;
	}

	public List<GiaoDichEntity> getGiaoDichs() {
		return giaoDichs;
	}

	public void setGiaoDichs(List<GiaoDichEntity> giaoDichs) {
		this.giaoDichs = giaoDichs;
	}

}
