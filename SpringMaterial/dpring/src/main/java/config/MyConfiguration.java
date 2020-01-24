package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import dao.PersonDAO;

@Configuration
public class MyConfiguration 
{
	// create a data-source
	public DriverManagerDataSource dataSource()
	{
	// create object
	DriverManagerDataSource dmds = new DriverManagerDataSource();
	
	// provide database related info to the dmds
	dmds.setDriverClassName("com.mysql.jdbc.Driver");
	dmds.setUrl("jdbc:mysql://localhost:3306/persons");
	dmds.setUsername("root");
	dmds.setPassword("ankit");
	System.out.println(1);
	// return object
	return dmds;
	}
	
	@Bean
	public JdbcTemplate template()
	{
	// create object
	JdbcTemplate template = new JdbcTemplate();	
	template.setDataSource(dataSource());
	System.out.println(2);
	return template;
	}
	
	@Bean
	public PersonDAO personDAO()
	{
		return new PersonDAO();
	}
	
	{
		System.out.println("object of configuration");
	}
	
	
}