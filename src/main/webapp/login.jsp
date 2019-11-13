<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Login</title>
    <base href="${pageContext.request.contextPath}/">
</head>
<body>

<c:if test="${not empty error}">
<c:out value ="${error}"/>
</c:if>
<form action="login" method="post">
    Login:<input type="login" name="login"/><br/>
    Password:<input type="password" name="password"/><br/>

    <input type="submit" value="login">

</form>
</body>
</html>
