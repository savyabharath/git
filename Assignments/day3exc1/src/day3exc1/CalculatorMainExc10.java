package day3exc1;

/**
 * 10. I have created a class Calculator inside a package name com.hcl

package com.hcl;

public class Calculator {

public int add(int a, int b){

return a+b;

}

}

how to use add method from another package.
 */
import java.util.Scanner;

import com.hcl.Calculator;

public class CalculatorMainExc10 {

	public static void main(String[] args) {
		int i;
		int a;
		int b;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a:");
		a = scanner.nextInt();
		System.out.println("Enter b:");
		b = scanner.nextInt();
		Calculator calculator = new Calculator();
		i = calculator.add(a, b);
		System.out.println("sum=" + i);
		calculator = null;
		scanner.close();

	}

}
