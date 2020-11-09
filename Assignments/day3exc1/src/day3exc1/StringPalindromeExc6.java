package day3exc1;

/**
 * 6. Given a string , print ‘Yes’ if it is a palindrome, print ‘No’ otherwise.

Sample Input

madam

Sample Output

Yes
 */
import java.util.Scanner;

import day3exc1.service.DoPalindrome;

public class StringPalindromeExc6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuffer string1 = new StringBuffer();
		System.out.print("Enter String:");
		string1.append(scanner.nextLine());
		DoPalindrome doPalindrome = new DoPalindrome();
		doPalindrome.setString(string1);
		doPalindrome.palindromeCheck();
		string1 = null;
		scanner.close();

	}

}
