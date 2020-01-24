package boot.webservice;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyErrorHandler implements ErrorController
{
	public String getErrorPath() 
	{
		return "/error";
	}
	
	@RequestMapping(value="/error")
	public String showErrorPage()
	{
		return "404.html";
	}
}