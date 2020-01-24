import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// lets associate a URL with this servlet
@WebServlet("/hello")
public class MyFirstServlet extends HttpServlet
{
	public void service(HttpServletRequest request,
			HttpServletResponse response)
	throws IOException
	{
		System.out.println("service method executes");
		
		// lets get the object pf PrintWriter class to show
		// the data at client side
		PrintWriter pw = response.getWriter();
		
		// show the data at client side
		pw.println("<p>hello</p> <h3>client</h3> <i>kaise</i>"
				+ "<b style='color : red;'> ho</b>");
	}
}