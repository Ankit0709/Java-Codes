package com.cetpa.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/info")
public class Info extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException 
	{
		Integer status = (Integer) request.getSession().getAttribute("login");
		
		String url1 = "<a href='contact-us.html'>contact-us</a>";
		String url2 = "<a href='about-us.html'>about-us</a>";
		
		if(status != null)
		{
			response.getWriter().println(url1+"<br>"+url2);
		}
		else
		{
			response.setContentType("text/html");
			response.getWriter().println("<i>please login first</i>");
			response.getWriter().println("<a href='index.html'>to login click here</a>");
		}
		
	}
}