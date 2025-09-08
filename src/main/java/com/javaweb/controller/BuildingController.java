package com.javaweb.controller;

import java.util.*;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.javaweb.api.model.BuildingDTO;
import com.javaweb.api.model.BuildingRequestDTO;
import com.javaweb.converter.BuildingDTOConverter;
import com.javaweb.repository.BuildingRepository;
import com.javaweb.repository.entity.BuildingEntity;
import com.javaweb.service.BuildingService;

@Controller
@RequestMapping("/buildings")
public class BuildingController {

    @Autowired private BuildingService buildingService;
    @Autowired private BuildingRepository buildingRepository;
    @Autowired private BuildingDTOConverter buildingDTOConverter;

    // Trang danh sách + tìm kiếm
    @GetMapping
    public String list(@RequestParam Map<String,String> params,
                       @RequestParam(name="loaiToaNha", required=false) List<String> loaiToaNha,
                       Model model) {
        Map<String,Object> map = new HashMap<>(params);
        if (loaiToaNha == null) loaiToaNha = new ArrayList<>();
        List<BuildingDTO> results = buildingService.findAllBuilding(map, loaiToaNha);

        model.addAttribute("buildings", results);
        model.addAttribute("query", params);
        model.addAttribute("loaiToaNha", loaiToaNha);
        return "buildings/list"; // -> /WEB-INF/views/buildings/list.jsp
    }

    // Form thêm mới
    @GetMapping("/new")
    public String createForm(Model model) {
        model.addAttribute("building", new BuildingRequestDTO());
        model.addAttribute("mode", "create");
        return "buildings/form";
    }

    // Tạo mới
    @PostMapping
    public String create(@ModelAttribute("building") @Valid BuildingRequestDTO building,
                         BindingResult bindingResult,
                         Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("mode", "create");
            return "buildings/form";
        }
        buildingService.addBuilding(building);
        return "redirect:/buildings";
    }

    // Form sửa
    @GetMapping("/{id}/edit")
    public String editForm(@PathVariable("id") String id, Model model) {
        Optional<BuildingEntity> opt = buildingRepository.findById(id);
        if (!opt.isPresent()) return "redirect:/buildings";

        BuildingDTO dto = buildingDTOConverter.toBuildingDTO(opt.get());
        BuildingRequestDTO form = new BuildingRequestDTO();
        // map tối thiểu DTO -> form
//        form.setIdToaNha(dto.getIdToaNha());
//        form.setTenNha(dto.getTenNha());
//        form.setDiaChi(dto.getDiaChi());
//        form.setSoTangHam(dto.getSoTangHam());
//        form.setDienTichSan(dto.getDienTichSan());
//        form.setDienTichThue(dto.getDienTichThue());
//        form.setGiaThue(dto.getGiaThue());
//        form.setPhiDichVu(dto.getPhiDichVu());
//        form.setPhiMoiGioi(dto.getPhiMoiGioi());
//        form.setLoaiToaNha(dto.getLoaiToaNha());
//        form.setIdQuan(dto.getIdQuan());
//        form.setPhuong(dto.getPhuong());
//        form.setDuong(dto.getDuong());
//        form.setHuong(dto.getHuong());
//        form.setSoTang(dto.getSoTang());

        model.addAttribute("building", form);
        model.addAttribute("mode", "edit");
        return "buildings/form";
    }

    // Cập nhật
    @PostMapping("/{id}")
    public String update(@PathVariable("id") String id,
                         @ModelAttribute("building") @Valid BuildingRequestDTO building,
                         BindingResult bindingResult,
                         Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("mode", "edit");
            return "buildings/form";
        }
        buildingService.updateBuilding(id, building);
        return "redirect:/buildings";
    }

    // Xóa đơn
    @PostMapping("/{id}/delete")
    public String delete(@PathVariable("id") String id) {
        buildingService.deleteById(id);
        return "redirect:/buildings";
    }

    // Xóa nhiều (ids gửi dạng "a,b,c")
    @PostMapping("/delete-bulk")
    public String deleteBulk(@RequestParam("ids") String ids) {
        List<String> list = Arrays.stream(ids.split(","))
                                  .map(String::trim)
                                  .filter(s -> !s.isEmpty())
                                  .collect(Collectors.toList());
        buildingService.deleteByIdToaNhaIn(list);
        return "redirect:/buildings";
    }
}
