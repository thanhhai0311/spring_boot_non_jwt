package com.javaweb.api.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BuildingDTO {
	private String idToaNha;
	private String tenNha;
	private String diaChi;
	private Integer soTangHam;
	private Float dienTichSan;
	private String dienTichThue;
	private Float giaThue;
	private Float phiDichVu;
	private Float phiMoiGioi;
	private String LoaiToaNha;
	private List<String> tenNhanVien;
	private List<String> sdtNhanVien;

	public BuildingDTO() {
		super();
	}

	

	public BuildingDTO(String idToaNha, String tenNha, String diaChi, int soTangHam, float dienTichSan,
			String dienTichThue, float giaThue, float phiDichVu, float phiMoiGioi, String loaiToaNha,
			List<String> tenNhanVien, List<String> sdtNhanVien) {
		super();
		this.idToaNha = idToaNha;
		this.tenNha = tenNha;
		this.diaChi = diaChi;
		this.soTangHam = soTangHam;
		this.dienTichSan = dienTichSan;
		this.dienTichThue = dienTichThue;
		this.giaThue = giaThue;
		this.phiDichVu = phiDichVu;
		this.phiMoiGioi = phiMoiGioi;
		LoaiToaNha = loaiToaNha;
		tenNhanVien = new ArrayList<String>();
		sdtNhanVien = new ArrayList<String>();
		this.tenNhanVien = tenNhanVien;
		this.sdtNhanVien = sdtNhanVien;
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

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
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

	public float getPhiDichVu() {
		return phiDichVu;
	}

	public void setPhiDichVu(float phiDichVu) {
		this.phiDichVu = phiDichVu;
	}

	public float getPhiMoiGioi() {
		return phiMoiGioi;
	}

	public void setPhiMoiGioi(float phiMoiGioi) {
		this.phiMoiGioi = phiMoiGioi;
	}

	public String getLoaiToaNha() {
		return LoaiToaNha;
	}

	public void setLoaiToaNha(String loaiToaNha) {
		LoaiToaNha = loaiToaNha;
	}



	public List<String> getTenNhanVien() {
		return tenNhanVien;
	}



	public void setTenNhanVien(List<String> tenNhanVien) {
		//tenNhanVien = new ArrayList<String>();
		this.tenNhanVien = tenNhanVien;
	}



	public List<String> getSdtNhanVien() {
		return sdtNhanVien;
	}



	public void setSdtNhanVien(List<String> sdtNhanVien) {
		//sdtNhanVien = new ArrayList<String>();
		this.sdtNhanVien = sdtNhanVien;
	}

	
	
}
