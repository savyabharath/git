package day1exc5.service;

public class CharAsci {
	private char character;
	private int asci;

	public void setCharacter(char character) {
		this.character = character;
	}

	public void asciValue() {
		asci = character;
		System.out.println("Ascii value of character " + character + " is " + asci);
	}

}
