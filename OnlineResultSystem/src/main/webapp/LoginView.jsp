<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<h1>Login</h1>
<center>
	<body>
		<%@ include file="HeaderView.jsp"%>
		<form>
			<table>

				<tr>

					<td>User ID*</td>
					<td><Input type="text" name="userid"></td>
				</tr>

				<tr>

					<td>password*</td>
					<td><Input type="password" name="password"></td>
				</tr>

				<tr>

					<td></td>

					<td><button type="Submit" value="Submit">Submit</button></td>
					<td><button type="Submit" value="Submit">Sign Up</button></td>

				</tr>

			</table>
		</form>

		<a href="url">Forget password</a>
		<%@ include file="FooterView.jsp"%>
	</body>
</center>
</html>