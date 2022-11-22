<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Client creating</title>
</head>
<body>
<h3><a href="index.jsp">Home</a></h3>
<hr>
<h2>Client creating</h2>
<form action="create" method="POST">
    <p>
        <label for="name"><b>Имя:</b></label>
        <input type="text" id="name" name="name">
    </p>
    <p>
        <label for="type"><b>Тип:</b></label>
        <select id="type" name="type">
            <option value="1">Тип №1</option>
            <option value="2">Тип №2</option>
        </select>
    </p>
    <p>
        <label for="date"><b>Дата:</b></label>
        <input type="date" id="date" name="date">
    </p>
    <p><input type="submit" value="Save">
</form>

</body>
</html>
