<%@ page import="com.study.bean.User" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<sql:setDataSource ></sql:setDataSource>--%>
<sql:query var="res" sql="select * from user limit 0,5" dataSource="${test}" scope="session"></sql:query>

<table border="1px solid black">
    <thead>
    <tr>
        <th>username</th>
        <th>password</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${res.rows}" var="row">
        <tr>
            <td>${row.id}</td>
            <td>${row.name}</td>
            <td>${row.sign}</td>
        </tr>
    </c:forEach>

    </tbody>
</table>
</body>
</html>
