<%--
  Created by IntelliJ IDEA.
  User: NGUYEN DUC HIEU
  Date: 17/09/2025
  Time: 1:16 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Chi tiết Cầu Thủ</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f4f6f9;
            margin: 20px;
        }
        h2 {
            text-align: center;
            color: #333;
        }
        .detail-box {
            width: 60%;
            margin: 20px auto;
            background: #fff;
            padding: 20px;
            box-shadow: 0 2px 8px rgba(0,0,0,0.1);
            border-radius: 8px;
        }
        .detail-box img {
            display: block;
            margin: 10px auto;
            border-radius: 6px;
            box-shadow: 0 1px 4px rgba(0,0,0,0.2);
        }
        p {
            font-size: 16px;
            margin: 8px 0;
        }
    </style>
</head>
<body>
<h2>Chi tiết Cầu Thủ</h2>
<div class="detail-box">
    <p><b>Mã Cầu Thủ:</b> ${cauthu.maCauThu}</p>
    <p><b>Họ Tên:</b> ${cauthu.hoTen}</p>
    <p><b>Ngày Sinh:</b> ${cauthu.ngaySinh}</p>
    <p><b>Kinh Nghiệm:</b> ${cauthu.kinhNghiem}</p>
    <p><b>Vị Trí:</b> ${cauthu.vitri}</p>
    <img src="${pageContext.request.contextPath}${cauthu.image}"
         alt="Ảnh cầu thủ" width="200"/>
</div>
</body>
</html>

