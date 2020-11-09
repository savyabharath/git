package day3exc1.service;

public class DoPalindrome {
	private StringBuffer string;

	public void setString(StringBuffer string) {
		this.string = string;
	}

	public void palindromeCheck() {
		StringBuffer string2;
		string2 = string;
		if (string2.equals(string.reverse())) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
