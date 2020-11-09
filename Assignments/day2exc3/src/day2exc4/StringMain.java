package day2exc4;

/**
 * 3. Write a Java method to count all vowels in a string.

Input the string: Hcl Technologies

Expected Output:

Number of Vowels in the string: 5
 */
import java.util.Scanner;

import day2exc4.service.CountingVowels;

public class StringMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name:");
		String name;
		name = scanner.nextLine();
		CountingVowels countingVowels = new CountingVowels();
		countingVowels.setName(name);
		countingVowels.findingVowels();
		countingVowels = null;
		scanner.close();

	}

}
