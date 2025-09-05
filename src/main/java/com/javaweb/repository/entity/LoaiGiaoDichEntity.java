package com.javaweb.repository.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="loaigiaodich")
public class LoaiGiaoDichEntity {

	@Id
	private String idLoaiGiaoDich;
	
	@Column(name="tenLoaiGiaoDich")
	private String tenLoaiGiaoDich;
	
	@OneToMany(mappedBy = "loaiGiaoDich")
	private List<GiaoDichEntity> giaoDichs;

	public String getIdLoaiGiaoDich() {
		return idLoaiGiaoDich;
	}

	public void setIdLoaiGiaoDich(String idLoaiGiaoDich) {
		this.idLoaiGiaoDich = idLoaiGiaoDich;
	}

	public String getTenLoaiGiaoDich() {
		return tenLoaiGiaoDich;
	}

	public void setTenLoaiGiaoDich(String tenLoaiGiaoDich) {
		this.tenLoaiGiaoDich = tenLoaiGiaoDich;
	}

	public List<GiaoDichEntity> getGiaoDichs() {
		return giaoDichs;
	}

	public void setGiaoDichs(List<GiaoDichEntity> giaoDichs) {
		this.giaoDichs = giaoDichs;
	}
	
	
}
