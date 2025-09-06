package com.javaweb.api.model;

import java.sql.Date;

public class BuildingRequestDTO {
	private String idToaNha;
	private String tenNha;
	private String idQuan;
	private String phuong;
	private String duong;
	private String ketCau;
	private Integer soTangHam;
	private Float dienTichSan;
	private String huong;
	private Float giaThue;
	private String moTaGia;
	private Float phiDichVu;
	private Float phiOto;
	private Float phiNgoaiGio;
	private Float tienDien;
	private Float datCoc;
	private Float thanhToan;
	private Date thoiHanThue;
	private Date thoiGianTrangTri;
	private Float phiMoiGioi;
	private String idLoaiToaNha;
	private String ghiChu;

	public BuildingRequestDTO() {
		super();
	}

	public BuildingRequestDTO(String idToaNha, String tenNha, String idQuan, String phuong, String duong, String ketCau,
			int soTangHam, float dienTichSan, String huong, float giaThue, String moTaGia, float phiDichVu,
			float phiOto, float phiNgoaiGio, float tienDien, float datCoc, float thanhToan, Date thoiHanThue,
			Date thoiGianTrangTri, float phiMoiGioi, String idLoaiToaNha, String ghiChu) {
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

	public Integer getSoTangHam() {
		return soTangHam;
	}

	public void setSoTangHam(Integer soTangHam) {
		this.soTangHam = soTangHam;
	}

	public Float getDienTichSan() {
		return dienTichSan;
	}

	public void setDienTichSan(Float dienTichSan) {
		this.dienTichSan = dienTichSan;
	}

	public String getHuong() {
		return huong;
	}

	public void setHuong(String huong) {
		this.huong = huong;
	}

	public Float getGiaThue() {
		return giaThue;
	}

	public void setGiaThue(Float giaThue) {
		this.giaThue = giaThue;
	}

	public String getMoTaGia() {
		return moTaGia;
	}

	public void setMoTaGia(String moTaGia) {
		this.moTaGia = moTaGia;
	}

	public Float getPhiDichVu() {
		return phiDichVu;
	}

	public void setPhiDichVu(Float phiDichVu) {
		this.phiDichVu = phiDichVu;
	}

	public Float getPhiOto() {
		return phiOto;
	}

	public void setPhiOto(Float phiOto) {
		this.phiOto = phiOto;
	}

	public Float getPhiNgoaiGio() {
		return phiNgoaiGio;
	}

	public void setPhiNgoaiGio(Float phiNgoaiGio) {
		this.phiNgoaiGio = phiNgoaiGio;
	}

	public Float getTienDien() {
		return tienDien;
	}

	public void setTienDien(Float tienDien) {
		this.tienDien = tienDien;
	}

	public Float getDatCoc() {
		return datCoc;
	}

	public void setDatCoc(Float datCoc) {
		this.datCoc = datCoc;
	}

	public Float getThanhToan() {
		return thanhToan;
	}

	public void setThanhToan(Float thanhToan) {
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

	public Float getPhiMoiGioi() {
		return phiMoiGioi;
	}

	public void setPhiMoiGioi(Float phiMoiGioi) {
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
