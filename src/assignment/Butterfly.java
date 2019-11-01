package assignment;

public class Butterfly {

	Butterfly(boolean isCaterpillar) {

		if (isCaterpillar) {
			Animal a = new Animal();
			a.walk();

		} else {
			Bird b = new Bird();
			b.fly();
			b.say("I do not make a sound.");
		}

	}

	/*
	 * Yes Butterfly can be modelled. Also the metamorphosis and the relative
	 * behaviour can also be modeled by initializing the Butterfly class as shown
	 * above.
	 */
}
