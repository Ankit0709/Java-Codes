package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import models.Car;

@Controller
public class MyFirstController 
{
	{
		System.out.println("controller");
	}
	
	@Autowired
	private Car myCar;
	
	@RequestMapping(value="/",produces="text/html")
	//@ResponseBody
	public String showHomePage()
	{
		return "home-page";//"<b style='color : red; font-size : 25;'>"+myCar.getName()+"</b>";
	}
}