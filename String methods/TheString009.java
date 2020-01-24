public class TheString009
{
	public static void main(String[] args) 
	{
		String str1 = "hello";
		String str2 = "HELLO";
		
		int result = str1.compareToIgnoreCase(str2);
		
		if(result == 0)
		{
			System.out.println("str1 == str2");
		}
		else if(result > 0)
		{
			System.out.println("str1 > str2");
		}
		else
		{
			System.out.println("str1 < str2");
		}
	}
}
