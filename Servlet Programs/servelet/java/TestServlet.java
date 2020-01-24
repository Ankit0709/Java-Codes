package org.cetpa.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// associate a url with the servlet
@WebServlet("/test")

// inherit HttpServlet in order to become a servlet
public class TestServlet extends HttpServlet
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
		String email = request.getParameter("u_email");
		String gender = request.getParameter("u_gender");
		String desp = request.getParameter("u_desc");
		// fetch the values of check boxes
		String[] values = request.getParameterValues("u_int");
		
		// get the object of PrintWriter to show the data of servlet at client side
		PrintWriter p = response.getWriter();
		
		
		p.println("<body style='background-image: a.jpg;'>");
		
		// show the data at client side
		p.println("<ul>");
		p.println("<li>"+email+"</li>");
		p.println("<li>"+gender+"</li>");
		p.println("<li>"+desp+"</li>");
		
		if(values != null)
		{
			p.println("<ol>");
			for (int i = 0; i < values.length; i++) 
			{
				p.println("<li>"+values[i]+"</li>");
			}
			p.println("</ol>");
		}
		else
		{
			p.println("<i>no interest selected</i>");
		}
		
		p.println("</ul>");
		
		if(gender.equals("male"))
		{
			p.println("<img src='a.jpg' width='250' height='250'>");
		}
		else
		{
			p.println("<img src='k.jpg' width='250' height='250'>");
		}
		
		p.println("</body>");
	}
}