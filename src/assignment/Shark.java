package assignment;

public class Shark extends Fish {

	@Override
	void size() {
		System.out.println("I am large.");
	}

	@Override
	void colour() {
		System.out.println("I am grey in colour.");
	}

	void prey() {
		System.out.println("I prey on smaller fishes.");
	}

}
