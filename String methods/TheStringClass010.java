public class TheStringClass010
{
	public static void main(String[] args) 
	{
		String str1 = "international";
		String str2 = "i";
		
		int i1 = str1.indexOf(str2,5);
		System.out.println("first index is "+i1);
		
		int i2 = str1.lastIndexOf(str2,5);
		System.out.println("last index is "+i2);
		
	}
}