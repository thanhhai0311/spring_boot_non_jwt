package com.javaweb.config;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.javaweb.api.model.BuildingDTO;
import com.javaweb.repository.entity.BuildingEntity;

@Configuration
public class ModelMapperConfig {
	@Bean
	public ModelMapper modelMapper() {
		ModelMapper mm = new ModelMapper();
		mm.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		mm.typeMap(BuildingEntity.class, BuildingDTO.class)
	      .addMappings(m -> {
	          m.map(src -> src.getLoaiToaNha().getTenLoaiToaNha(), BuildingDTO::setLoaiToaNha); 
	      });
		return mm;
	}
}
