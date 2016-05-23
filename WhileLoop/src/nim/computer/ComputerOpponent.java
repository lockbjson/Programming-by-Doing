package nim.computer;

import java.util.Scanner;

public class ComputerOpponent {
	static String a = "Tuan";
	static int age = 3;

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("What's your name? ");
		System.out.print("How old are you? ");
		age = keyboard.nextInt();

		System.out.println("Name: " + a + "Age: " + age);
	}

}
