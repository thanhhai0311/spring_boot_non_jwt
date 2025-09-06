package com.javaweb.repository.custom.impl;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.javaweb.builder.BuildingSearchBuilder;
import com.javaweb.repository.BuildingRepository;
import com.javaweb.repository.custom.BuildingRepositoryCustom;
import com.javaweb.repository.entity.BuildingEntity;
import com.javaweb.utils.ConnectionJDBCUtils;
import com.javaweb.utils.NumberUtils;
import com.javaweb.utils.StringUtils;

@Repository
@Primary
public class BuildingRepositoryImpl implements BuildingRepositoryCustom {
	@Autowired
	private ConnectionJDBCUtils connectionJDBCUtils;

	@PersistenceContext
	private EntityManager entityManager;

	public static void joinTable(BuildingSearchBuilder buildingSearchBuilder, StringBuilder sql) {
		String idNhanVien = (String) buildingSearchBuilder.getIdNhanVien();
		if (StringUtils.checkString(idNhanVien)) {
			sql.append("JOIN toanha_nhanvien tnnv ON t.idToaNha = tnnv.idToaNha ");
			sql.append("JOIN nhanvien nv ON tnnv.idNhanVien = nv.idNhanVien ");
		}
		String dienTichThueTu = (String) buildingSearchBuilder.getDienTichThueTu();
		String dienTichThueDen = (String) buildingSearchBuilder.getDienTichThueDen();
		if (StringUtils.checkString(dienTichThueTu) || StringUtils.checkString(dienTichThueDen)) {
			if (NumberUtils.checkNumber(dienTichThueTu) || NumberUtils.checkNumber(dienTichThueDen)) {
				sql.append("JOIN dientichthue dtt ON t.idToaNha = dtt.idToaNha ");
			}
		}
	}

	public static void queryNormal(BuildingSearchBuilder buildingSearchBuilder, StringBuilder where) {
		try {
			Field[] fields = BuildingSearchBuilder.class.getDeclaredFields();
			for (Field item : fields) {
				item.setAccessible(true);
				String fieldName = item.getName();
				if (!fieldName.equals("idNhanVien") && !fieldName.startsWith("dienTichThue")
						&& !fieldName.startsWith("giaThue") && !fieldName.equals("loaiToaNha")) {
					String value = (String) item.get(buildingSearchBuilder);
					if (StringUtils.checkString(value)) {
						if (NumberUtils.checkNumber(value)) {
							where.append("AND t." + fieldName + "=" + value + " ");
						} else {
							if (fieldName.equals("tenNhanVien")) {
								where.append("AND nv." + fieldName + " LIKE '%" + value + "%' ");
							} else if (fieldName.equals("sdtNhanVien")) {
								where.append("AND nv." + fieldName + " LIKE '%" + value + "%' ");
							} else
								where.append("AND t." + fieldName + " LIKE '%" + value + "%' ");
						}
					}
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public static void querySpecial(BuildingSearchBuilder buildingSearchBuilder, StringBuilder where) {
		String idNhanVien = (String) buildingSearchBuilder.getIdNhanVien();
		if (StringUtils.checkString(idNhanVien)) {
			where.append("AND tnnv.idNhanVien = '" + idNhanVien + "' ");
		}
		String dienTichThueTu = (String) buildingSearchBuilder.getDienTichThueTu();
		String dienTichThueDen = (String) buildingSearchBuilder.getDienTichThueDen();
		if (StringUtils.checkString(dienTichThueTu)) {
			where.append("AND dtt.dienTich >= " + dienTichThueTu + " ");
		}
		if (StringUtils.checkString(dienTichThueDen)) {
			where.append("AND dtt.dienTich <= " + dienTichThueDen + " ");
		}
		String giaThueTu = (String) buildingSearchBuilder.getGiaThueTu();
		String giaThueDen = (String) buildingSearchBuilder.getGiaThueDen();
		if (StringUtils.checkString(giaThueTu)) {
			where.append("AND t.giaThue >= " + giaThueTu + " ");
		}
		if (StringUtils.checkString(giaThueDen)) {
			where.append("AND t.giaThue <= " + giaThueDen + " ");
		}
		if (buildingSearchBuilder.getLoaiToaNha() != null && buildingSearchBuilder.getLoaiToaNha().size() > 0) {
			List<String> loai = new ArrayList<String>();
			for (String item : buildingSearchBuilder.getLoaiToaNha()) {
				loai.add("'" + item + "'");
			}
			where.append("AND t.idLoaiToaNha IN (" + String.join(", ", loai) + ") ");
		}
	}

	@Override
	public List<BuildingEntity> findAllBuilding(BuildingSearchBuilder buildingSearchBuilder) {

		StringBuilder sql = new StringBuilder(
				"SELECT t.idToaNha, t.tenNha,t.idQuan,t.phuong,t.duong, t.soTangHam,t.huong,t.giaThue,t.moTaGia,t.phiDichVu,t.phiOto,t.phiNgoaiGio,t.tienDien,t.datCoc,t.thanhToan,t.thoiHanThue,t.thoiGianTrangTri,t.phiMoiGioi,t.idLoaiToaNha,t.ghiChu, t.ketCau, t.dienTichSan FROM ToaNha t ");
		StringBuilder where = new StringBuilder("WHERE 1=1 ");
		joinTable(buildingSearchBuilder, sql);
		queryNormal(buildingSearchBuilder, where);
		querySpecial(buildingSearchBuilder, where);
		sql.append(where);
		sql.append(" GROUP BY t.idToaNha ");
		System.out.println(sql.toString());
		List<BuildingEntity> result = new ArrayList<BuildingEntity>();
		try (Connection conn = connectionJDBCUtils.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql.toString())) {

			Query query = entityManager.createNativeQuery(sql.toString(), BuildingEntity.class);
			result = query.getResultList();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Connected database failed...");
		}
		return result;
	}

}
