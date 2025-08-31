package com.javaweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaweb.api.model.BuildingDTO;
import com.javaweb.repository.BuildingRepository;
import com.javaweb.repository.entity.BuildingEntity;
import com.javaweb.service.BuildingService;

@Service
public class BuildingServiceImpl implements BuildingService{

	@Autowired
	private BuildingRepository buildingRepository;
	
	@Override
	public List<BuildingDTO> findAllBuilding() {
		List<BuildingEntity> buildingEntities = buildingRepository.findAllBuilding();
		List<BuildingDTO> result = new ArrayList<>();
		for(BuildingEntity item : buildingEntities) {
			BuildingDTO buildingDTO = new BuildingDTO();
			buildingDTO.setIdToaNha(item.getIdToaNha());
		    buildingDTO.setTenNha(item.getTenNha());
		    buildingDTO.setIdQuan(item.getIdQuan());
		    buildingDTO.setPhuong(item.getPhuong());
		    buildingDTO.setDuong(item.getDuong());
		    buildingDTO.setKetCau(item.getKetCau()); 
		    buildingDTO.setSoTangHam(item.getSoTangHam());
		    buildingDTO.setDienTichSan(item.getDienTichSan());
		    buildingDTO.setHuong(item.getHuong());
		    buildingDTO.setDienTichThue(item.getDienTichThue());
		    buildingDTO.setGiaThue(item.getGiaThue());
		    buildingDTO.setMoTaGia(item.getMoTaGia());
		    buildingDTO.setPhiDichVu(item.getPhiDichVu());
		    buildingDTO.setPhiOto(item.getPhiOto());
		    buildingDTO.setPhiNgoaiGio(item.getPhiNgoaiGio());
		    buildingDTO.setTienDien(item.getTienDien());
		    buildingDTO.setDatCoc(item.getDatCoc());
		    buildingDTO.setThanhToan(item.getThanhToan());
		    buildingDTO.setThoiHanThue(item.getThoiHanThue());
		    buildingDTO.setThoiGianTrangTri(item.getThoiGianTrangTri());
		    buildingDTO.setPhiMoiGioi(item.getPhiMoiGioi());
		    buildingDTO.setIdLoaiToaNha(item.getIdLoaiToaNha());
		    buildingDTO.setGhiChu(item.getGhiChu());
		    result.add(buildingDTO);
		}
		return result;
	}

}
