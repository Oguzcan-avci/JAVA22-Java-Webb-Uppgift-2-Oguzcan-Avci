<%@page import="java.awt.desktop.UserSessionEvent"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User login </title>
</head>
<body>
	<h2 align ="center">Please enter your login information</h2> <br/><br/>
	<h3 align ="center">User page</h3>
	
	<%
		if(session.getAttribute("user") != null){
			response.sendRedirect("UserSuccess.jsp");
		}
	%>
	<form  action="UserServlet" method="POST" align="center" >
		User: <input type="text" name="user"/><br/><br/>
		Password: <input type="password" name="userPassword"/><br/><br/>
		<input type="submit" value="Login" />
	</form>
	<button><a href="index.jsp">Home</a></button>
	
</body>
</html>