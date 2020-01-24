package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import beans.Person;

public class ImpRowMapper implements RowMapper<Person> {

	public Person mapRow(ResultSet rs, int nora) 
			throws SQLException {
		System.out.println("No of records fetch: "+nora);
		return new Person(rs.getInt("id"),rs.getString("name"),rs.getString("city"),rs.getFloat("age"));
	}

}
