package com.javaweb.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaweb.api.model.BuildingDTO;
import com.javaweb.api.model.BuildingRequestDTO;
import com.javaweb.repository.entity.BuildingEntity;
import com.javaweb.service.BuildingService;

@RestController
public class buildingAPI {

	@Autowired
	private BuildingService buildingService;
	
	@GetMapping (value="/api/building")	
	public List<BuildingDTO> getBuilding(@RequestParam Map<String, Object> params, @RequestParam (name = "loaiToaNha", required = false) List<String> loaiToaNha) {
		List<BuildingDTO> result = new ArrayList<BuildingDTO>();
		result = buildingService.findAllBuilding(params, loaiToaNha);
		return result;
	}
	
	@DeleteMapping (value="/api/building/{id}")
	public void deleteById(@PathVariable("id") String idToaNha) {
		buildingService.deleteById(idToaNha);
	}
	
//	@DeleteMapping (value="/api/buildings/{idToaNhas}")
//	public void deleteById(@PathVariable List<String> idToaNhas) {
//		buildingService.deleteByIdToaNhaIn(idToaNhas);
//	}
	
	@PostMapping (value = "/api/building/")
	public void addBuilding(@RequestBody BuildingRequestDTO buildingRequestDTO) {
		buildingService.addBuilding(buildingRequestDTO);
	}
	
	@PutMapping (value = "/api/building/{id}")
	public void updateBuilding(@PathVariable("id") String idToaNha, @RequestBody BuildingRequestDTO buildingRequestDTO) {
		buildingService.updateBuilding(idToaNha, buildingRequestDTO);
	}
}
