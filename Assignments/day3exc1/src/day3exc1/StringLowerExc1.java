package day3exc1;

/**
 * 1. Write a Java program to convert all the characters in a string to lowercase.
 */
import day3exc1.service.DoLower;
import java.util.Scanner;

public class StringLowerExc1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string1;
		System.out.print("Enter string:");
		string1 = scanner.nextLine();
		DoLower doLower = new DoLower();
		doLower.setString(string1);
		doLower.lower();
		doLower = null;
		string1 = null;
		scanner.close();

	}

}
