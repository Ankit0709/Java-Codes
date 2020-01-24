import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// lets associate a URL with this servlet
@WebServlet("/dddd")
public class MyFirstServlet2 extends HttpServlet
{
	public void service(HttpServletRequest request,
			HttpServletResponse response)
	throws IOException
	{
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();

		pw.print("<button onclick=\"fx()\">click me</button>\r\n" + 
				"\r\n" + 
				"<SCRIPT>\r\n" + 
				"	function fx()\r\n" + 
				"	{\r\n" + 
				"		window.location=\"https://www.google.com\";\r\n" + 
				"	}\r\n" + 
				"</script>");

	}
}