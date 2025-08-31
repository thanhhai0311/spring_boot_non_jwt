package com.javaweb.repository.entity;

public class QuanEntity {
	private String idQuan, codeQuan, tenQuan;

	public QuanEntity() {
		super();
	}

	public QuanEntity(String idQuan, String codeQuan, String tenQuan) {
		super();
		this.idQuan = idQuan;
		this.codeQuan = codeQuan;
		this.tenQuan = tenQuan;
	}

	public String getIdQuan() {
		return idQuan;
	}

	public void setIdQuan(String idQuan) {
		this.idQuan = idQuan;
	}

	public String getCodeQuan() {
		return codeQuan;
	}

	public void setCodeQuan(String codeQuan) {
		this.codeQuan = codeQuan;
	}

	public String getTenQuan() {
		return tenQuan;
	}

	public void setTenQuan(String tenQuan) {
		this.tenQuan = tenQuan;
	}

}
