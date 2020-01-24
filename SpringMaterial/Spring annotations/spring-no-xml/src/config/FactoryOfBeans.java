package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import beans.Tiger;

@Configuration // this is a bean factory same as that xml file
// which has dependencies
@ComponentScan("beans")
public class FactoryOfBeans 
{
	// create a method
	// in this create object of bean
	// an return it
	@Bean // this is a bean
	public Tiger getTiger()
	{
		return new Tiger();
	}
}