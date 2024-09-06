package com.company.Auth;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.company.model.User;
import com.company.util.DatabaseConnection;
//import com.company.util.*;
public class UserAuthAdd implements UserAuth {

	public boolean addUser(User user)
	{
//		 try
//	        {
//	            Class.forName("com.mysql.cj.jdbc.Driver");
//	        }catch(ClassNotFoundException e)
//	        {
//	            System.out.println(e.getMessage());
//	        }
		String query="insert into users(username,email,password) values (?,?,?)";
		try(Connection con=DatabaseConnection.getConnection();
				 PreparedStatement preparedstatement=con.prepareStatement(query)	)
		{
			
		
//		  Connection con= DriverManager.getConnection(url,username1,password1);
//		 PreparedStatement preparedstatement=con.prepareStatement(query);
         preparedstatement.setString(1,user.getUsername());
         preparedstatement.setString(2,user.getEmail());
         preparedstatement.setString(3,user.getPassword());
         int rowaffected=preparedstatement.executeUpdate();
         System.out.println("User added");
         return rowaffected >0;
         
		}
		catch(SQLException e)
        {
            System.out.println(e.getMessage());
            return false;

        }
	}
	public boolean isValidUser(String username,String password)
	{
//		 try
//	        {
//	            Class.forName("com.mysql.cj.jdbc.Driver");
//	        }catch(ClassNotFoundException e)
//	        {
//	            System.out.println(e.getMessage());
//	        }
		String query="select * from users where username=? and password=?";
		try(Connection con=DatabaseConnection.getConnection();
				 PreparedStatement preparedstatement=con.prepareStatement(query)	)
		{
//			 Connection con= DriverManager.getConnection(url,username1,password1);
//			 PreparedStatement preparedstatement=con.prepareStatement(query);

	            preparedstatement.setString(1, username);
	            preparedstatement.setString(2, password);

	            ResultSet resultSet = preparedstatement.executeQuery();
	            System.out.println("Query executed");
	            return resultSet.next();
		}
		catch(SQLException e)
        {
            System.out.println(e.getMessage());
            return false;

        }
	}
}
