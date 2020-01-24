public class Array03 
{
	public static void main(String[] args) 
	{
	float[] array = {11.0f,13.0f,15.0f,17.0f};
		
	System.out.println("array from left to right =>");
	for (int i = 0; i < array.length; i++) 
	{
		System.out.print(array[i]+" ");	
	}

	System.out.println();
	
	System.out.println("array from right to left  =>");
	for (int i = array.length - 1; i >= 0; i--) 
	{
		System.out.print(array[i]+" ");	
	}
		
	}
}