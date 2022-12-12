<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="model.User" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User page</title>
</head>
<body>
	<%User user = (User) session.getAttribute("user"); %>
	<h1>Welcome <%=user.getUserName() %> </h1>
	<button><a href="index.jsp">Home</a></button>
</body>
</html>