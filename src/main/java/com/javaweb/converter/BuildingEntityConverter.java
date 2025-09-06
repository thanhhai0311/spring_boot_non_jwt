package com.javaweb.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.javaweb.api.model.BuildingRequestDTO;
import com.javaweb.repository.LoaiToaNhaRepository;
import com.javaweb.repository.QuanRepository;
import com.javaweb.repository.entity.BuildingEntity;
import com.javaweb.repository.entity.LoaiToaNhaEntity;
import com.javaweb.repository.entity.QuanEntity;

@Component
public class BuildingEntityConverter {
	
	@Autowired
	private QuanRepository quanRepository;
	
	@Autowired
	private LoaiToaNhaRepository loaiToaNhaRepository;
	
	public BuildingEntity toBuildingEntity(BuildingRequestDTO dto, BuildingEntity e) {
		//BuildingEntity e = new BuildingEntity();
		
		if (dto == null) return e;
        if (dto.getIdToaNha() != null) 		e.setIdToaNha(dto.getIdToaNha());
        if (dto.getTenNha() != null)        e.setTenNha(dto.getTenNha());
        if (dto.getPhuong() != null)        e.setPhuong(dto.getPhuong());
        if (dto.getDuong() != null)         e.setDuong(dto.getDuong());
        if (dto.getKetCau() != null)        e.setKetCau(dto.getKetCau());
        if (dto.getSoTangHam() != null)     e.setSoTangHam(dto.getSoTangHam());
        if (dto.getDienTichSan() != null)   e.setDienTichSan(dto.getDienTichSan());
        if (dto.getHuong() != null)         e.setHuong(dto.getHuong());
        if (dto.getGiaThue() != null)       e.setGiaThue(dto.getGiaThue());
        if (dto.getMoTaGia() != null)       e.setMoTaGia(dto.getMoTaGia());
        if (dto.getPhiDichVu() != null)     e.setPhiDichVu(dto.getPhiDichVu());
        if (dto.getPhiOto() != null)        e.setPhiOto(dto.getPhiOto());
        if (dto.getPhiNgoaiGio() != null)   e.setPhiNgoaiGio(dto.getPhiNgoaiGio());
        if (dto.getTienDien() != null)      e.setTienDien(dto.getTienDien());
        if (dto.getDatCoc() != null)        e.setDatCoc(dto.getDatCoc());
        if (dto.getThanhToan() != null)     e.setThanhToan(dto.getThanhToan());
        if (dto.getPhiMoiGioi() != null)    e.setPhiMoiGioi(dto.getPhiMoiGioi());
        if (dto.getGhiChu() != null)        e.setGhiChu(dto.getGhiChu());
        if (dto.getThoiHanThue() != null) {
            e.setThoiHanThue(dto.getThoiHanThue()); 
        }
        if (dto.getThoiGianTrangTri() != null) {
            e.setThoiGianTrangTri(dto.getThoiGianTrangTri());
        }
        if (dto.getIdQuan() != null) {
            QuanEntity q = quanRepository.findById(dto.getIdQuan())
                .orElseThrow(() -> new IllegalArgumentException("Không tìm thấy Quận id=" + dto.getIdQuan()));
            e.setQuan(q);
        }
        if (dto.getIdLoaiToaNha() != null) {
            LoaiToaNhaEntity l = loaiToaNhaRepository.findById(dto.getIdLoaiToaNha())
                .orElseThrow(() -> new IllegalArgumentException("Không tìm thấy Loại tòa nhà id=" + dto.getIdLoaiToaNha()));
            e.setLoaiToaNha(l);
        }
        return e;
	}
}
