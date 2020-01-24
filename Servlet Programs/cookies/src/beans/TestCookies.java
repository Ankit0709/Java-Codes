package beans;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestCookies")
public class TestCookies extends HttpServlet 
{
	public void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		response.setContentType("text/html");

		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		PrintWriter pw = response.getWriter();
		
		// fetch all the cookies from the client side
		Cookie[] cookies = request.getCookies();
		
		if(cookies == null)
		{
			pw.print("first visit");
			
			// create cookies
			Cookie c1 = new Cookie("c1", email);
			Cookie c2 = new Cookie("c2", password);
			
			// set the age of cookie
			c1.setMaxAge(-1);
			c2.setMaxAge(-1);
			
			// send cookies to the client
			response.addCookie(c1);
			response.addCookie(c2);
		}
		else
		{
			response.sendRedirect("abc.html");
//			pw.println("revisit<br>");
//			
//			for (int i = 0; i < cookies.length; i++) 
//			{
//				pw.println("name = "+cookies[i].getName()+", value = "+cookies[i].getValue());
//			}
		}
				
	}
}
