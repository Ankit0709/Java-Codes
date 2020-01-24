package com.asad.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.asad.dao.UserService;
import com.asad.modles.User;

@Controller
public class MyController 
{
	@RequestMapping("/")
	public String showHomePage()
	{
		return "welcome";
	}
	
	@Autowired
	private UserService service;
	
	@RequestMapping(value="/save-form-data",method=RequestMethod.POST,
			produces="text/html")
	@ResponseBody
	public String saveFormData(@RequestParam("name")String name,@RequestParam("city")String city)
	{
		User user = new User();
		user.setName(name);
		user.setCity(city);
		service.saveUserData(user);
		return "<i>data saved</i><br>"
				+ "<a href=./>goto home page</a>";
	}
}