package refresher;

import java.util.Scanner;

public class RefresherChallenge {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("What is your name: ");
		String name = keyboard.next();

		for (int i = 0; i < 10; i++) {
			System.out.println(name);
			if (name.equals("Mitchell")) {
				i++;
			}
		}
	}
}
