package day3exc1.service;

public class SearchArray {
	private int[] a = new int[10];

	public void setA(int[] a) {
		this.a = a;
	}

	public void search(int b) {
		int k = 0;
		for (int i = 0; i < 10; i++) {
			if (a[i] == b) {
				System.out.println("Element Found at inex : " + i);
				k++;
			}
		}
		if (k == 0) {
			System.out.println("Element Not Found");
		}
	}

}
