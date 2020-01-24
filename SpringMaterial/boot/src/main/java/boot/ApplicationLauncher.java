package boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication

public class ApplicationLauncher 
{
	public static void main(String[] args) 
	{
		ApplicationContext ctx = SpringApplication.run(ApplicationLauncher.class, args);
		System.out.println("Äpplication started with "+ctx);
	}
}