package keyboard;

import java.util.Scanner;

public class NameAgeSalary {
	public static void main(String[] args) {
		String name;
		int old;
		double make;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Hello. What is your name?");
		name = keyboard.next();

		System.out.println("Hi, " + name + "!" + " How old are you?");
		old = keyboard.nextInt();

		System.out.println("So, you're " + old + ", eh? That's not old at all!");
		System.out.println("How much do you make, " + name + "?");
		make = keyboard.nextDouble();

		System.out.println(make + "! I hope that's per hour and not per year! LOL!");

	}

}
