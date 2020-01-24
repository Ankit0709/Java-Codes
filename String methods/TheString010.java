public class TheString010
{
	public static void main(String[] args) 
	{
		String para = "s f s fg fd g fd  fd"
				+ "fs nd f fd  df  vdf"
				+ "dsf sd f sd f sd f sd "
				+ "sd f sd f sdf "
				+ "catia karun df b df gb fg "
				+ "dfg  sdfg fd g"
				+ " gdf gsfd ";
		
		String text = "ia kar";
		
		if(para.contains(text))
		{
			System.out.println("found");
		}
		else
		{
			System.out.println("not found");
		}
	}
}
