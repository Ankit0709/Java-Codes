package com.asad.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages={"com.asad.controllers","com.asad.dao"})
@PropertySource(value={"classpath:dbconfig.properties"})
public class MyConfiguration 
{
	@Bean
	public InternalResourceViewResolver resolver()
	{
		InternalResourceViewResolver ref = new InternalResourceViewResolver();
		ref.setPrefix("/");
		ref.setSuffix(".jsp");
		return ref;
	}
	
	DriverManagerDataSource dataSource()
	{
		DriverManagerDataSource dmds = new DriverManagerDataSource();
		dmds.setDriverClassName(environment.getProperty("driver"));
		dmds.setUrl(environment.getProperty("url"));
		dmds.setUsername(environment.getProperty("user"));
		dmds.setPassword(environment.getProperty("password"));
		return dmds;
	}
	
	@Autowired
	private Environment environment;
	
	@Bean
	public NamedParameterJdbcTemplate jdbcTemplate()
	{
		return new NamedParameterJdbcTemplate(dataSource());
	}
}