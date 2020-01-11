<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1px solid black">
    <thead>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>sign</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.sign}</td>
        </tr>
    </c:forEach>

    </tbody>
</table>
</body>
</html>
