<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="styles/createStyle.css">
    <title>Client creating</title>
</head>
<body>
<h3><a href="index.jsp">Home</a></h3>
<hr>
<h2>Client creating</h2>
<div class="form_wrapper">
    <form action="create" method="POST">
        <ul>
            <li class="form_line">
                <label for="name"><b>Name:</b></label>
                <input type="text" id="name" name="name" required maxlength="100" pattern="^[-,.А-Яа-яЁё\s]+$">
            </li>
            <li class="form_line">
                <label for="type"><b>Type:</b></label>
                <select id="type" name="type" required>
                    <option value="1">Individual</option>
                    <option value="2">Legal</option>
                </select>
            </li>
            <li class="form_line">
                <label for="date"><b>Date:</b></label>
                <input type="date" id="date" name="date" required>
            </li>
            <li class="form_line">
                <label for="ip"><b>IP-address:</b></label>
                <input type="text" id="ip" name="ip" required minlength="7" maxlength="15" size="15"
                       pattern="^((\d{1,2}|1\d\d|2[0-4]\d|25[0-5])\.){3}(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])$"
                       placeholder="127.0.0.1">
            </li>
            <li class="form_line">
                <label for="mac"><b>Mac-address:</b></label>
                <input type="text" id="mac" name="mac" required pattern="^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$">
            </li>
            <li class="form_line">
                <label for="model"><b>Model:</b></label>
                <input type="text" id="model" name="model" required>
            </li>
            <li class="form_line">
                <label for="address"><b>Address:</b></label>
                <input type="text" id="address" name="address" required>
            </li>
            <li class="form_line"><input type="submit" value="Save"></li>
        </ul>
    </form>
</div>
</body>
</html>
