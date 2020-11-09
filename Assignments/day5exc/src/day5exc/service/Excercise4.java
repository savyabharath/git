package day5exc.service;

public class Excercise4 {
	private String name;
	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void doCompare() {
		try {
			if (age < 19) {
				throw new CustomException();
			} else {
				System.out.println("player name:" + name);
				System.out.println("player age:" + age);
			}
		} catch (CustomException e) {
			System.out.println(e);
		}
	}

}
