package com.javaweb.builder;

import java.util.List;

public class BuildingSearchBuilder {
	private String tenNha, dienTichSan, idQuan, phuong, duong, soTangHam, huong, dienTichThueDen, giaThueTu, giaThueDen,
			tenNhanVien, idNhanVien, sdtNhanVien, dienTichThueTu, idToaNha;
	private List<String> loaiToaNha;

	public BuildingSearchBuilder(Builder builder) {
		this.tenNha = builder.tenNha;
		this.dienTichSan = builder.dienTichSan;
		this.idQuan = builder.idQuan;
		this.phuong = builder.phuong;
		this.duong = builder.duong;
		this.soTangHam = builder.soTangHam;
		this.huong = builder.huong;
		this.dienTichThueDen = builder.dienTichThueDen;
		this.giaThueTu = builder.giaThueTu;
		this.giaThueDen = builder.giaThueDen;
		this.tenNhanVien = builder.tenNhanVien;
		this.idNhanVien = builder.idNhanVien;
		this.sdtNhanVien = builder.sdtNhanVien;
		this.dienTichThueTu = builder.dienTichThueTu;
		this.idToaNha = builder.idToaNha;
		this.loaiToaNha = builder.loaiToaNha;
	}

	public String getTenNha() {
		return tenNha;
	}

	public String getDienTichSan() {
		return dienTichSan;
	}

	public String getIdQuan() {
		return idQuan;
	}

	public String getPhuong() {
		return phuong;
	}

	public String getDuong() {
		return duong;
	}

	public String getSoTangHam() {
		return soTangHam;
	}

	public String getHuong() {
		return huong;
	}

	public String getDienTichThueDen() {
		return dienTichThueDen;
	}

	public String getGiaThueTu() {
		return giaThueTu;
	}

	public String getGiaThueDen() {
		return giaThueDen;
	}

	public String getTenNhanVien() {
		return tenNhanVien;
	}

	public String getIdNhanVien() {
		return idNhanVien;
	}

	public String getSdtNhanVien() {
		return sdtNhanVien;
	}

	public String getDienTichThueTu() {
		return dienTichThueTu;
	}

	public String getIdToaNha() {
		return idToaNha;
	}

	public List<String> getLoaiToaNha() {
		return loaiToaNha;
	}

	public static class Builder {
		private String tenNha, dienTichSan, idQuan, phuong, duong, soTangHam, huong, dienTichThueDen, giaThueTu,
				giaThueDen, tenNhanVien, idNhanVien, sdtNhanVien, dienTichThueTu, idToaNha;
		private List<String> loaiToaNha;

		public Builder setTenNha(String tenNha) {
			this.tenNha = tenNha;
			return this;
		}

		public Builder setDienTichSan(String dienTichSan) {
			this.dienTichSan = dienTichSan;
			return this;
		}

		public Builder setIdQuan(String idQuan) {
			this.idQuan = idQuan;
			return this;
		}

		public Builder setPhuong(String phuong) {
			this.phuong = phuong;
			return this;
		}

		public Builder setDuong(String duong) {
			this.duong = duong;
			return this;
		}

		public Builder setSoTangHam(String soTangHam) {
			this.soTangHam = soTangHam;
			return this;
		}

		public Builder setHuong(String huong) {
			this.huong = huong;
			return this;
		}

		public Builder setDienTichThueDen(String dienTichThueDen) {
			this.dienTichThueDen = dienTichThueDen;
			return this;
		}

		public Builder setGiaThueTu(String giaThueTu) {
			this.giaThueTu = giaThueTu;
			return this;
		}

		public Builder setGiaThueDen(String giaThueDen) {
			this.giaThueDen = giaThueDen;
			return this;
		}

		public Builder setTenNhanVien(String tenNhanVien) {
			this.tenNhanVien = tenNhanVien;
			return this;
		}

		public Builder setIdNhanVien(String idNhanVien) {
			this.idNhanVien = idNhanVien;
			return this;
		}

		public Builder setSdtNhanVien(String sdtNhanVien) {
			this.sdtNhanVien = sdtNhanVien;
			return this;
		}

		public Builder setDienTichThueTu(String dienTichThueTu) {
			this.dienTichThueTu = dienTichThueTu;
			return this;
		}

		public Builder setIdToaNha(String idToaNha) {
			this.idToaNha = idToaNha;
			return this;
		}

		public Builder setLoaiToaNha(List<String> loaiToaNha) {
			this.loaiToaNha = loaiToaNha;
			return this;
		}

		public BuildingSearchBuilder build() {
			return new BuildingSearchBuilder(this);
		}

	}
}
