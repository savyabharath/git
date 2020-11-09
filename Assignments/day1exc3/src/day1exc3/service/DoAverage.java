package day1exc3.service;

public class DoAverage {
	private int a;
	private int b;
	private int c;

	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void setC(int c) {
		this.c = c;
	}

	public void average() {
		System.out.println("Average of" + a + "," + b + "," + c + " is " + ((a + b + c) / 3));
	}

}
