<%@ page import="java.sql.ResultSet" %>
<%@ page import="org.apache.taglibs.standard.tag.common.sql.ResultImpl"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.study.bean.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<html>
<body>
        <% out.print("hello world"); %>
<sql:setDataSource driver="com.mysql.cj.jdbc.Driver" user="root" password="root" url="jdbc:mysql://localhost:3306/mybatistest?characterEncoding=utf8&useSSL=true&serverTimezone=UTC" scope="application" var="test"></sql:setDataSource>

<sql:query var="res" sql="select * from user" dataSource="${test}" scope="session"></sql:query>
<%
        List<User> list=new ArrayList();
        list.add(new User("admin","123456"));
        list.add(new User("system","789654"));
        list.add(new User("super","46546465"));
        session.setAttribute("list",list);
%>
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
