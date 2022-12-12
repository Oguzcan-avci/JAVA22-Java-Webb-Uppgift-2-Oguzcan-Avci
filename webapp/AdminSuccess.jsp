<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="model.Admin" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin page</title>
</head>
<body>
<%Admin admin = (Admin) session.getAttribute("admin"); %>
	<h1>Welcome <%= admin.getAdminName()%></h1>
	<button><a href="index.jsp">Home</a></button>
</body>
</html>