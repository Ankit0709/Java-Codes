package beans;

public class person {
	private String name,city;
	private float age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	 person() {
		System.out.println("Object created");// TODO Auto-generated constructor stub
	}
 person(String name, String city, float age) {
	
		this.name = name;
		this.city = city;
		this.age = age;
	}
	
	

}
