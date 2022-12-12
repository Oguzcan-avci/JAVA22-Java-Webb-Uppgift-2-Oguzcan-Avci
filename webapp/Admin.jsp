<%@page import="model.Admin"%>
<%@page import="org.eclipse.jdt.internal.compiler.ast.IfStatement"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin login </title>
</head>
<body>
	<h2 align ="center">Please enter your login information</h2> <br/><br/>
	<h3 align ="center">Admin page</h3>
	
	<%
		if(session.getAttribute("admin") != null){
			response.sendRedirect("AdminSuccess.jsp");
		}
	%>
	
	<form  action="AdminServlet" method="POST" align="center" >
		User: <input type="text" name="admin"/><br/><br/>
		Password: <input type="password" name="adminPassword"/><br/><br/>
		<input type="submit" value="Login" />
	</form>
	<button><a href="index.jsp">Home</a></button> 	
</body>
</html>