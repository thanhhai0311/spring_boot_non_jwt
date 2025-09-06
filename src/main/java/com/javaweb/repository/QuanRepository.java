package com.javaweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaweb.repository.entity.QuanEntity;

public interface QuanRepository extends JpaRepository<QuanEntity, String>{
	
}
