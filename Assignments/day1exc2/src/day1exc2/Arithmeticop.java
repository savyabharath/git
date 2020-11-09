package day1exc2;
/**
 * 2. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

Test Data: Input first number: 20 Input second number: 4
 */

import day1exc2.service.DoAirthmetic;

public class Arithmeticop {

	public static void main(String[] args) {
		DoAirthmetic doArithmetic = new DoAirthmetic();
		doArithmetic.setA(20);
		doArithmetic.setB(4);
		doArithmetic.add();
		doArithmetic.sub();
		doArithmetic.multiply();
		doArithmetic.division();
		doArithmetic = null;
	}

}
