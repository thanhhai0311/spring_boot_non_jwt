package com.javaweb.repository.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "quan")
public class QuanEntity {
//	private String idQuan, codeQuan, tenQuan;

	@Id
	private String idQuan;

	@Column(name = "codeQuan")
	private String codeQuan;

	@Column(name = "tenQuan")
	private String tenQuan;

	@OneToMany(mappedBy = "quan", fetch = FetchType.LAZY)
	private List<BuildingEntity> buildings = new ArrayList<BuildingEntity>();

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

	public List<BuildingEntity> getBuildings() {
		return buildings;
	}

	public void setBuildings(List<BuildingEntity> buildings) {
		this.buildings = buildings;
	}

}
