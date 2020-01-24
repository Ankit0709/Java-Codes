import java.util.Scanner;

public class Array04 
{
	public static void main(String[] args) 
	{
	// create object of scanner to get input from keyboard
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter size for array: ");
	int size = sc.nextInt();
	
	// check if size is >= 0 or not
	if(size < 0)
	{
		// create an aray of size 0
		size = 0;
	}
	
	// create an aray of given size
	int[] ary = new int[size];
	
	System.out.println("# array is created #");
	
	for (int i = 0; i < ary.length; i++) 
	{
		System.out.print("Input value for array index#"+i+": ");
		
		// get int value from keyboard and store it inside 
		// ith element of array
		ary[i] = sc.nextInt();
	}
	
	System.out.println("# array initialized #");
	
	// take a variable to store sum of all elements
	int sum = 0;
	
	System.out.println("# array is given below #");
	for (int i = 0; i < ary.length; i++) 
	{
		System.out.println("ind"
				+ "ex: "+i+", value: "+ary[i]);
		
		// store the sum of array
		sum = sum + ary[i];
	}
	
	System.out.println("Sum of all elements are "+sum);

	}
}