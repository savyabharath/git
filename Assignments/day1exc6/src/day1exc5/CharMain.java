package day1exc5;

/**
 * 6. Write a Java program to print the ascii value of a given character.
 */
import day1exc5.service.CharAsci;

import java.util.Scanner;

public class CharMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char character1;
		System.out.println("Enter character");
		character1 = scanner.next().charAt(0);
		CharAsci charAsci = new CharAsci();
		charAsci.setCharacter(character1);
		charAsci.asciValue();
		charAsci = null;
		scanner.close();

	}

}
