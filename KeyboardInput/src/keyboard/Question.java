package keyboard;

import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int old, weigh;
		String feet, inches;

		System.out.print("How old are you?");
		old = keyboard.nextInt();

		System.out.print("How many feet tall are you?");
		feet = keyboard.next();

		System.out.print("Are how many inches?");
		inches = keyboard.next();

		System.out.print("How much do you weigh?");
		weigh = keyboard.nextInt();

		System.out.println(
				"So, you're " + old + " old, " + feet + "'" + inches + "''" + " tall " + " and " + weigh + " heavy.");
	}

}
