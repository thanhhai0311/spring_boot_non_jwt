package com.javaweb.repository;

import java.util.List;

public interface NhanVienRepository {
	List<String> getTenById(String id);
	List<String> getSdtById(String id);
}
