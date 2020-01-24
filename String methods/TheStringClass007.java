public class TheStringClass007
{
	public static void main(String[] args) 
	{
		String str = "abCD dcBA";
		
		byte[] array = str.getBytes();
		
		for (int i = 0; i < array.length; i++) 
		{
			System.out.println(i+":"+array[i]);
		}
	}
}