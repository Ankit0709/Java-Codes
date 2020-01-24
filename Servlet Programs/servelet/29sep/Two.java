package com.cetpa.servlets;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Two extends HttpServlet
{
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		// specify MIME
		response.setContentType("text/html");
		
		// fetch the data associate with url
		String index = request.getParameter("id");
		int arrayIndex = Integer.parseInt(index);
		String choice = request.getParameter("click");
		
		// get the object of servlet-context
		ServletContext ctx = super.getServletContext();

		// fetch the data available inside the object of servlet-context
		File[] myFiles = (File[]) ctx.getAttribute("file-array");
		String filepath = (String) ctx.getAttribute("file-path");
		
		// get the file name selected by the client
		String fileName = myFiles[arrayIndex].getName();
		String fileExt = fileName.substring(fileName.lastIndexOf(".") + 1);
		
		String mime =	
		(fileExt.equals("java")) ? "text/plain" :(fileExt.equals("pdf")) ? "application/pdf" : 
			"image/jpeg";

		// specify the browser in what format the data will be shown at the client side
		response.setContentType(mime);
		
		//
		if(choice.equals("v"))
		{
			response.setHeader("Content-Disposition"," inline; filename="+fileName);
		}
		else
		{
			response.setHeader("Content-Disposition"," attachment; filename="+fileName);
		}
		
		// open a file in read mode
		FileInputStream fi = new FileInputStream(filepath + "\\" +fileName);
		
		// get the object of servlet-output-stream
		ServletOutputStream so = response.getOutputStream();
		
		// 
		while(true)
		{
			// fetch a byte from the file
			int myByte = fi.read();
			
			// check for end of file
			if(myByte == -1)
			{
				break;
			}
			
			// send this byte to the client
			so.write(myByte);
		}
		
		// close the file
		fi.close();
	}
}