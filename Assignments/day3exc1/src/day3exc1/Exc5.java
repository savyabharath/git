package day3exc1;

/**
 * 5. Accept a string, and two indices(integers), and print the substring consisting of all characters inclusive range from ..to .

Sample Input

Helloworld

3 7

Sample Output

Lowo
 */
import java.util.Scanner;

import day3exc1.service.Exc5Service;

public class Exc5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name;
		int a;
		int b;
		System.out.println("Enter string:");
		name = scanner.nextLine();
		System.out.println("Enter first index:");
		a = scanner.nextInt();
		System.out.println("Enter second index:");
		b = scanner.nextInt();
		Exc5Service exc5Service = new Exc5Service();
		exc5Service.setName(name);
		exc5Service.setA(a);
		exc5Service.setB(b);
		exc5Service.doString();
		exc5Service = null;
		scanner.close();

	}

}
