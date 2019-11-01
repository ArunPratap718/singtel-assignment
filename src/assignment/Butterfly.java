package assignment;

public class Butterfly extends Bird {

	Butterfly() {

	}

	Butterfly(boolean isCaterpillar) {

		if (isCaterpillar) {
			walk();

		} else {
			fly();
			say("I do not make a sound.");
		}

	}

	/*
	 * Yes Butterfly can be modelled. Also the metamorphosis and the relative
	 * behaviour can also be modeled by initializing the Butterfly class as shown
	 * above.
	 */
}
