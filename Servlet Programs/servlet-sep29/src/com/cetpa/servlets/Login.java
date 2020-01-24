package com.cetpa.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException 
	{
		if(request.getParameter("email").equalsIgnoreCase("a@a.com")
				&& request.getParameter("password").equals("Abc"))
		{
			request.getSession().setAttribute("login",1);
			response.sendRedirect("index.html");
		}
		else
		{
			response.getWriter().println("invalid username and password");
		}
	}
}