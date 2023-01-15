<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="com.flyaway.AdminLogin"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Password Change</title>
</head>
<body>
	<div class="container">
		<h1>Password Change</h1>
		<%
		if (AdminLogin.isLoggedIn) {
		%>
		<form action="ChangePassword" method="post">
			<div>
				<label>Email address : admin@admin.com</label>
			</div>
			<div>
				<label for="inputPassword">New Password</label> <input
					type="password" name="passwordEntered"
					placeholder="Enter a new password">
			</div>
			<button type="submit">Change Password</button>
		</form>
		<%
		} else {
		out.print("You must Login first");
		}
		%>
	</div>
</body>
</html>
