package session;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session-demo")
public class DemoHttpSession extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		response.setContentType("text/html");
		/*
		 getSession() will create a cookie named as JSESSIONID and will send it to client
		 This cookie will be received when the client re-visit the Servlet
		 */
		HttpSession session = request.getSession();
		
		PrintWriter pw = response.getWriter();
		
		if(session.isNew())
		{
			pw.println("<h3>first request</h3>");
		}
		else
		{
			pw.println("<h4>client revisit</h4>");
		}
		
		// get session id
		String id = session.getId();
		
		// get creation and last access time and timeout
		long t1 = session.getCreationTime();
		long t2 = session.getLastAccessedTime();

		// set timeout value
		session.setMaxInactiveInterval(30);
		
		int t3 = session.getMaxInactiveInterval();
		
		// convert the milliseconds into actual date
		Date d1 = new Date(t1);
		Date d2 = new Date(t2);
		
		
		pw.println("<center>\r\n" + 
				"	<table border=\"1\">\r\n" + 
				"		<tr>\r\n" + 
				"			<td>JSESSIONID</td>\r\n" + 
				"			<td>"+id+"</td>\r\n" + 
				"		</tr>\r\n" + 
				"		<tr>\r\n" + 
				"			<td>Creation-time</td>\r\n" + 
				"			<td>"+d1+"</td>\r\n" + 
				"		</tr>\r\n" + 
				"		<tr>\r\n" + 
				"			<td>Last-Access</td>\r\n" + 
				"			<td>"+d2+"</td>\r\n" + 
				"		</tr>\r\n" + 
				"		<tr>\r\n" + 
				"			<td>Timeout</td>\r\n" + 
				"			<td>"+t3+"</td>\r\n" + 
				"		</tr>\r\n" + 
				"		<tr>\r\n" + 
				"			<td><a href=\"session-demo\">reload</a></td>\r\n" + 
				"			<td><a href=\"#\">logout</a></td>\r\n" + 
				"		</tr>\r\n" + 
				"	</table>\r\n" + 
				"</center>\r\n" + 
				"");	
	}
}