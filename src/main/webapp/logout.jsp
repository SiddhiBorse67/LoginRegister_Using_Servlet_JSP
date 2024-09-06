<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Logout</title>
<link rel="stylesheet"  href="indexStyle.css">
</head>
<%@ page import="jakarta.servlet.http.HttpSession" %>
<body>
 <%
        
        HttpSession currentsession = request.getSession(false);
 	if(currentsession !=null)
 	{
 		currentsession.invalidate();
 	}

        
       response.sendRedirect("index.html");
    %>




</body>
</html>