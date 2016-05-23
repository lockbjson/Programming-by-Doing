package adventure;

import java.util.Scanner;

public class Adventure {
	private static String choose1;
	private static String choose2;
	private static String choose3;
	private static Scanner keyboard;

	public static void check() {
		if (choose1.equalsIgnoreCase("kitchen")) {
			room2();
			if (choose2.equalsIgnoreCase("refrigerator")) {
				room4();
				if (choose3.equalsIgnoreCase("yes")) {
					ending1();
				} else if (choose3.equalsIgnoreCase("no")) {
					ending2();
				}
			} else if (choose2.equalsIgnoreCase("cabinet")) {
				room5();
				if (choose3.equalsIgnoreCase("yes")) {
					ending3();
				} else if (choose3.equalsIgnoreCase("no")) {
					ending4();
				}
			}
		}
		if (choose1.equalsIgnoreCase("upstairs")) {
			room3();
			if (choose2.equalsIgnoreCase("bedroom")) {
				room6();
				if (choose3.equalsIgnoreCase("yes")) {
					ending5();
				} else if (choose3.equalsIgnoreCase("no")) {
					ending6();
				}
			} else if (choose2.equalsIgnoreCase("bathroom")) {
				room7();
				if (choose3.equalsIgnoreCase("yes")) {
					ending7();
				} else if (choose3.equalsIgnoreCase("no")) {
					ending8();
				}
			}
		}
	}

	public static void room1() {
		System.out.println("WELCOME TO MITCHELL'S TINY ADVENTURE");
		System.out.println();
		System.out.println("You are in a creepy house! Would you like to go 'upstairs' or into the 'kitchen'?");
		System.out.print("> ");
		choose1 = keyboard.next();
		System.out.println();
	}

	public static void room2() {
		System.out.println(
				"There is a long countertop with dirty dishes everywhere. Off to one \nside there is, as you'd expect, a refrigerator. You may open the \n'refrigerator' or look in a 'cabinet'.");
		System.out.print("> ");
		choose2 = keyboard.next();
		System.out.println();
	}

	public static void room3() {
		System.out.println(choose1
				+ " you see a hallway.  At the end of the hallway is the master \n'bedroom'.  There is also a 'bathroom' off the hallway.  Where would you like \nto go?");
		System.out.print("> ");
		choose2 = keyboard.next();
		System.out.println();
	}

	public static void room4() {
		System.out.println(
				"Inside the refrigerator you see food and stuff.  It looks pretty nasty. \nWould you like to eat some of the food? ('yes' or 'no')");
		System.out.print("> ");
		choose3 = keyboard.next();
		System.out.println();
	}

	public static void room5() {
	}

	public static void room6() {
		System.out.println(
				"You are in a plush bedroom, with expensive-looking hardwood furniture.  The \nbed is unmade.  In the back of the room, the closet door is ajar.  Would you \nlike to open the door? ('yes' or 'no')");
		System.out.print("> ");
		choose3 = keyboard.next();
		System.out.println();
	}

	public static void room7() {

	}

	public static void ending1() {
	}

	public static void ending2() {
		System.out.println("You die of starvation... eventually.");
	}

	public static void ending3() {

	}

	public static void ending4() {

	}

	public static void ending5() {

	}

	public static void ending6() {
		System.out.println(
				"Well, then I guess you'll never know what was in there.  Thanks for playing, \nI'm tired of making nested if statements.");
	}

	public static void ending7() {

	}

	public static void ending8() {
	}

	public static void main(String[] args) {
		keyboard = new Scanner(System.in);
		room1();
		check();
	}
}
