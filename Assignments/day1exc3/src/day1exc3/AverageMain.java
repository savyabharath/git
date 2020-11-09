package day1exc3;

/**3. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
 * 
 * 
 */
import day1exc3.service.DoAverage;

import java.util.Scanner;

public class AverageMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int d;
		int e;
		int f;
		System.out.println("Enter a:");
		d = scanner.nextInt();
		System.out.println("Enter b:");
		e = scanner.nextInt();
		System.out.println("Enter c:");
		f = scanner.nextInt();
		DoAverage doaverage = new DoAverage();
		doaverage.setA(d);
		doaverage.setB(e);
		doaverage.setC(f);
		doaverage.average();
		doaverage = null;
		scanner.close();

	}

}
