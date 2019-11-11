<!doctype html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<fmt:setLocale value="${cookie.locale.value}"/>
<fmt:setBundle basename="${cookie.bundle.value}"/>

<html>
<body>
Cookies jsp
Locale: ${cookie.locale.value}
<br>
Bundle: ${cookie.bundle.value}

<br>
<fmt:message key="greeting"/>

</body>
</html>
