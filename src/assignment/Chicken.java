package assignment;

public class Chicken extends Bird {

	@Override
	void say() {
		System.out.println("Cluck, cluck");
	}

	@Override
	void fly() {
		System.out.println("I am unable to fly.");
	}

}
