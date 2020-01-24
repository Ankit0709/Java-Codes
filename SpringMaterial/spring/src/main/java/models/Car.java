package models;

public class Car {
	{
		System.out.println("object of car created");
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car() {
	}

	public Car(String name) {
		super();
		this.name = name;
	}
}