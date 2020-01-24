public class TheStringClass002 
{
	public static void main(String[] args) 
	{
		
		String str = "padmavat";
//		int index = 4;
//		
//		char ch = str.charAt(index);
//		
//		System.out.println("at index "+index+" >"+ch+"< is found");
		
		for(int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			System.out.println(i+":"+ch);
		}
		
		System.out.println();
		
		for(int i = str.length() - 1; i >= 0; i--)
		{
			char ch = str.charAt(i); 
			System.out.println(i+":"+ch);
		}
	}
}