package day3exc1.service;

public class Exc5Service {
	private String name;
	private int a, b;

	public void setName(String name) {
		this.name = name;
	}

	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void doString() {
		System.out.println(name.substring(a, b));
	}

}
