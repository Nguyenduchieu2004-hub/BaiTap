<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Danh sách Cầu Thủ</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f4f6f9;
            margin: 20px;
        }

        h2 {
            text-align: center;
            color: #333;
            margin-bottom: 20px;
        }

        .btn-add {
            display: inline-block;
            margin: 10px 0 20px 5%;
            padding: 8px 15px;
            background: #28a745;
            color: #fff;
            border-radius: 5px;
            text-decoration: none;
            font-weight: bold;
        }

        .btn-add:hover {
            background: #218838;
        }

        table {
            border-collapse: collapse;
            width: 90%;
            margin: 0 auto;
            background: #fff;
            box-shadow: 0 2px 8px rgba(0,0,0,0.1);
            border-radius: 8px;
            overflow: hidden;
        }

        thead {
            background: #007bff;
            color: white;
        }

        thead th {
            padding: 12px;
            text-align: center;
        }

        tbody td {
            padding: 10px;
            text-align: center;
            border-bottom: 1px solid #ddd;
        }

        tbody tr:nth-child(even) {
            background: #f9f9f9;
        }

        tbody tr:hover {
            background: #eaf3ff;
        }

        img {
            border-radius: 6px;
            box-shadow: 0 1px 4px rgba(0,0,0,0.2);
        }

        .action-links a {
            margin: 0 5px;
            text-decoration: none;
            color: #007bff;
            font-weight: bold;
        }

        .action-links a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
<h2>Danh sách Cầu Thủ</h2>

<a href="${pageContext.request.contextPath}/Cauthu/add" class="btn-add">+ Thêm Cầu Thủ</a>

<table>
    <thead>
    <tr>
        <th>STT</th>
        <th>Mã Cầu Thủ</th>
        <th>Họ Tên</th>
        <th>Ngày Sinh</th>
        <th>Kinh Nghiệm</th>
        <th>Vị Trí</th>
        <th>Hình Ảnh</th>
        <th>Thao Tác</th>
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
                <img src="${pageContext.request.contextPath}${cauthu.image}"
                     alt="Ảnh cầu thủ" width="100" height="130"/>
            </td>
            <td class="action-links">
                <a href="${pageContext.request.contextPath}/Cauthu/delete/${cauthu.maCauThu}"
                   onclick="return confirm('Bạn có chắc muốn xóa cầu thủ này?');">Xóa</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
