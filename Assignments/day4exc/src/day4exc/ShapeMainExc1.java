package day4exc;

import java.util.Scanner;

import day4exc.service.Circle;
import day4exc.service.Rectangle;
import day4exc.service.Square;

public class ShapeMainExc1 {
	static Square square;
	static Circle circle;
	static Rectangle rectangle;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name;
		float radius;
		float length;
		float breadth;
		float side;
		System.out.println("Enter name:");
		name = scanner.nextLine();
		if (name.equals("Circle")) {
			System.out.println("Enter radius");
			radius = scanner.nextFloat();
			circle = new Circle(name, radius);
			circle.calculateArea();
			circle = null;
		} else if (name.equals("Square")) {
			System.out.println("Enter side:");
			side = scanner.nextFloat();
			square = new Square(name, side);
			square.calculateArea();
			square = null;
		} else if (name.equals("Rectangle")) {
			System.out.println("Enter length :");
			length = scanner.nextFloat();
			System.out.println("Enter breadth:");
			breadth = scanner.nextFloat();
			rectangle = new Rectangle(name, length, breadth);
			rectangle.calculateArea();
			rectangle = null;
		}
		scanner.close();

	}

}
