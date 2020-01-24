import java.rmi.*;
public class Provider
{
	public static void main(String[] args)
	{
		try
		{
		// create object of BabyURO
		BabyURO obj = new BabyURO();

		// create a url to be associated with the object of BabyURO
		String url = "rmi://192.168.43.237:11111//sunday";	

		// bind the url with the object
		Naming.bind(url, obj);
		
		System.out.println("Provider is waiting for the Consumer of the object.."); 
		}
		catch(Exception e)
		{
			System.out.println("error in Provider "+e);
		}
	}
}