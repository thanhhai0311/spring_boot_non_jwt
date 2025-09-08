<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Danh sách Tòa nhà</title>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css">
</head>
<body class="p-4">
<div class="container">
  <div class="d-flex justify-content-between align-items-center mb-3">
    <h3 class="mb-0">Danh sách Tòa nhà</h3>
    <a class="btn btn-primary" href="${pageContext.request.contextPath}/buildings/new">+ Thêm mới</a>
  </div>

  <form class="card card-body mb-3" method="get" action="${pageContext.request.contextPath}/buildings">
    <div class="row g-2">
      <div class="col-md-3">
        <input class="form-control" type="text" name="tenNha" placeholder="Tên nhà" value="${query.tenNha}">
      </div>
      <div class="col-md-3">
        <input class="form-control" type="text" name="diaChi" placeholder="Địa chỉ" value="${query.diaChi}">
      </div>
      <div class="col-md-2">
        <input class="form-control" type="number" name="giaThueTu" placeholder="Giá thuê từ" value="${query.giaThueTu}">
      </div>
      <div class="col-md-2">
        <input class="form-control" type="number" name="giaThueDen" placeholder="Giá thuê đến" value="${query.giaThueDen}">
      </div>
      <div class="col-md-2">
        <button class="btn btn-outline-secondary w-100" type="submit">Tìm kiếm</button>
      </div>
    </div>
  </form>

  <!-- Form bulk delete bao quanh bảng -->
  <form method="post" action="${pageContext.request.contextPath}/buildings/delete-bulk" id="bulkForm">
    <input type="hidden" name="ids" id="bulkIds">
    <div class="table-responsive">
      <table class="table table-striped align-middle">
        <thead>
          <tr>
            <th style="width:32px"><input type="checkbox" id="checkAll"></th>
            <th>ID</th>
            <th>Tên nhà</th>
            <th>Địa chỉ</th>
            <th>Giá thuê</th>
            <th>Loại</th>
            <th style="width:150px"></th>
          </tr>
        </thead>
        <tbody>
          <c:forEach var="b" items="${buildings}">
            <tr>
              <td><input type="checkbox" class="row-check" value="${b.idToaNha}"></td>
              <td>${b.idToaNha}</td>
              <td>${b.tenNha}</td>
              <td>${b.diaChi}</td>
              <td>${b.giaThue}</td>
              <td>${b.loaiToaNha}</td>
              <td class="text-end">
                <a class="btn btn-sm btn-outline-primary"
                   href="${pageContext.request.contextPath}/buildings/${b.idToaNha}/edit">Sửa</a>
                <!-- Nút delete dùng form ẩn, tránh lồng form -->
                <button class="btn btn-sm btn-outline-danger"
                        type="submit"
                        form="del-${b.idToaNha}"
                        onclick="return confirm('Xóa tòa nhà này?')">Xóa</button>
              </td>
            </tr>
          </c:forEach>
        </tbody>
      </table>
    </div>
    <button class="btn btn-danger" type="button" id="bulkDelete">Xóa đã chọn</button>
  </form>

  <!-- Mini forms ẩn cho delete từng dòng -->
  <c:forEach var="b" items="${buildings}">
    <form id="del-${b.idToaNha}"
          action="${pageContext.request.contextPath}/buildings/${b.idToaNha}/delete"
          method="post"></form>
  </c:forEach>
</div>

<script>
const checkAll = document.getElementById('checkAll');
const rowChecks = document.getElementsByClassName('row-check');
checkAll && checkAll.addEventListener('change', (e) => {
  [...rowChecks].forEach(cb => cb.checked = e.target.checked);
});
document.getElementById('bulkDelete')?.addEventListener('click', () => {
  const ids = [...rowChecks].filter(cb => cb.checked).map(cb => cb.value);
  if (!ids.length) { alert('Chưa chọn bản ghi'); return; }
  if (!confirm('Xóa ' + ids.length + ' bản ghi?')) return;
  document.getElementById('bulkIds').value = ids.join(',');
  document.getElementById('bulkForm').submit();
});
</script>
</body>
</html>
