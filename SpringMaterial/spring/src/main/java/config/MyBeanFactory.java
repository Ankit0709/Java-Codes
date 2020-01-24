package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import models.Car;

@Configuration
@ComponentScan(basePackages={"controllers"})
public class MyBeanFactory 
{
	{
		System.out.println("config");
	}
	
	@Bean
	public InternalResourceViewResolver vr()
	{
		System.out.println("vr");
		InternalResourceViewResolver ur = new InternalResourceViewResolver
				();
		ur.setPrefix("/");
		ur.setSuffix(".jsp");
		
		return ur;
	}
	
	@Bean 
	public Car getACar()
	{
		System.out.println("car");
		return new Car("verna");
	}
}
