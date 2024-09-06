<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet"  href="style.css">
</head>
<body>
<div class="container">
<h1>Login</h1>
<form action="LoginS" method="post">
	<label for="username">Username: </label>
	<input type="text" id="username" name="username">
	<br>
	<label for="password">Password: </label>
	<input type="text" id="password" name="password">
	<br>
	<button type="submit">Login</button>
	
	
</form>
<p><a href="index.html">back to home</a></p>
 <% String error = request.getParameter("error");
            if (error != null && error.equals("1")) { %>
                <p style="color: red;">Invalid username or password. Please try again.</p>
        <% } %>
             <% String rs = request.getParameter("registration");
            if (rs != null && rs.equals("success")) { %>
                <p style="color: purple;">Your Registration is Successful. Please Login.</p>
        <% } %>
</div>
</body>
</html>