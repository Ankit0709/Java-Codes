package dao;

import org.springframework.jdbc.core.JdbcTemplate;

import beans.Car;

public class ImpCarDao implements CarDao 
{
	// create a ref var of jdbc-template
	private JdbcTemplate jtemp;

	@Override
	public void insertCar(Car c) 
	{
	// create a query
	String query = "insert into car values(?,?,?)";
	
	// create an array of Object class to store the data
	// to be provided in place of ? marks
	Object[] args = {c.getName(),c.getType(),c.getMaker()};

	// execute the query using given arguments
	jtemp.update(query, args);
	}

	// getter and setter for jdbc-template
	public JdbcTemplate getJtemp() {
		return jtemp;
	}

	public void setJtemp(JdbcTemplate jtemp) {
		this.jtemp = jtemp;
	}
}