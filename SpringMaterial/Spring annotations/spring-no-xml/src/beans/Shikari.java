package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Shikari 
{
	@Autowired
	private Tiger t;

	public Tiger getT() {
		return t;
	}

	{
		System.out.println("shikari");
	}
}
