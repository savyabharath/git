package day1exc2.service;

public class DoAirthmetic {
	private int a;
	private int b;

	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void add() {
		System.out.println("a+b=" + (a + b));
	}

	public void sub() {
		System.out.println("a-b=" + (a - b));
	}

	public void multiply() {
		System.out.println("a*b=" + (a * b));
	}

	public void division() {
		System.out.println("a/b=" + (a / b));
	}
}
