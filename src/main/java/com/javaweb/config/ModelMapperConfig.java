package com.javaweb.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.javaweb.api.model.BuildingDTO;
import com.javaweb.repository.entity.BuildingEntity;

@Configuration
public class ModelMapperConfig {
	@Bean
	public ModelMapper modelMapper() {
		ModelMapper mm = new ModelMapper();
		return mm;
	}
}
