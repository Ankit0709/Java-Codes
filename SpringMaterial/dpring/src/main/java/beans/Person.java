package beans;

public class Person {
	private int id;
	private String name, city;
	private float age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public Person() {
	}
  public String toString()
  {
	  return "id:"+id+"name:"+name+"city:"+city+"age:"+age;
  }
	public Person(int id, String name, String city, float age) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.age = age;
	}
}