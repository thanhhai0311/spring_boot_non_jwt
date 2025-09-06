package com.javaweb.service;

import java.util.List;
import java.util.Map;

import com.javaweb.api.model.BuildingDTO;
import com.javaweb.api.model.BuildingRequestDTO;
import com.javaweb.repository.entity.BuildingEntity;

public interface BuildingService {
	List<BuildingDTO> findAllBuilding(Map<String, Object> params, List<String> loaiToaNha);
	void deleteById(String idToaNha);
	void deleteByIdToaNhaIn(List<String> idToaNhas);
	void addBuilding(BuildingRequestDTO buildingRequestDTO);
	void updateBuilding(String idToaNha, BuildingRequestDTO buildingRequestDTO);
}
