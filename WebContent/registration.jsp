<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
<h1 align="center">Registration Page!</h1>
	<form action="RegistrationServlet" method="post">
		<table align="center">
			<tr>
				<td><label>Name</label></td>
				<td><input type="text" name="name" placeholder="Full name" /></td>
			</tr>
			<tr>
				<td><label>Email</label></td>
				<td><input type="email" name="email" placeholder="abc@xyz.com" /></td>
			</tr>
			<tr>
				<td><label>Password</label></td>
				<td><input type="password" name="password" placeholder="password" /></td>
			</tr>
			<tr>
				<td><label>Phone</label></td>
				<td><input type="number" name="phone" placeholder="987654321" /></td>
			</tr>
			<tr>
				<td><label>Gender</label></td>
				<td><input type="radio" name="gender" value="Male">Male</input><input
					type="radio" name="gender" value="Female">Female</input></td>
			</tr>
			<tr>
				<td><!-- <input type="reset" value="Reset" /> --></td>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form>
</body>
</html>