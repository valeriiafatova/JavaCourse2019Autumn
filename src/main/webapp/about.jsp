<!doctype html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<fmt:setLocale value="${locale}"/>
<fmt:setBundle basename="${bundle}"/>

<html>
<body>
ABOUT PAGE <br>
Locale: ${locale} <br>
Bundle: ${bundle} <br>
<fmt:message key="greeting"/>
</body>
</html>
