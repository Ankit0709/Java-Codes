public class TheStringClass009
{
	public static void main(String[] args) 
	{
		String str1 = "ab ba ";
		String str2 = "b";
		
		int i1 = str1.indexOf(str2);
		System.out.println("first index is "+i1);
		
		int i2 = str1.lastIndexOf(str2);
		System.out.println("last index is "+i2);
		
	}
}