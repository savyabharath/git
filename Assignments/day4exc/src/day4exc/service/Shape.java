package day4exc.service;

public abstract class Shape {
	protected String name;

	protected Shape(String name) {
		super();
		this.name = name;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	public abstract void calculateArea();
}
