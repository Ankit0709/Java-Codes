package com.cetpa.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/d1")
public class Demo1 extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException 
	{
		long t = System.currentTimeMillis();
		
		response.setContentType("text/plain");
		
		response.getWriter().println("at demo1 the time is "+t);
		
		// lets specify the client bole toh web browser ke dont do caching of my 
		// pages
		// http ver 1.0
		response.setHeader("pragma-control","no-cache");
		// http ver1.1
		// must-revalidate : mainly for mozilla firefox
		response.setHeader("cache-control","no-cache, no-store, must-revalidate");
		response.setIntHeader("expires",0);

	}
}