package beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestApp 
{
	public static void main(String[] args) 
	{
	// start the container 
	// it will use the annotations
	AnnotationConfigApplicationContext ctx =
			new AnnotationConfigApplicationContext();
	
	// specify the location of package in which the bean-factory
	// is located
	ctx.scan("config");
	
	// refresh the container
	ctx.refresh();	

	// get object of car
	Car c1 = ctx.getBean(Car.class);
	Dog d1 = ctx.getBean(Dog.class);
	Tiger t1 = ctx.getBean(Tiger.class);
	Shikari s = ctx.getBean(Shikari.class);
	
	System.out.println(c1+"\n"+d1+"\n"+t1);
	
	System.out.println("tiger at shikari is "+s.getT());
	
	System.out.println("OK");
	}
}