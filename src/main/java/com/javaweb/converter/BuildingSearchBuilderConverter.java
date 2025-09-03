package com.javaweb.converter;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.javaweb.builder.BuildingSearchBuilder;
import com.javaweb.utils.MapUtils;

@Component
public class BuildingSearchBuilderConverter {
	public BuildingSearchBuilder toBuildingSearchBuilder(Map<String, Object> params, List<String> loaiToaNha) {

		BuildingSearchBuilder buildingSearchBuilder = new BuildingSearchBuilder.Builder()
				.setTenNha(MapUtils.getObject(params, "tenNha", String.class))
				.setDienTichSan(MapUtils.getObject(params, "dienTichSan", String.class))
				.setIdQuan(MapUtils.getObject(params, "idQuan", String.class))
				.setPhuong(MapUtils.getObject(params, "phuong", String.class))
				.setDuong(MapUtils.getObject(params, "duong", String.class))
				.setSoTangHam(MapUtils.getObject(params, "soTangHam", String.class))
				.setHuong(MapUtils.getObject(params, "huong", String.class))
				.setDienTichThueDen(MapUtils.getObject(params, "dienTichThueDen", String.class))
				.setDienTichThueTu(MapUtils.getObject(params, "dienTichThueTu", String.class))
				.setGiaThueTu(MapUtils.getObject(params, "giaThueTu", String.class))
				.setGiaThueDen(MapUtils.getObject(params, "giaThueDen", String.class))
				.setTenNhanVien(MapUtils.getObject(params, "tenNhanVien", String.class))
				.setIdNhanVien(MapUtils.getObject(params, "idNhanVien", String.class))
				.setSdtNhanVien(MapUtils.getObject(params, "sdtNhanVien", String.class))
				.setIdToaNha(MapUtils.getObject(params, "idToaNha", String.class)).setLoaiToaNha(loaiToaNha).build();
		return buildingSearchBuilder;
	}
}
