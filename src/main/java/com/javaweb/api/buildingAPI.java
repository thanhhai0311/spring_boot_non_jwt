package com.javaweb.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaweb.api.model.BuildingDTO;
import com.javaweb.service.BuildingService;

@RestController
public class buildingAPI {

	@Autowired
	private BuildingService buildingService;
	
	@GetMapping (value="/api/building")	
	public List<BuildingDTO> getBuilding() {
		List<BuildingDTO> result = new ArrayList<BuildingDTO>();
		result = buildingService.findAllBuilding();
		return result;
	}
	
	
}
