public class TheString002 
{
	public static void main(String[] args) 
	{
		String str1 = "5";
		String str2 = "10";
		
		long t1 = System.nanoTime();
		String str3 = str1.concat(str2).concat(str1);
		long t2 = System.nanoTime();
		
		System.out.println(t2 - t1);
		
		System.out.println(str3);
			
	}
}
