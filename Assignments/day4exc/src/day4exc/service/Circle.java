package day4exc.service;

public class Circle extends Shape {
	private float radius1;

	public void setRadius1(float radius1) {
		this.radius1 = radius1;
	}

	public Circle(String name, float radius1) {
		super(name);
		this.radius1 = radius1;
	}

	@Override
	public void calculateArea() {
		final float PI = 3.14f;
		System.out.printf("Area of circle: " + "%.2f", (PI * radius1 * radius1));

	}

}
