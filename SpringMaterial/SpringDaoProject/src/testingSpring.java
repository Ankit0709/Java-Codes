import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import Dao01.InsertIntoInterface;
import beans.Book;

public class testingSpring {
public static void main(String[] args) {
	ClassPathXmlApplicationContext ctx=
			new ClassPathXmlApplicationContext("testing.xml");
	
	InsertIntoInterface i1=(InsertIntoInterface) ctx.getBean("refDao");
	Book b=new Book();
	
	
	System.out.println(i1.getJtemp().getDataSource());
	Scanner s =new Scanner(System.in);
	System.out.println("Enter title");
	String title=s.next();
	System.out.println("Enter author");
	String a=s.next();
	System.out.println("Enter pages total");
	int pages=s.nextInt();
	System.out.println("Enter cost");
	float cost=s.nextFloat();
	System.out.println("Enter publisher");
	String pub=s.next();
	
	
	
	
	b.setTitle(title);
	b.setAuthor(a);
	b.setCost(cost);
	b.setPages(pages);
	b.setPub(pub);
	
	i1.insert(b);
	
	System.out.println("Details inserted!!");
	ctx.close();
	s.close();
}
}
