<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <title>Client list</title>
</head>
<body>
<h3><a href="index.jsp">Home</a></h3>
<hr>
<h2>Clients</h2>
<table>
    <thead>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Type</th>
        <th>Date</th>
        <th>Address</th>
    </tr>
    </thead>
    <jsp:useBean id="clientToList" scope="request" type="java.util.List"/>
    <c:forEach var="client" items="${clientToList}">
        <tr id="client">
            <td>${client.id}</td>
            <td>${client.name}</td>
            <td>${client.type}</td>
            <td><fmt:formatDate type="time" value="${client.added}" pattern="dd.MM.yyyy"/></td>
            <td>${client.addresses}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>