package com.javaweb.converter;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.javaweb.api.model.BuildingDTO;
import com.javaweb.config.ModelMapperConfig;
import com.javaweb.repository.BuildingRepository;
import com.javaweb.repository.DienTichThueRepository;
import com.javaweb.repository.LoaiToaNhaRepository;
import com.javaweb.repository.NhanVienRepository;
import com.javaweb.repository.QuanRepository;
import com.javaweb.repository.entity.BuildingEntity;

@Component
public class BuildingDTOConverter {

	@Autowired
	private BuildingRepository buildingRepository;
	
	@Autowired
	private QuanRepository quanRepository;
	
	@Autowired
	private LoaiToaNhaRepository loaiToaNhaRepository;
	
	@Autowired
	private NhanVienRepository nhanVienRepository;
	
	@Autowired 
	private DienTichThueRepository dienTichThueRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public BuildingDTO toBuildingDTO(BuildingEntity item) {
		BuildingDTO buildingDTO = modelMapper.map(item, BuildingDTO.class);
		//buildingDTO.setIdToaNha(item.getIdToaNha());
		//buildingDTO.setTenNha(item.getTenNha());
		String quan = quanRepository.getTenById(item.getIdQuan());
		String diaChi = item.getDuong() + ", " + item.getPhuong() + ", " + quan;
		buildingDTO.setDiaChi(diaChi);
//		buildingDTO.setSoTangHam(item.getSoTangHam());
//		buildingDTO.setDienTichSan(item.getDienTichSan());
		buildingDTO.setDienTichThue(dienTichThueRepository.getDienTichThue(item.getIdToaNha()));
//		buildingDTO.setGiaThue(item.getGiaThue());
//		buildingDTO.setPhiDichVu(item.getPhiDichVu());
//		buildingDTO.setPhiMoiGioi(item.getPhiMoiGioi());
		String loaiToaNha1 = loaiToaNhaRepository.getTenById(item.getIdLoaiToaNha());
		buildingDTO.setLoaiToaNha(loaiToaNha1);
		List<String> listTenNhanVien = nhanVienRepository.getTenById(item.getIdToaNha());
		//System.out.println(listTenNhanVien);
		buildingDTO.setTenNhanVien(listTenNhanVien);
		List<String> listSdtNhanVien = nhanVienRepository.getSdtById(item.getIdToaNha());
		buildingDTO.setSdtNhanVien(listSdtNhanVien);
		//System.out.println(listSdtNhanVien);
		return buildingDTO;
	}
}
