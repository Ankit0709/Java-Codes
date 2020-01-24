public class TestRuntime001 
{
	public static void main(String[] args) 
	{
	// get the object of runtime class	
	Runtime	r = Runtime.getRuntime();
	
	// total memory at JVM
	long tm = r.totalMemory();
	
	// free memory at JVM
	long fm = r.freeMemory();
	
	// calculate allocated memory
	long am = tm - fm;
	
	// max memory gievn by OS to JVM
	long mm = r.maxMemory();
	
	System.out.println("total: "+tm+" bytes");
	System.out.println("free: "+fm+" bytes");
	System.out.println("allocated: "+am+" bytes");
	System.out.println("max: "+mm+" bytes "+mm / 1024 / 1024 +" MB");
		
	}
}
