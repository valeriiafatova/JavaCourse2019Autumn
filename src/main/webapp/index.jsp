<!doctype html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <base href="${pageContext.request.contextPath}/">
</head>
<body>

User in session ${user.name}
<br>
<c:import url="navigation.jsp"/>
</body>
</html>
