package com.cetpa.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class MyFilter implements Filter
{
	@Override
	public void destroy() 
	{
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, 
			FilterChain chain)
			throws IOException, ServletException
	{	
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		
		HttpServletRequest req2 = (HttpServletRequest) request;
		
		System.out.println(req2.getSession());
		
		Object o = new String();
		String s = (String) o;

		o = new Object();
		s = (String) o;
		
		pw.println("<b>this is pre-processing at request time</b>");
	
		chain.doFilter(request, response);
		
		pw.println("<i>this is post-processing at response time</i>");		
	}

	@Override
	public void init(FilterConfig config) throws ServletException 
	{
	}

}