package session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Two //extends HttpServlet
{
	public void init()
	{
		System.out.println("init() of Two executes");
	}
	
//	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	super.service(arg0, arg1);
	}
}
