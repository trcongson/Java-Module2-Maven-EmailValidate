<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 10/25/2018
  Time: 10:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Validate Email</title>
</head>
<body>
<h1>Validate Email</h1>
<h3 style="color: red">${message}</h3>
<form action="validate" method="post">
<input type="text" name="email"><br>
    <input type="submit" value="Validate">
</form>
</body>
</html>
