

public class Doo extends Foo 
{
	String s;
	float t;
	
	public Doo(float x, String y, String s, float t) {
		super(x, y);
		this.s = s;
		this.t = t;
	}
	
	public void show()
	{
		System.out.println(super.x);
		System.out.println(super.y);
		System.out.println(s);
		System.out.println(t);
	}

}
