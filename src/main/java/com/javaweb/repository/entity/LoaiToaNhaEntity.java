package com.javaweb.repository.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "loaitoanha")
public class LoaiToaNhaEntity {
//	private String idLoaiToaNha, tenLoaiToaNha;

	@Id
	private String idLoaiToaNha;

	@Column(name = "tenLoaiToaNha")
	private String tenLoaiToaNha;

	@OneToMany(mappedBy = "loaiToaNha")
	private List<BuildingEntity> buildings;

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

	public List<BuildingEntity> getBuildings() {
		return buildings;
	}

	public void setBuildings(List<BuildingEntity> buildings) {
		this.buildings = buildings;
	}

}
