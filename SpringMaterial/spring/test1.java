import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.person;

public class test1 {
public static void main(String[] args) {
	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("abc.xml");
	person p1=(person)ctx.getBean("p1");
	System.out.println(p1.getAge()+" : "+p1.getCity()+" : "+p1.getName());
	person p2=(person)ctx.getBean("p2");
	System.out.println(p2.getAge()+" : "+p2.getCity()+" : "+p2.getName());
	person p3=(person)ctx.getBean("p3");
	System.out.println(p3.getAge()+" : "+p3.getCity()+" : "+p3.getName());
}
}
