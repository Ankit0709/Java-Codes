package com.cetpa.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet02 extends HttpServlet
{
		@Override
		protected void service(HttpServletRequest request, HttpServletResponse response) 
				throws ServletException, IOException 
		{
			PrintWriter pw = response.getWriter();
			
			pw.print("<h4>service of Myservlet02</h4>");
		}
}
