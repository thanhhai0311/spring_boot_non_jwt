package com.javaweb.converter;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.javaweb.api.model.BuildingDTO;
import com.javaweb.repository.entity.BuildingEntity;
import com.javaweb.repository.entity.DienTichThueEntity;
import com.javaweb.repository.entity.NhanVienEntity;

@Component
public class BuildingDTOConverter {
	
	@Autowired
	private ModelMapper modelMapper;
	
	public BuildingDTO toBuildingDTO(BuildingEntity item) {
		BuildingDTO buildingDTO = modelMapper.map(item, BuildingDTO.class);
		String diaChi = item.getDuong() + " " + item.getPhuong() + " " + item.getQuan().getTenQuan();
		buildingDTO.setDiaChi(diaChi);
		String dienTichThue ="";
		List<DienTichThueEntity> dtt = item.getDienTichThue();
		for(DienTichThueEntity it : dtt) {
			dienTichThue+=it.getDienTich()+" ";
		}
		buildingDTO.setDienTichThue(dienTichThue);
		buildingDTO.setLoaiToaNha(item.getLoaiToaNha().getTenLoaiToaNha());
		List<NhanVienEntity> nv = item.getNhanViens();
		List<String> listTenNhanVien = new ArrayList<String>();
		List<String> listSdtNhanVien = new ArrayList<String>();
		for(NhanVienEntity it : nv) {
			listTenNhanVien.add(it.getTenNhanVien());
			listSdtNhanVien.add(it.getSdtNhanVien());
			
		}
		buildingDTO.setTenNhanVien(listTenNhanVien);
		buildingDTO.setSdtNhanVien(listSdtNhanVien);
		return buildingDTO;
	}
}
