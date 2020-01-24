package com.asad.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler 
{
	@ExceptionHandler(Exception.class)
	public String showErrorPage(Exception e, Model m)
	{
		m.addAttribute("ex", e);
		return "error-page";
	}
}