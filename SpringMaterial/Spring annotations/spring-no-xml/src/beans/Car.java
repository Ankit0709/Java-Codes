package beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // this is a bean
@Scope("prototype")
public class Car 
{
	public Car() 
	{
		System.out.println("object of car created with address "+this);
	}
}