package com.javaweb.repository.entity;

public class DienTichThueEntity {
	private String idDienTichThue, idToaNha, dienTich;

	public DienTichThueEntity() {
		super();
	}

	public DienTichThueEntity(String idDienTichThue, String idToaNha, String dienTich) {
		super();
		this.idDienTichThue = idDienTichThue;
		this.idToaNha = idToaNha;
		this.dienTich = dienTich;
	}

	public String getIdDienTichThue() {
		return idDienTichThue;
	}

	public void setIdDienTichThue(String idDienTichThue) {
		this.idDienTichThue = idDienTichThue;
	}

	public String getIdToaNha() {
		return idToaNha;
	}

	public void setIdToaNha(String idToaNha) {
		this.idToaNha = idToaNha;
	}

	public String getDienTich() {
		return dienTich;
	}

	public void setDienTich(String dienTich) {
		this.dienTich = dienTich;
	}

}
