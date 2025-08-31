package com.javaweb.service;

import java.util.List;
import java.util.Map;

import com.javaweb.api.model.BuildingDTO;

public interface BuildingService {
	List<BuildingDTO> findAllBuilding(Map<String, Object> params, List<String> loaiToaNha);

}
