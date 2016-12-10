<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login to CampusYantra</title>
</head>
<body>
<jsp:include page="header.jsp" />
<form action="LoginServlet" method="post">
<input type="text" name="userName" />
<input type="password" name="password" />
<input type="submit" value="Login" />
</form>
<jsp:include page="footer.jsp" />
</body>
</html>