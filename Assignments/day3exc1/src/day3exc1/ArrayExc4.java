package day3exc1;

/**
 * 4. write a Java program to search for an element of an integer array of 10 elements.
 */
import java.util.Scanner;

import day3exc1.service.SearchArray;

public class ArrayExc4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] a = new int[10];
		int i;
		for (i = 0; i < 10; i++) {
			System.out.print("Enter Element" + i + ":");
			a[i] = scanner.nextInt();
		}
		int c;
		System.out.println("Enter element to search ");
		c = scanner.nextInt();
		SearchArray searchArray = new SearchArray();
		searchArray.setA(a);
		searchArray.search(c);
		searchArray = null;
		scanner.close();

	}

}
