package com.javaweb.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.javaweb.api.model.BuildingDTO;
import com.javaweb.builder.BuildingSearchBuilder;
import com.javaweb.converter.BuildingDTOConverter;
import com.javaweb.converter.BuildingSearchBuilderConverter;
import com.javaweb.repository.BuildingRepository;
import com.javaweb.repository.DienTichThueRepository;
import com.javaweb.repository.LoaiToaNhaRepository;
import com.javaweb.repository.NhanVienRepository;
import com.javaweb.repository.QuanRepository;
import com.javaweb.repository.entity.BuildingEntity;
import com.javaweb.service.BuildingService;

@Service
public class BuildingServiceImpl implements BuildingService{

	@Autowired
	private BuildingRepository buildingRepository;
	
	@Autowired 
	private BuildingDTOConverter buildingDTOConverter;
	
	@Autowired
	private BuildingSearchBuilderConverter buildingSearchBuilderConverter;
	
	@Override
	public List<BuildingDTO> findAllBuilding(Map<String, Object> params, List<String> loaiToaNha) {
		BuildingSearchBuilder buildingSearchBuilder = buildingSearchBuilderConverter.toBuildingSearchBuilder(params, loaiToaNha);
		List<BuildingEntity> buildingEntities = buildingRepository.findAllBuilding(buildingSearchBuilder);
		List<BuildingDTO> result = new ArrayList<>();
		for(BuildingEntity item : buildingEntities) {
			BuildingDTO buildingDTO = new BuildingDTO();
			buildingDTO = buildingDTOConverter.toBuildingDTO(item);
		    result.add(buildingDTO);
		}
		return result;
	}

}

//private String idToaNha;
//private String tenNha;
//private String diaChi;
//private int soTangHam;
//private float dienTichSan;
//private String dienTichThue;
//private float giaThue;
//private float phiDichVu;
//private float phiMoiGioi;
//private String LoaiToaNha;