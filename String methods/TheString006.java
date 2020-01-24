public class TheString006
{
	public static void main(String[] args) 
	{
		String str = "g o re bahubali";
		
		for(int i = 0; i < str.length(); i++)
		{
			System.out.print(i+":");
			String str2 = str.substring(i);
			System.out.println(str2);
		}
	}
}
