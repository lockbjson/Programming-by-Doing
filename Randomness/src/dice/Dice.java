package dice;

import java.util.Random;

public class Dice {

	public static void main(String[] args) {
		Random r = new Random();

		int first = 1 + r.nextInt(6);
		int second = 1 + r.nextInt(6);

		int total = first + second;

		System.out.println("HERE COMES THE DICE!");

		System.out.println("Roll #1: " + first);
		System.out.println("Roll #2: " + second);
		System.out.println("The total: " + total);
	}

}
