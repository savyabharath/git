package day1exc1;

/**
 * 1. Write a Java program to print the result of the following operations.

Test Data:

a. -5 + 8 * 6

b. (55+9) % 9

c. 20 + -3*5 / 8

d. 5 + 15 / 3 * 2 - 8 % 3
 */
import day1exc1.service.ExcerciseDo;

public class Excerxise1 {

	public static void main(String[] args) {
		ExcerciseDo excerciseDo = new ExcerciseDo();
		excerciseDo.setA(-5 + 8 * 6);
		excerciseDo.setB((55 + 9) % 9);
		excerciseDo.setC(20 + -3 * 5 / 8);
		excerciseDo.setD(5 + 15 / 3 * 2 - 8 % 3);
		System.out.println("-5 + 8 * 6             =" + excerciseDo.getA());
		System.out.println("(55+9) % 9             =" + excerciseDo.getB());
		System.out.println("20 + -3*5 / 8          =" + excerciseDo.getC());
		System.out.println("5 + 15 / 3 * 2 - 8 % 3 =" + excerciseDo.getD());
		excerciseDo = null;

	}

}
