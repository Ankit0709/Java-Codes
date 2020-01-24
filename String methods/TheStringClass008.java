public class TheStringClass008
{
	public static void main(String[] args) 
	{
		String str1 = "a*b*c";
		String str2 = "\\*";
		
		/*
		  
		 ? : \\?
		 . : \\.
		 \\ : \\\\
		  * : \\*
		  
		 */
		
		String[] parts = str1.split(str2);
		
		System.out.println("no of parts are "+parts.length);
		
		for (int i = 0; i < parts.length; i++) 
		{
			System.out.println(i+":"+parts[i]);
		}
	}
}