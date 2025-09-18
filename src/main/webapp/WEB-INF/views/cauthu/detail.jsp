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
    <p><b>Mã Cầu Thủ:</b> ${cauThu.maCauThu}</p>
    <p><b>Họ Tên:</b> ${cauThu.hoTen}</p>
    <p><b>Ngày Sinh:</b> ${cauThu.ngaySinh}</p>
    <p><b>Kinh Nghiệm:</b> ${cauThu.kinhNghiem}</p>
    <p><b>Vị Trí:</b> ${cauThu.viTri}</p>
    <p><b>Giới tính:</b>
        <c:choose>
            <c:when test="${cauThu.gender == true}">Nam</c:when>
            <c:otherwise>Nữ</c:otherwise>
        </c:choose>
    </p>
    <p><b>Môn học:</b>
        <c:forEach items="${cauThu.subjects}" var="subject">
            <span>${subject} </span>
        </c:forEach>
    </p>
    <img src="${pageContext.request.contextPath}${cauThu.image}"
         alt="Ảnh cầu thủ" width="200"/>
</div>
</body>
</html>
