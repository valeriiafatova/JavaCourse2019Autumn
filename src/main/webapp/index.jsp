<html>
<body>
<%--Declaration--%>
<%! String defaultGreeting = "Hi!"; %>
<%--Scriptlet--%>
<% String locale = (String) request.getAttribute("locale");%>
<%--Expression--%>
<%=getGreeting(locale)%>

</p>

Locale = <%=locale%>
<%! public String getGreeting(String locale) {
    return locale == null || locale.length() == 0 || locale.equals("en") ? defaultGreeting : "Privet!";
} %>

</body>
</html>
