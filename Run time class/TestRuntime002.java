import java.util.Scanner;

public class TestRuntime002 
{
	public static void main(String[] args) 
	{
	// get the object of runtime class	
	Runtime	r = Runtime.getRuntime();

	Scanner s = new Scanner(System.in);
	
	System.out.print("Please say something: ");
	
	String str = s.nextLine();
	
	try
	{
	Process p = r.exec(str);
	}
	catch (Exception e) 
	{
		e.printStackTrace();
	}
		
	}
}
