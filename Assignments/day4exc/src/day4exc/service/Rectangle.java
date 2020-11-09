package day4exc.service;

public class Rectangle extends Shape {
	private float length;
	private float breadth;

	public void setLength(float length) {
		this.length = length;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}

	public Rectangle(String name, float length, float breadth) {
		super(name);
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void calculateArea() {
		System.out.printf("Area of Rectangle is :" + "%.2f", (length * breadth));

	}

}
