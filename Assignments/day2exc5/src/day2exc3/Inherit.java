package day2exc3;

/**
 * 5. Create class named as ‘a’ and create a sub class ‘b’. Which is extends from class ‘a’. And use these classes in ‘inherit’ class.
 */
import day2exc3.service.B;
import day2exc3.service.A;

public class Inherit {

	public static void main(String[] args) {
		B b = new B();
		b.print();
		b.display();
		A a = new A();
		a.display();
		a = null;
		b = null;

	}

}
