package day2exc1;

/**
 * 1.Write a Java method to find the smallest number among three numbers.
 */
import java.util.Scanner;

import day2exc1.service.FindingSmallest;

public class SmallestOfThree {

	public static void main(String[] args) {
		int a, b, c;
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter a:");
		a = scanner.nextInt();
		System.out.print("enter b:");
		b = scanner.nextInt();
		System.out.print("enter c:");
		c = scanner.nextInt();
		FindingSmallest findingSmallest = new FindingSmallest();
		findingSmallest.setD(a);
		findingSmallest.setE(b);
		findingSmallest.setF(c);
		findingSmallest.find();
		findingSmallest = null;
		scanner.close();
	}

}
