package day5exc;

/**
 * 2.Java has built-in mechanism to handle exceptions. Using the try statement we can test a block of code for errors. The catch block contains the code that says what to do if exception occurs.

This problem will test your knowledge on try-catch block.

You will be given two integers and as input, you have to compute . If and are not bit signed integers or if is zero, exception will occur and you have to report it. Read sample Input/Output to know what to report in case of exceptions.

Sample Input :

10

3

Sample Output :

3

Sample Input :

10

Hello

Sample Output :

java.util.InputMismatchException

Sample Input :

10

0

Sample Output :

java.lang.ArithmeticException: / by zero

Sample Input :

23.323

0

Sample Output :

java.util.InputMismatchException
 */
import day5exc.service.Do;

import java.util.Scanner;

public class Exc2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a;
		int b;
		Do do1;
		try {
			System.out.println("Enter a:");
			a = scanner.nextInt();
			System.out.println("Enter b");
			b = scanner.nextInt();
			do1 = new Do();
			do1.setA(a);
			do1.setB(b);
			do1.division();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			do1 = null;
			scanner.close();

		}
	}

}
