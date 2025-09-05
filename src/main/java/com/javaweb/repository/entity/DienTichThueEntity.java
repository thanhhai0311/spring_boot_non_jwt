package com.javaweb.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "dientichthue")
public class DienTichThueEntity {
//	private String idDienTichThue, idToaNha, dienTich;

	@Id
	private String idDienTichThue;

//	@Column(name = "idToaNha")
//	private String idToaNha;

	@Column(name = "dienTich")
	private String dienTich;

	@ManyToOne
	@JoinColumn(name = "idToaNha")
	private BuildingEntity building;

	public String getIdDienTichThue() {
		return idDienTichThue;
	}

	public void setIdDienTichThue(String idDienTichThue) {
		this.idDienTichThue = idDienTichThue;
	}

	public String getDienTich() {
		return dienTich;
	}

	public void setDienTich(String dienTich) {
		this.dienTich = dienTich;
	}

	public BuildingEntity getBuilding() {
		return building;
	}

	public void setBuilding(BuildingEntity building) {
		this.building = building;
	}

}
