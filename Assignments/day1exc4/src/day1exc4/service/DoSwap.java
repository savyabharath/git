package day1exc4.service;

public class DoSwap {
	private int a;
	private int b;
	private int c;

	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void swap() {
		c = a;
		a = b;
		b = c;
		System.out.println("After swap a= " + a + " b= " + b);
	}

}
