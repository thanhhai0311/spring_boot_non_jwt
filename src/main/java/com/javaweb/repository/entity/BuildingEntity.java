package com.javaweb.repository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "toanha")
public class BuildingEntity {

	@Id
	private String idToaNha;

	@Column(name = "tenNha")
	private String tenNha;

//	@Column(name = "idQuan")
//	private String idQuan;

	@Column(name = "phuong")
	private String phuong;

	@Column(name = "duong")
	private String duong;

	@Column(name = "ketCau")
	private String ketCau;

	@Column(name = "soTangHam")
	private int soTangHam;

	@Column(name = "dienTichSan")
	private float dienTichSan;

	@Column(name = "huong")
	private String huong;

//	@Column(name = "dienTichThue")
//	private String dienTichThue;

	@Column(name = "giaThue")
	private float giaThue;

	@Column(name = "moTaGia")
	private String moTaGia;

	@Column(name = "phiDichVu")
	private float phiDichVu;

	@Column(name = "phiOto")
	private float phiOto;

	@Column(name = "phiNgoaiGio")
	private float phiNgoaiGio;

	@Column(name = "tienDien")
	private float tienDien;

	@Column(name = "datCoc")
	private float datCoc;

	@Column(name = "thanhToan")
	private float thanhToan;

	@Temporal(TemporalType.DATE) // hoặc TIMESTAMP nếu cột có cả giờ/phút/giây
	@Column(name = "thoiHanThue")
	private Date thoiHanThue;

	@Temporal(TemporalType.DATE)
	@Column(name = "thoiGianTrangTri")
	private Date thoiGianTrangTri;

	@Column(name = "phiMoiGioi")
	private float phiMoiGioi;

//	@Column(name = "idLoaiToaNha")
//	private String idLoaiToaNha;

	@Column(name = "ghiChu", columnDefinition = "TEXT")
	private String ghiChu;

	@ManyToOne
	@JoinColumn(name = "idQuan")
	private QuanEntity quan;

	@ManyToOne
	@JoinColumn(name = "idLoaiToaNha")
	private LoaiToaNhaEntity loaiToaNha;

	@OneToMany(mappedBy = "building")
	private List<DienTichThueEntity> dienTichThue;

	@ManyToMany
	@JoinTable(name = "toanha_nhanvien", joinColumns = @JoinColumn(name = "idToaNha"), inverseJoinColumns = @JoinColumn(name = "idNhanVien"))
	private List<NhanVienEntity> nhanViens = new ArrayList<NhanVienEntity>();

	
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

	public String getGhiChu() {
		return ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	public QuanEntity getQuan() {
		return quan;
	}

	public void setQuan(QuanEntity quan) {
		this.quan = quan;
	}

	public LoaiToaNhaEntity getLoaiToaNha() {
		return loaiToaNha;
	}

	public void setLoaiToaNha(LoaiToaNhaEntity loaiToaNha) {
		this.loaiToaNha = loaiToaNha;
	}

	public List<DienTichThueEntity> getDienTichThue() {
		return dienTichThue;
	}

	public void setDienTichThue(List<DienTichThueEntity> dienTichThue) {
		this.dienTichThue = dienTichThue;
	}

	public List<NhanVienEntity> getNhanViens() {
		return nhanViens;
	}

	public void setNhanViens(List<NhanVienEntity> nhanViens) {
		this.nhanViens = nhanViens;
	}

}
