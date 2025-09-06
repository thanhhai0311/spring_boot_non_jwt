package com.javaweb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javaweb.api.model.BuildingDTO;
import com.javaweb.repository.custom.BuildingRepositoryCustom;
import com.javaweb.repository.entity.BuildingEntity;


public interface BuildingRepository extends JpaRepository<BuildingEntity, String>, BuildingRepositoryCustom {
	void deleteByIdToaNhaIn(List<String> ids);

}
