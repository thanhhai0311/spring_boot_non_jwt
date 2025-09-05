package com.javaweb.repository.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class RoleEntity {

	@Id
	private String idRole;

	@Column(name = "codeRole")
	private String codeRole;

	@Column(name = "tenRole")
	private String tenRole;

	@ManyToMany(mappedBy = "roles")
	private List<NhanVienEntity> nhanViens = new ArrayList<NhanVienEntity>();

	public String getIdRole() {
		return idRole;
	}

	public void setIdRole(String idRole) {
		this.idRole = idRole;
	}

	public String getCodeRole() {
		return codeRole;
	}

	public void setCodeRole(String codeRole) {
		this.codeRole = codeRole;
	}

	public String getTenRole() {
		return tenRole;
	}

	public void setTenRole(String tenRole) {
		this.tenRole = tenRole;
	}

	public List<NhanVienEntity> getNhanViens() {
		return nhanViens;
	}

	public void setNhanViens(List<NhanVienEntity> nhanViens) {
		this.nhanViens = nhanViens;
	}

}
