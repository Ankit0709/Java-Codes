package dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import beans.Person;

public class PersonDAO 
{
	@Autowired
	private JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public String savePerson(Person person)
	{
	String sql = "insert into person (id, name, age, city) values(?,?,?,?)";	
	// execute this query
	return (template.update(sql, person.getId(), person.getName(),
			person.getAge(), person.getCity()) > 0) ? 
					"object saved" : "object not saved";
	}
	
	public Person getPerson(int id)
	{
		String query="select * from person where id=?";
		Object[] args= {id};
		ImpRowMapper mapper=new ImpRowMapper();
		return template.queryForObject(query, args, mapper);
		
	}
	public List<Person> getPerson2()
	{
		String query="select * from person";
		ImpRowMapper mapper=new ImpRowMapper();
		return template.query(query,mapper);
	}
	
	
	{
		System.out.println("object of dao");
	}
	
}