<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: patel
  Date: 14/2/18
  Time: 2:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        .error{
            color: red;}
    </style>
</head>
<body>

<form:form action="${pageContext.request.contextPath}/check" method="post" modelAttribute="details">

    <label>Name</label>
    <form:input path="name"/>
    <form:errors path="name" cssClass="error"/><br>
    <label>Email</label>
    <form:input path="email"/>
    <form:errors path="email" cssClass="error"/><br>
    <label>Phone</label>
    <form:input path="phone"/>
    <form:errors path="phone" cssClass="error"/><br>
    country:
    <form:select path="city">
    <form:options items="${list}"/>
    </form:select>
    <input type="submit" value="submit">
</form:form>

</body>
</html>
