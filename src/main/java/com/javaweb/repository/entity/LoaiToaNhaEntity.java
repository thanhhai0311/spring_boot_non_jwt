package com.javaweb.repository.entity;

public class LoaiToaNhaEntity {
	private String idLoaiToaNha, tenLoaiToaNha;

	public LoaiToaNhaEntity() {
		super();
	}

	public LoaiToaNhaEntity(String idLoaiToaNha, String tenLoaiToaNha) {
		super();
		this.idLoaiToaNha = idLoaiToaNha;
		this.tenLoaiToaNha = tenLoaiToaNha;
	}

	public String getIdLoaiToaNha() {
		return idLoaiToaNha;
	}

	public void setIdLoaiToaNha(String idLoaiToaNha) {
		this.idLoaiToaNha = idLoaiToaNha;
	}

	public String getTenLoaiToaNha() {
		return tenLoaiToaNha;
	}

	public void setTenLoaiToaNha(String tenLoaiToaNha) {
		this.tenLoaiToaNha = tenLoaiToaNha;
	}

}
