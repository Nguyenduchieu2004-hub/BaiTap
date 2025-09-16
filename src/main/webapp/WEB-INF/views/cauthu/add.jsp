<%--
  Created by IntelliJ IDEA.
  User: NGUYEN DUC HIEU
  Date: 17/09/2025
  Time: 12:22 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Thêm mới Cầu Thủ</title>
</head>
<body>
<h2>Thêm Cầu Thủ Mới</h2>

<form action="${pageContext.request.contextPath}/Cauthu/add" method="post">
    <p>
        <label>Mã Cầu Thủ:</label><br/>
        <input type="text" name="MaCauThu" required/>
    </p>
    <p>
        <label>Họ Tên:</label><br/>
        <input type="text" name="HoTen" required/>
    </p>
    <p>
        <label>Ngày Sinh:</label><br/>
        <input type="date" name="NgaySinh" required/>
    </p>
    <p>
        <label>Kinh Nghiệm:</label><br/>
        <input type="text" name="KinhNghiem" required/>
    </p>
    <p>
        <label>Vị Trí:</label><br/>
        <input type="text" name="Vitri" required/>
    </p>
    <p>
        <label>Ảnh đại diện (URL):</label><br/>
        <input type="text" name="Image"/>
    </p>

    <button type="submit">Lưu</button>
    <a href="${pageContext.request.contextPath}/Cauthu">Hủy</a>
</form>


</body>
</html>

