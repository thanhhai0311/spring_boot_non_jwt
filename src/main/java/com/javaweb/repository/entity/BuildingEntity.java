package com.javaweb.repository.entity;

import java.util.Date;

public class BuildingEntity {
	private String idToaNha;
	private String tenNha;
	private String idQuan;
	private String phuong;
	private String duong;
	private String ketCau;
	private int soTangHam;
	private float dienTichSan;
	private String huong;
	private String dienTichThue;
	private float giaThue;
	private String moTaGia;
	private float phiDichVu;
	private float phiOto;
	private float phiNgoaiGio;
	private float tienDien;
	private float datCoc;
	private float thanhToan;
	private Date thoiHanThue;
	private Date thoiGianTrangTri;
	private float phiMoiGioi;
	private String idLoaiToaNha;
	private String ghiChu;

	public BuildingEntity() {
		super();
	}

	public BuildingEntity(String idToaNha, String tenNha, String idQuan, String phuong, String duong, String ketCau,
			int soTangHam, float dienTichSan, String huong, String dienTichThue, float giaThue, String moTaGia,
			float phiDichVu, float phiOto, float phiNgoaiGio, float tienDien, float datCoc, float thanhToan,
			Date thoiHanThue, Date thoiGianTrangTri, float phiMoiGioi, String idLoaiToaNha,
			String ghiChu) {
		super();
		this.idToaNha = idToaNha;
		this.tenNha = tenNha;
		this.idQuan = idQuan;
		this.phuong = phuong;
		this.duong = duong;
		this.ketCau = ketCau;
		this.soTangHam = soTangHam;
		this.dienTichSan = dienTichSan;
		this.huong = huong;
		this.dienTichThue = dienTichThue;
		this.giaThue = giaThue;
		this.moTaGia = moTaGia;
		this.phiDichVu = phiDichVu;
		this.phiOto = phiOto;
		this.phiNgoaiGio = phiNgoaiGio;
		this.tienDien = tienDien;
		this.datCoc = datCoc;
		this.thanhToan = thanhToan;
		this.thoiHanThue = thoiHanThue;
		this.thoiGianTrangTri = thoiGianTrangTri;
		this.phiMoiGioi = phiMoiGioi;
		this.idLoaiToaNha = idLoaiToaNha;
		this.ghiChu = ghiChu;
	}

	public String getIdToaNha() {
		return idToaNha;
	}

	public void setIdToaNha(String idToaNha) {
		this.idToaNha = idToaNha;
	}

	public String getTenNha() {
		return tenNha;
	}

	public void setTenNha(String tenNha) {
		this.tenNha = tenNha;
	}

	public String getIdQuan() {
		return idQuan;
	}

	public void setIdQuan(String idQuan) {
		this.idQuan = idQuan;
	}

	public String getPhuong() {
		return phuong;
	}

	public void setPhuong(String phuong) {
		this.phuong = phuong;
	}

	public String getDuong() {
		return duong;
	}

	public void setDuong(String duong) {
		this.duong = duong;
	}

	public String getKetCau() {
		return ketCau;
	}

	public void setKetCau(String ketCau) {
		this.ketCau = ketCau;
	}

	public int getSoTangHam() {
		return soTangHam;
	}

	public void setSoTangHam(int soTangHam) {
		this.soTangHam = soTangHam;
	}

	public float getDienTichSan() {
		return dienTichSan;
	}

	public void setDienTichSan(float dienTichSan) {
		this.dienTichSan = dienTichSan;
	}

	public String getHuong() {
		return huong;
	}

	public void setHuong(String huong) {
		this.huong = huong;
	}

	public String getDienTichThue() {
		return dienTichThue;
	}

	public void setDienTichThue(String dienTichThue) {
		this.dienTichThue = dienTichThue;
	}

	public float getGiaThue() {
		return giaThue;
	}

	public void setGiaThue(float giaThue) {
		this.giaThue = giaThue;
	}

	public String getMoTaGia() {
		return moTaGia;
	}

	public void setMoTaGia(String moTaGia) {
		this.moTaGia = moTaGia;
	}

	public float getPhiDichVu() {
		return phiDichVu;
	}

	public void setPhiDichVu(float phiDichVu) {
		this.phiDichVu = phiDichVu;
	}

	public float getPhiOto() {
		return phiOto;
	}

	public void setPhiOto(float phiOto) {
		this.phiOto = phiOto;
	}

	public float getPhiNgoaiGio() {
		return phiNgoaiGio;
	}

	public void setPhiNgoaiGio(float phiNgoaiGio) {
		this.phiNgoaiGio = phiNgoaiGio;
	}

	public float getTienDien() {
		return tienDien;
	}

	public void setTienDien(float tienDien) {
		this.tienDien = tienDien;
	}

	public float getDatCoc() {
		return datCoc;
	}

	public void setDatCoc(float datCoc) {
		this.datCoc = datCoc;
	}

	public float getThanhToan() {
		return thanhToan;
	}

	public void setThanhToan(float thanhToan) {
		this.thanhToan = thanhToan;
	}

	public Date getThoiHanThue() {
		return thoiHanThue;
	}

	public void setThoiHanThue(Date thoiHanThue) {
		this.thoiHanThue = thoiHanThue;
	}

	public Date getThoiGianTrangTri() {
		return thoiGianTrangTri;
	}

	public void setThoiGianTrangTri(Date thoiGianTrangTri) {
		this.thoiGianTrangTri = thoiGianTrangTri;
	}

	public float getPhiMoiGioi() {
		return phiMoiGioi;
	}

	public void setPhiMoiGioi(float phiMoiGioi) {
		this.phiMoiGioi = phiMoiGioi;
	}

	public String getIdLoaiToaNha() {
		return idLoaiToaNha;
	}

	public void setIdLoaiToaNha(String idLoaiToaNha) {
		this.idLoaiToaNha = idLoaiToaNha;
	}

	public String getGhiChu() {
		return ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

}
