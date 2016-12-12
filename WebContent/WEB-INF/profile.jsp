<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="/WEB-INF/c.tld" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My Profile</title>
</head>
<body>
<jsp:include page="/header.jsp" />
${sessionScope.name } your profile details will be listed here.
<table border="1px">
<tr>
<th>Course Name</th>
<th>trainer Name</th>
<th>Module Name</th>
<th>Enroll</th>
</tr>
<c:forEach var="course" items="${sessionScope.modules}">
<c:forEach var="module" items="${course.modules}">

<tr>
<td>${course.name}</td>
<td>${course.trainer}</td>
<td>${module}</td>
<td><a href="EnrollmentServlet?courseName=${course.name}&moduleName=${module}">Enroll</a></td>
</tr>

 
</c:forEach>
</c:forEach>
</table>
<!-- Enrolled -->

<table border="1px">
<tr>
<th>Course Name</th>
<th>Module Name</th>
</tr>
<c:forEach var="enrlModule" items="${sessionScope.enrlModules}">
<tr>
<c:forEach var="data" items="${enrlModule}">
<td>${data}</td>
</c:forEach>
</tr>
</c:forEach>
</table>
<jsp:include page="/footer.jsp" />
</body>
</html>