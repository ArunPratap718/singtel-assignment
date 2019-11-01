package assignment;

public class Rooster extends Chicken {

	@Override
	void say() {
		System.out.println("Cock-a-doodle-doo");
	}

	/*
	 * Here the rooster is related to the chicken as chicken is the parent of the
	 * rooster and the rooster inherits the property of its parent that
	 * "It is unable to fly."
	 */

	/*
	 * Yes the rooster can be modeled without inheritance as it can have its own
	 * member functions and also the constructor based approach can also be used.
	 */
}
