public class TheStringClass004
{
	public static void main(String[] args) 
	{
		String str = "=@.*+\n";
		int index = 5;
		
		int ascii = str.codePointAt(index);
		System.out.println("ascii value of char given at "+index+" is "+ascii);
		
		int index2 = 0;
		int ascii2 = str.codePointBefore(index2);
		System.out.println("ascii value is "+ascii2);
	}
}