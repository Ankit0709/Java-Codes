package com.asad.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
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
}