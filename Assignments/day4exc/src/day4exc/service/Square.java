package day4exc.service;

public class Square extends Shape {
	private float side;

	public void setSide(float side) {
		this.side = side;
	}

	public Square(String name, float side) {
		super(name);
		this.side = side;
	}

	@Override
	public void calculateArea() {
		System.out.printf("Area of Square is: " + "%.2f", (side * side));

	}

}
