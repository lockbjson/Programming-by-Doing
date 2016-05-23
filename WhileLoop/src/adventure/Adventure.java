package adventure;

import java.util.Scanner;

public class Adventure {
	public static void main(String[] args) {
		String choice;
		int nextRoom = 1;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("MITCHELL'S TINY ADVENTURE 2!");
		System.out.println();

		while (nextRoom != 0) {
			if (nextRoom == 1) {
				System.out.println("You are in a creepy house!  Would you like to go \"upstairs\" or into the \n"
						+ "\"kitchen\"?");
				System.out.print("> ");
				choice = keyboard.next();
				if (choice.equals("kitchen")) {
					nextRoom = 2;
				} else if (choice.equals("upstairs")) {
					nextRoom = 3;
				} else {
					System.out.println(choice + " wasn't one of the options. Try again.");
				}
			}
			if (nextRoom == 2) {
				System.out.println(
						"There is a long countertop with dirty dishes everywhere.  Off to one side\n there is, as you'd expect, a refrigerator.  You may open the \"refrigerator\"\n or go \"back\".");
				System.out.print("> ");
				choice = keyboard.next();
				if (choice.equals("back")) {
					nextRoom = 1;
				} else if (choice.equals("refrigerator")) {
					nextRoom = 4;
				} else {
					System.out.println(choice + " wasn't one of the options. Try again.");
				}
			}
			if (nextRoom == 3) {
				System.out.println(
						"Upstairs you see a hallway.  At the end of the hallway is the master\n \"bedroom\".  There is also a \"bathroom\" off the hallway.  Or, you can\n go back \"downstairs\". Where would you like to go?");
				System.out.print("> ");
				choice = keyboard.next();
				if (choice.equals("downstairs")) {
					nextRoom = 1;
				} else if (choice.equals("bedroom")) {
					nextRoom = 5;
				} else if (choice.equals("bathroom")) {
					nextRoom = 6;
				} else {
					System.out.println(choice + " wasn't one of the options. Try again.");
				}
			}
			if (nextRoom == 4) {
				System.out.println(
						"Inside the refrigerator you see food and stuff.  It looks pretty nasty.\n Would you like to eat some of the food? (\"yes\" or \"no\")");
				System.out.print("> ");
				choice = keyboard.next();
				if (choice.equals("yes")) {
					System.out.println(
							"The food is slimy and foul, but you manage to choke it down. Your stomach\n starts jumping like a frog in hot water.  You feel faint. Sliding to the\n floor, the darkness closes in.");
					System.out.println("You have died.");
					nextRoom = 0;
				} else if (choice.equals("no")) {
					System.out.println("You die of starvation... eventually.");
					nextRoom = 0;
				} else {
					System.out.println(choice + " wasn't one of the options. Try again.");
				}
			}
		}
	}
}
