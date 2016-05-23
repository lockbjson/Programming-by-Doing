package letter;

import java.util.Scanner;

public class LetterAtATime {
	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		System.out.print("What is your message? ");
		String message = kb.nextLine();

		System.out.println("\nYour message is " + message.length() + " characters long.");
		System.out.println("The first character is at position 0 and is " + message.charAt(0));
		System.out.println("The last character is at position 30 and is " + message.charAt(30));
		System.out.println();
		System.out.println("Here are all the characters, one at a time: ");
		System.out.println();
		for (int i = 0; i < message.length(); i++) {
			System.out.println(i + " - '" + message.charAt(i) + "'");
		}
		int a_count = 0;
		int e_count = 0;
		int i_count = 0;
		int o_count = 0;
		int u_count = 0;

		for (int i = 0; i < message.length(); i++) {
			char letter = message.charAt(i);
			if (letter == 'a' || letter == 'A') {
				a_count++;
			}
			if (letter == 'e' || letter == 'E') {
				e_count++;
			}
			if (letter == 'i' || letter == 'I') {
				i_count++;
			}
			if (letter == 'o' || letter == 'O') {
				o_count++;
			}
			if (letter == 'u' || letter == 'U') {
				u_count++;
			}
		}
		System.out.println("\nYour message contains the letter 'a' " + a_count + " times. Isn't that interesting?");
		System.out.println("\nYour message contains the letter 'e' " + e_count + " times. Isn't that interesting?");
		System.out.println("\nYour message contains the letter 'i' " + i_count + " times. Isn't that interesting?");
		System.out.println("\nYour message contains the letter 'o' " + o_count + " times. Isn't that interesting?");
		System.out.println("\nYour message contains the letter 'u' " + u_count + " times. Isn't that interesting?");
	}
}
/*
 * 1. Display Error: StringIndexOutOfBoundsException (String index out of range:
 * 31). 2. String = "box"; -> length(): 3; position of the last character is 'x'
 * 3. Because The first value of a string counted is 0.
 */
