<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="/WEB-INF/c.tld" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:if test="${sessionScope.name != null }">
Welcome <b>${sessionScope.name}</b>
<a href="ProfileServlet">Profile</a>
<a href="LogoutServlet">Logout</a>
</c:if>
<c:if test="${sessionScope.name == null }">
${'Welcome Guest'}
<a href="login.jsp">Login</a>
<a href="registration.jsp">Registration</a>
</c:if>
<hr>
</body>
</html>