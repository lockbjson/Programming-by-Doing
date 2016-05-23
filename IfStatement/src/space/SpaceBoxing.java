package space;

import java.util.Scanner;

public class SpaceBoxing {
	private static int earthWeight;
	private static int weight;

	public static double assign() {
		if (weight == 1) {
			return 0.78;
		} else if (weight == 2) {
			return 0.39;
		} else if (weight == 3) {
			return 2.65;
		} else if (weight == 4) {
			return 1.17;
		} else if (weight == 5) {
			return 1.05;
		} else {
			return 1.23;
		}
	}

	public static double calculator() {
		return (double) (earthWeight * assign());
	}

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Please enter your current earth weight: ");
		earthWeight = keyboard.nextInt();

		System.out.println("I have information for the following planets:");
		System.out.println("\t1. Venus\t2. Mars \t3. Jupiter ");
		System.out.println("\t4. Saturn\t5. Uranus\t6. Neptune ");

		System.out.print("Which planet are you visiting? ");
		weight = keyboard.nextInt();

		System.out.println("Your weight would be " + SpaceBoxing.calculator() + " pounds on that planet");

	}

}
