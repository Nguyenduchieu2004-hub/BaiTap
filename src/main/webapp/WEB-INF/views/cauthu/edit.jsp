<%--
  Created by IntelliJ IDEA.
  User: NGUYEN DUC HIEU
  Date: 18/09/2025
  Time: 2:15 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Chỉnh sửa Cầu Thủ</title>
</head>
<body>
<h2>Chỉnh Sửa Cầu Thủ</h2>

<%-- đang lỗi --%>

<form:form action="/Cauthu/edit"
           method="post"
           modelAttribute="cauThu">

    <p>
        <label>Mã Cầu Thủ:</label><br/>
        <form:input path="maCauThu" required="true"/>
    </p>

    <p>
        <label>Họ Tên:</label><br/>
        <form:input path="hoTen" required="true"/>
    </p>

    <p>
        <label>Ngày Sinh:</label><br/>
        <form:input path="ngaySinh" type="date" required="true"/>
    </p>

    <p>
        <label>Kinh Nghiệm:</label><br/>
        <form:input path="kinhNghiem"/>
    </p>

    <p>
        <label>Vị Trí:</label><br/>
        <form:input path="viTri"/>
    </p>

    <p>
        <label>Ảnh đại diện (URL):</label><br/>
        <form:input path="image"/>
    </p>

    <p>
        <label>Giới tính:</label><br/>
        <form:radiobutton path="gender" value="true"/> Nam
        <form:radiobutton path="gender" value="false"/> Nữ
    </p>

    <p>
        <label>Môn học:</label><br/>
        <form:checkboxes path="subjects" items="${subjects}"/>
    </p>

    <p>
        <button type="submit">Cập nhật</button>
        <a href="${pageContext.request.contextPath}/Cauthu">Hủy</a>
    </p>

</form:form>

</body>
</html>

