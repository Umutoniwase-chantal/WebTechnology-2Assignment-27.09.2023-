package com.auca.service;

import java.io.IOException;
//import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet(name="/LoginServet")
public class LoginServet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	public LoginServet() {
		super();
	}
	private static final String Myset_username = "uwaseneza";
	private static final String Myset_password = "uwaseneza";
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServerException, IOException {
		String enterdUsername = req.getParameter("username");
		String enteredPassword = req.getParameter("password");
		
		if(Myset_username.equals(enterdUsername)&&Myset_password.equals(enteredPassword)) {
			res.sendRedirect("Home.html");
		}else {
			res.sendRedirect("forgotPassword.html");
		}
	}
}
