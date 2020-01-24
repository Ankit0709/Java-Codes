package launcher;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.Person;
import config.MyConfiguration;
import dao.PersonDAO;

public class ApplicationLauncher2 
{
	public static void main(String[] args) 
	{
	// start the container
	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext
			();
	
	// lets register the configuration class with container
	ctx.register(MyConfiguration.class);
	
	// refresh the container
     ctx.refresh();
	
	// fetch object of dao from container
	PersonDAO obj = ctx.getBean(PersonDAO.class);
	
	// create object of person and save it using dao
//	System.out.println(
//			obj.savePerson(new Person(3, "Geeta", "Lucknow", 21)));
	
	List<Person> l1=obj.getPerson2();
	for(Person person:l1)
	{
		System.out.println(person);
	}
	
	}
}