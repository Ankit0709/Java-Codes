public class TheStringClass003 
{
	public static void main(String[] args) 
	{
		String str1 = "mumbai ";
		String str2 = "mumBAI ";
		
		if(str1.equals(str2))
		{
			System.out.println("same data");
		}
		else
		{
			System.out.println("diff data");
		}
		
		if(str1.equalsIgnoreCase(str2))
		{
			System.out.println("same data");
		}
		else
		{
			System.out.println("diff data");
		}
		
	}
}