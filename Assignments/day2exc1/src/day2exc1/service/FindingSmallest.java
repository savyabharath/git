package day2exc1.service;

public class FindingSmallest {
	private int d;
	private int e;
	private int f;

	public void setD(int d) {
		this.d = d;
	}

	public void setE(int e) {
		this.e = e;
	}

	public void setF(int f) {
		this.f = f;
	}

	public void find() {
		if (d < e && d < f) {
			System.out.println("a=" + d + " is smallest");
		} else if (e < d && e < f) {
			System.out.println("b=" + e + " is smallest");
		} else {
			System.out.println("c=" + f + "is smallest");
		}
	}
}
