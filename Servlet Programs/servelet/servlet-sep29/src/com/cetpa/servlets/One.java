package com.cetpa.servlets;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class One extends HttpServlet
{
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		// specify MIME
		response.setContentType("text/html");
		
		// get print-writer
		PrintWriter p = response.getWriter();
		
		// get the object of servlet-context
		ServletContext ctx = super.getServletContext();

		// get the root folder for the server
		String root = ctx.getRealPath("/");

		// create path of our folder
		String folderPath = root + "my-files";
		
		// lets denote this path using File class
		File file = new File(folderPath);
		
		// get the list of all the sub-folders and files available inside this path
		File[] files = file.listFiles();
		
		// store the data inside the object of servlet-context
		ctx.setAttribute("file-array", files);
		ctx.setAttribute("file-path", folderPath);
		
		p.print("\r\n" + 
				"<table border='1'>\r\n" + 
				"<th>Id</th><th>NAME</th><th>SIZE</th><th>TYPE</th><th></th><th></th>\r\n");
		
		// fetch data of arrayile using for loop
		for (int i = 0; i < files.length; i++) 
		{
			// get file name
			String filename = files[i].getName();

			// get file size
			long filesize = files[i].length();
			
			// get the extension of file
			String fileext = filename.substring(filename.lastIndexOf(".") + 1);
			
			// start a row
			p.println("<tr>");
			p.println("<td>"); p.println(i + 1); p.println("</td>");
			p.println("<td>"); p.println(filename); p.println("</td>");
			p.println("<td>"); p.println(filesize); p.println("</td>");
			p.println("<td>"); p.println(fileext); p.println("</td>");
			p.println("<td>"); p.println("<a href=2?id="+i+"&click=v>view</a>"); p.println("</td>");
			p.println("<td>"); p.println("<a href=2?id="+i+"&click=d>download</a>"); p.println("</td>");
			
			// complete a row
			p.println("</tr>");
		}
		p.println("</table>");
		
	}
}
