package assignment;

import java.lang.reflect.Method;

public class SolutionE {

	public static void main(String args[]) {

		int flyCount = 0;
		int singCount = 0;
		int walkCount = 0;
		int swimCount = 0;

		Animal[] animals = new Animal[] { new Bird(), new Duck(), new Chicken(), new Rooster(), new Parrot(),
				new Fish(), new Shark(), new Clownfish(), new Dolhpin(), new Frog(), new Dog(), new Butterfly(),
				new Cat() };

		for (Animal a : animals) {
			for (Method method : a.getClass().getDeclaredMethods()) {
				if (method.getName().equals("fly")) {
					flyCount++;
				}
				if (method.getName().equals("sing")) {
					singCount++;
				}
				if (method.getName().equals("walk")) {
					walkCount++;
				}
				if (method.getName().equals("swim")) {
					swimCount++;
				}

			}
		}

		System.out.println("Number of species that can fly :" + flyCount);
		System.out.println("Number of species that can sing :" + singCount);
		System.out.println("Number of species that can walk :" + walkCount);
		System.out.println("Number of species that can swim :" + swimCount);

	}

}
