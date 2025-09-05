package com.javaweb.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "giaodich")
public class GiaoDichEntity {
	@Id
	private String idGiaoDich;

//	@Column(name="idNVKH")
//	private String idNVKH;
//	
	@ManyToOne
	@JoinColumn(name = "idNVKH")
	private NhanVienKhachHangEntity nvkh;

	@ManyToOne
	@JoinColumn(name = "idLoaiGiaoDich")
	private LoaiGiaoDichEntity loaiGiaoDich;

	public String getIdGiaoDich() {
		return idGiaoDich;
	}

	public void setIdGiaoDich(String idGiaoDich) {
		this.idGiaoDich = idGiaoDich;
	}

	public NhanVienKhachHangEntity getNvkh() {
		return nvkh;
	}

	public void setNvkh(NhanVienKhachHangEntity nvkh) {
		this.nvkh = nvkh;
	}

	public LoaiGiaoDichEntity getLoaiGiaoDich() {
		return loaiGiaoDich;
	}

	public void setLoaiGiaoDich(LoaiGiaoDichEntity loaiGiaoDich) {
		this.loaiGiaoDich = loaiGiaoDich;
	}

}
