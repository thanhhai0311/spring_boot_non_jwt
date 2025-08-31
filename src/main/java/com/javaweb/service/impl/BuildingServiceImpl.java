package com.javaweb.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaweb.api.model.BuildingDTO;
import com.javaweb.repository.BuildingRepository;
import com.javaweb.repository.LoaiToaNhaRepository;
import com.javaweb.repository.NhanVienRepository;
import com.javaweb.repository.QuanRepository;
import com.javaweb.repository.entity.BuildingEntity;
import com.javaweb.service.BuildingService;

@Service
public class BuildingServiceImpl implements BuildingService{

	@Autowired
	private BuildingRepository buildingRepository;
	
	@Autowired
	private QuanRepository quanRepository;
	
	@Autowired
	private LoaiToaNhaRepository loaiToaNhaRepository;
	
	@Autowired
	private NhanVienRepository nhanVienRepository;
	
	@Override
	public List<BuildingDTO> findAllBuilding(Map<String, Object> params, List<String> loaiToaNha) {
		List<BuildingEntity> buildingEntities = buildingRepository.findAllBuilding(params, loaiToaNha);
		List<BuildingDTO> result = new ArrayList<>();
		for(BuildingEntity item : buildingEntities) {
			BuildingDTO buildingDTO = new BuildingDTO();
			buildingDTO.setIdToaNha(item.getIdToaNha());
			buildingDTO.setTenNha(item.getTenNha());
			String quan = quanRepository.getTenById(item.getIdQuan());
			String diaChi = item.getDuong() + ", " + item.getPhuong() + ", " + quan;
			buildingDTO.setDiaChi(diaChi);
			buildingDTO.setSoTangHam(item.getSoTangHam());
			buildingDTO.setDienTichSan(item.getDienTichSan());
			buildingDTO.setDienTichThue(item.getDienTichThue());
			buildingDTO.setGiaThue(item.getGiaThue());
			buildingDTO.setPhiDichVu(item.getPhiDichVu());
			buildingDTO.setPhiMoiGioi(item.getPhiMoiGioi());
			String loaiToaNha1 = loaiToaNhaRepository.getTenById(item.getIdLoaiToaNha());
			buildingDTO.setLoaiToaNha(loaiToaNha1);
			List<String> listTenNhanVien = nhanVienRepository.getTenById(item.getIdToaNha());
			System.out.println(listTenNhanVien);
			buildingDTO.setTenNhanVien(listTenNhanVien);
			List<String> listSdtNhanVien = nhanVienRepository.getSdtById(item.getIdToaNha());
			buildingDTO.setSdtNhanVien(listSdtNhanVien);
			System.out.println(listSdtNhanVien);
		    result.add(buildingDTO);
		}
		return result;
	}

}

//private String idToaNha;
//private String tenNha;
//private String diaChi;
//private int soTangHam;
//private float dienTichSan;
//private String dienTichThue;
//private float giaThue;
//private float phiDichVu;
//private float phiMoiGioi;
//private String LoaiToaNha;