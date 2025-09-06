package com.javaweb.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javaweb.api.model.BuildingDTO;
import com.javaweb.api.model.BuildingRequestDTO;
import com.javaweb.builder.BuildingSearchBuilder;
import com.javaweb.converter.BuildingDTOConverter;
import com.javaweb.converter.BuildingEntityConverter;
import com.javaweb.converter.BuildingSearchBuilderConverter;
import com.javaweb.repository.BuildingRepository;
import com.javaweb.repository.entity.BuildingEntity;
import com.javaweb.service.BuildingService;

@Service
@Transactional
public class BuildingServiceImpl implements BuildingService {

	@Autowired
	private BuildingRepository buildingRepository;

	@Autowired
	private BuildingDTOConverter buildingDTOConverter;

	@Autowired
	private BuildingSearchBuilderConverter buildingSearchBuilderConverter;

	@Autowired
	private BuildingEntityConverter buildingEntityConverter;

	@Override
	public List<BuildingDTO> findAllBuilding(Map<String, Object> params, List<String> loaiToaNha) {
		BuildingSearchBuilder buildingSearchBuilder = buildingSearchBuilderConverter.toBuildingSearchBuilder(params,
				loaiToaNha);
		List<BuildingEntity> buildingEntities = buildingRepository.findAllBuilding(buildingSearchBuilder);
		List<BuildingDTO> result = new ArrayList<>();
		for (BuildingEntity item : buildingEntities) {
			BuildingDTO buildingDTO = new BuildingDTO();
			buildingDTO = buildingDTOConverter.toBuildingDTO(item);
			result.add(buildingDTO);
		}
		return result;
	}

	@Override
	public void deleteById(String idToaNha) {
		buildingRepository.deleteById(idToaNha);

	}

	@Override
	public void deleteByIdToaNhaIn(List<String> idToaNhas) {
		buildingRepository.deleteByIdToaNhaIn(idToaNhas);

	}

	@Override
	public void addBuilding(BuildingRequestDTO buildingRequestDTO) {
		BuildingEntity buildingEntity = new BuildingEntity();
		buildingRepository.save(buildingEntityConverter.toBuildingEntity(buildingRequestDTO, buildingEntity));
	}

	@Override
	public void updateBuilding(String idToaNha, BuildingRequestDTO buildingRequestDTO) {
		BuildingEntity buildingEntity = buildingRepository.findById(idToaNha).get();
		buildingRepository.save(buildingEntityConverter.toBuildingEntity(buildingRequestDTO, buildingEntity));
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