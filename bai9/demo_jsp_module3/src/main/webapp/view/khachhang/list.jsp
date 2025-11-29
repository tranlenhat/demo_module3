<%--
  Created by IntelliJ IDEA.
  User: LE NHAT
  Date: 27/11/2025
  Time: 8:45 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <c:import url="../layout/library.jsp"/>
</head>
<body>
<c:import url="../layout/navbar.jsp"/>
<H1>Danh Sach Khach Hang</H1>
<table  class="table table-dark table-striped">
    <tr>
        <th>STT</th>
        <th>Ten</th>
        <th>Ngay Sinh</th>
        <th>Dia Chi</th>
        <th>Anh</th>
    </tr>
    <c:forEach var="khachhang" items="${khachHangList}" varStatus="status">
        <tr>
            <td>${status.count}</td>
            <td>${khachhang.getTen}</td>
            <td>${khachhang.getNgaySinh}</td>
            <td>${khachhang.getDiaChi}</td>
            <td>${khachhang.getAnh}</td>
        </tr>
    </c:forEach>
    <tr>
        <c:if test="${khachhangList.isEmpty()}">
            <td colspan="6">Danh sách trống</td>
        </c:if>

    </tr>
</table>
</body>
</html>
