package com.cetpa.servlets;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class FileUploader extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		try
		{
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		
		// check if the request of client do has the multipart content
		// or not
		if(ServletFileUpload.isMultipartContent(request))
		{
			// create object of DiskFileItemFactory
			DiskFileItemFactory factory = new DiskFileItemFactory();
			
			// create object of ServletFileUpload and associate it with
			// DFIF
			ServletFileUpload upload = new ServletFileUpload(factory);
			
			// parse the object of request into tokens (parts)
			// each part will be denoted by FileItem interface
			List<FileItem> listOfItems = upload.parseRequest(request);
			
			String str = "";
			
			File file = null;
			
			// fetch the data from the list using for-each loop
			for(FileItem item : listOfItems)
			{
				// check if the form is having normal type of data
				// like text-field or checkboxes
				if(item.isFormField())
				{
					// fetch the data associated with text-field
					byte[] array = item.get();
					// convert array of byte to string
					str = new String(array);
					// denote this path
					file = new File("g:/"+str);
					// create a folder in this path
					file.mkdir();
				}
				else
				{
					// create a file in given path
					FileOutputStream fo = new FileOutputStream
							(file.getPath()+"\\"+item.getName());
					// store the data of file inside this location
					fo.write(item.get());
				}
			}
			pw.print("<i><p style='color : red; font-size : 35px;'>file has been uploaded</p></i>");
		}	
		else
		{
			pw.print(2);
		}
		}
		catch(Exception e)
		{
			// show error cause at console
			System.out.println(e);
		}
	}
}