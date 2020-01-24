package org.cetpa.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// associate a url with the servlet
@WebServlet("/1")

// inherit HttpServlet in order to become a servlet
public class S1 extends HttpServlet
{
	// override service() method
	@Override
	protected void service(HttpServletRequest request, 
			HttpServletResponse response) 
			throws ServletException, IOException 
	{
		// set the MIME
		response.setContentType("text/html");

		// fetch html form data
		String choice = request.getParameter("choice");
		
		// get the object of RequestDispatcher in order to dispatch the object
		// of request from one servlet to another one
		// here we are passing 2 as a url of servlet
		RequestDispatcher rd = request.getRequestDispatcher("2");
		
		// get the object of PrintWriter to show the data of servlet at client side
		PrintWriter p = response.getWriter();

		if(choice.endsWith("1.0"))
		{
			// show the data at client side
			p.println("<h1>this is servlet s1</h1>");
			rd.include(request, response);
		}
		else if(choice.endsWith("2.0"))
		{
			rd.include(request, response);
		}
		else
		{
			rd.forward(request, response);
		}
		

	}
}