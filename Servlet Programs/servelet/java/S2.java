package org.cetpa.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// associate a url with the servlet
@WebServlet("/2")

// inherit HttpServlet in order to become a servlet
public class S2 extends HttpServlet
{
	// override service() method
	@Override
	protected void service(HttpServletRequest request, 
			HttpServletResponse response) 
			throws ServletException, IOException 
	{
		// set the MIME
		response.setContentType("text/html");

		// get the object of PrintWriter to show the data of servlet at client side
		PrintWriter p = response.getWriter();

		// show the data at client side
		p.println("<h3>this is servlet s2</h3>");
	}
}