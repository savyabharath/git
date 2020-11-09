package day5exc;

/**
 * 4. Write a program to get the name and age of the player from the user and display it.

player name is a string

player age is an integer value

Note : The player is eligible to participate in IPL when their age is 19 and above

This program may generate

1. InvalidAgeRange Custom Exception when the player's age is below 19

Use exception handling mechanisms to handle these exceptions

Create a class called CustomException which extends Exception and it includes constructor to initialize the message.

Use appropriate exception handling mechanisms to handle these exceptions

Sample Input/Output 1:

Enter the player name

Albie Morkel

Enter the player age

35

Player name : Albie Morkel

Player age : 35

Sample Input/Output 2:

Enter the player name

Ishan Kishan

Enter the player age

16

CustomException: InvalidAgeRangeException
 */
import day5exc.service.Excercise4;

import java.util.Scanner;

public class Exc4 {

	public static void main(String[] args) {
		String name;
		int age;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter player name:");
		name = scanner.nextLine();
		System.out.println("Enter player age:");
		age = scanner.nextInt();
		Excercise4 excercise4;
		excercise4 = new Excercise4();
		excercise4.setAge(age);
		excercise4.setName(name);
		excercise4.doCompare();
		excercise4 = null;
		scanner.close();

	}

}
