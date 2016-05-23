package littlequiz;

import java.util.Scanner;

public class ALittleQuiz {
	private static String ans1;
	private static int ans2;
	private static int overall = 3;

	public static Scanner keyboard;

	public static void question1() {
		System.out.println("Q1) What is the capital of Alaska?");
		System.out.println("\t1) Melboure");
		System.out.println("\t2) Anchorage");
		System.out.println("\t3) Juneau");
		System.out.print("> ");
		keyboard = new Scanner(System.in);
		ans2 = keyboard.nextInt();
		if (ans2 == 3) {
			System.out.println("That's right!");
		} else {
			System.out.println("That's wrong!");
			overall -= 1;
		}
	}

	public static void question2() {
		System.out.println("Q2) Can you store the value " + "cat " + "in a variable of type int?");
		System.out.println("\t1) yes");
		System.out.println("\t2) no");
		System.out.print("> ");
		keyboard = new Scanner(System.in);
		ans2 = keyboard.nextInt();
		if (ans2 == 2) {
			System.out.println("That's right!");
		} else {
			System.out.println("Sorry," + " cat " + "is a string. ints can only store numbers.");
			overall -= 1;
		}
	}

	public static void question3() {
		System.out.println("Q3) What is the result of 9+6/3?");
		System.out.println("\t1) 5");
		System.out.println("\t2) 11");
		System.out.println("\t3) 15/3");
		System.out.print("> ");
		keyboard = new Scanner(System.in);
		ans2 = keyboard.nextInt();
		if (ans2 == 2) {
			System.out.println("That's correct!");
		} else {
			System.out.println("That's wrong!");
			overall -= 1;
		}
	}

	public static void yesOrNo() {
		if (ans1.equalsIgnoreCase("Y")) {
			System.out.println("Okay, here it come!");
			question1();
			question2();
			question3();
		} else if (ans1.equalsIgnoreCase("N")) {
			System.out.println("Bye Bye!");
		}
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Are you ready for a quiz? ");
		ans1 = keyboard.next();
		ALittleQuiz.yesOrNo();

		System.out.println("Overall, you got " + overall + " out of 3 correct.");
		System.out.println("Thanks for playing!");

	}
}
