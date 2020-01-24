import java.util.Scanner;

public class TheString005
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter email:");
		
		String email = s.nextLine();
		
		email = email.trim();
		
		System.out.println("=>"+email+"<=");
	}
}
