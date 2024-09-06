<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>welcome</title>
<link rel="stylesheet"  href="indexStyle.css">
</head>
<%@ page import="jakarta.servlet.http.HttpSession" %>
<body>
 <%
        
        HttpSession session1 = request.getSession(false);

        
        if (session1 != null && session1.getAttribute("username") != null) {
           
            String username = (String) session1.getAttribute("username");
    %>
<div class="container">
<h1>Welcome ,<%= username%></h1>
<h2>"Software is a great combination between artistry and engineering."</h2>
<h4>Feel free to contact with us</h4>
<a href="logout.jsp"> Logout</a>


</div>
<%
        } else {
            // Redirect to the login page if the session is not valid
            response.sendRedirect("login.jsp");
        }
    %>
</body>
</html>