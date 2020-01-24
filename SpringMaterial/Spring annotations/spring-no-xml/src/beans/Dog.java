package beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Dog 
{
	public Dog() 
	{
		System.out.println("object of dog created with address "+this);
	}
}
