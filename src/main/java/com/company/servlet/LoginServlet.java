package com.company.servlet;
import com.company.Auth.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class LoginsServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private static UserAuth userauth=new UserAuthAdd();
    
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		String username=request.getParameter("username");
		String password=request.getParameter("password");
	    if (userauth.isValidUser(username, password)) {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            response.sendRedirect("welcome.jsp");
            System.out.println("Hi - "+username);
        } else {
            response.sendRedirect("login.jsp?error=1");
        	System.out.println("Error");
        }
	}

}
