package day1exc4;

/**4. Write a Java program to swap two variables.
 * 
 */
import day1exc4.service.DoSwap;

import java.util.Scanner;

public class SwapMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int d;
		int e;
		System.out.println("Enter a:");
		d = scanner.nextInt();
		System.out.println("Enter b:");
		e = scanner.nextInt();
		DoSwap doSwap = new DoSwap();
		doSwap.setA(d);
		doSwap.setB(e);
		doSwap.swap();
		doSwap = null;
		scanner.close();
	}

}
