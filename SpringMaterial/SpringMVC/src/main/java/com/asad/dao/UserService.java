package com.asad.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import com.asad.modles.User;

@Service
public class UserService 
{
	@Autowired
	private NamedParameterJdbcTemplate template;

	public int saveUserData(User user) 
	{
		String sql = "insert into user values(:user_name,:user_city)";
	
		Map<String, String> map = new HashMap<String, String>();
		map.put("user_name", user.getName());
		map.put("user_city", user.getCity());
		
		return template.update(sql, map);
	}
	
	public List<User> getAllUsers()
	{
		String sql = "select * from user";
		return template.query(sql, new ImpRowMapper());
	}
}

class ImpRowMapper implements RowMapper<User> // name of class jiska data fetch karna hai
{
	@Override
	public User mapRow(ResultSet rs, int records) throws SQLException 
	{
		System.out.println(">>>records="+records);
		// fetch data from the RS and store that inside user object
		User user = new User(rs.getString("name"), rs.getString("city"));
		return user;
	}
}