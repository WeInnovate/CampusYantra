<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Courses</title>
</head>
<body>
<jsp:include page="header.jsp" />
<c:forEach var="course" items="${courses}">
${course} <a href="EnrollmentServlet">Enroll</a> <br>
</c:forEach>
<jsp:include page="footer.jsp" />
</body>
</html>