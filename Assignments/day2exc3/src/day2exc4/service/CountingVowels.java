package day2exc4.service;

public class CountingVowels {
	private String name;
	private int i;

	public void setName(String name) {
		this.name = name;
	}
	public void findingVowels() {
		i=0;
		for(int j=0;j<name.length();j++) {
			if((name.charAt(j))=='A' || (name.charAt(j))=='E' || (name.charAt(j))=='I' || (name.charAt(j))=='O' || (name.charAt(j))=='U'){
				i++;
			}
			else if((name.charAt(j))=='a' || (name.charAt(j))=='e' || (name.charAt(j))=='i' || (name.charAt(j))=='o' || (name.charAt(j))=='u'){
				i++;
			}
		}
		System.out.println("no of vowels:"+i);
	}

}
