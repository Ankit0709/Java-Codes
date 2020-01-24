package beans;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class FirstPage extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		response.setContentType("text/html");

		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		PrintWriter pw = response.getWriter();
		
		// fetch all the cookies from the client side
		Cookie[] cookies = request.getCookies();
		
		String forEmail = "", forPassword = "";
		
		if(cookies == null)
		{
			
		}
		else
		{
//			forEmail = cookies[0].getValue();
//			forPassword = cookies[1].getValue();
		}		
		
		pw.println("<!DOCTYPE html>\r\n" + 
				"<html> \r\n" + 
				"<head>   \r\n" + 
				"<meta charset= \"ISO-8859-1 \">   \r\n" + 
				"<title>Insert title here</title>   \r\n" + 
				"</head>   \r\n" + 
				" <body>   \r\n" + 
				" <form action= \"TestCookies\" method= \"post\">   \r\n" + 
				" Email<br>   \r\n" + 
				" <input type= \"email\" name= \"email\" value=\""+ forEmail + "\" required><br>   \r\n" + 
				" Password<br>   \r\n" + 
				" <input type= \"password\" name= \"password\" value=\"" + forPassword + "\"  required><br>   \r\n" + 
				" <input type= \"submit\" value= \"login\">   \r\n" + 
				" </form>   \r\n" + 
				" </body>   \r\n" + 
				" </html>\r\n" + 
				"");
		
	}
}
