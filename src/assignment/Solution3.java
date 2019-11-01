package assignment;

public class Solution3 {

	public static void main(String args[]) {

		Parrot withDog = new Parrot();
		Parrot withCat = new Parrot();
		Parrot withRooster = new Parrot();

		withDog.say("Woof, woof");
		withCat.say("Meow");
		withRooster.say("Cock-a-doodle-doo");

		/*
		 * Yes the parrot is maintainable as it will inherit the say(sound) function of
		 * the Animal according to its surrounding.
		 */
	}
}
