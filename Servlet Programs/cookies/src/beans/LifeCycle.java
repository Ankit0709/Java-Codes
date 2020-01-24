package beans;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lc")
public class LifeCycle extends HttpServlet 
{
	int counter = 1;
	
	public void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		response.setContentType("text/html");

		System.out.println("service executes "+counter+ " times");
		System.out.println("object of servlet "+this);
		System.out.println("request "+request);
		System.out.println("response "+response);
		System.out.println(Thread.currentThread().getId());
				
		counter++;
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException 
	{
		super.init(config);
		System.out.println("init");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy");
	}
}
