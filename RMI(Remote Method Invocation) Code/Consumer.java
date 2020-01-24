import java.util.*;
import java.rmi.*;
public class Consumer
{
	public static void main(String[] args)
	{
		try
		{
		// create a url
		String url = "rmi://192.168.43.237:11111//sunday";
		
		// hit the url 
		BabyRemote ref = (BabyRemote)Naming.lookup(url);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a message: ");
		String msg = sc.nextLine();
		
		// call the remote method
		ref.showMessage(msg);
		}
		catch(Exception e)
		{
		System.out.println("error in Consumer "+e);
		}
	}
}