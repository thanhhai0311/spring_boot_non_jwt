package com.javaweb.repository.custom;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.javaweb.builder.BuildingSearchBuilder;
import com.javaweb.repository.entity.BuildingEntity;

@Repository
public interface BuildingRepositoryCustom {
	List<BuildingEntity> findAllBuilding(BuildingSearchBuilder buildingSearchBuilder);
}
