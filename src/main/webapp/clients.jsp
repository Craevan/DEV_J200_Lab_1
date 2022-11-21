<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="ru">
<head>
  <title>Meal list</title>
</head>
<body>
<h3><a href="index.jsp">Home</a></h3>
<hr>
<h2>Clients</h2>
<table>
  <thead>
  <tr>
    <th>Name</th>
  </tr>
  </thead>
  <jsp:useBean id="clientToList" scope="request" type="java.util.List"/>
  <c:forEach var="client" items="${clientToList}">
    <tr id="client">
      <td>${client.name}</td>
    </tr>
  </c:forEach>
</table>
</body>
</html>