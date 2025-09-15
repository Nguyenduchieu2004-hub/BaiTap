<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Danh sách Cầu Thủ</title>
</head>
<body>
<h2>Danh sách Cầu Thủ</h2>
<table border="1" cellpadding="5" cellspacing="0">
    <thead>
    <tr>
        <th>STT</th>
        <th>Mã Cầu Thủ</th>
        <th>Họ Tên</th>
        <th>Ngày Sinh</th>
        <th>Kinh Nghiệm</th>
        <th>Vị Trí</th>
        <th>Hình Ảnh</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${cauthuList}" var="cauthu" varStatus="status">
        <tr>
            <td>${status.count}</td>
            <td>${cauthu.maCauThu}</td>
            <td>${cauthu.hoTen}</td>
            <td>${cauthu.ngaySinh}</td>
            <td>${cauthu.kinhNghiem}</td>
            <td>${cauthu.vitri}</td>
            <td>
                <img src="${pageContext.request.contextPath}/images/duchieu.jpg"
                     alt="Ảnh cầu thủ" width="150" height="200"/>
            </td>


        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
