package vowel;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Vowels {
	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Open which file: ");
		String file = keyboard.next();
		keyboard = new Scanner(new File(file));
		while (keyboard.hasNext()) {
			String c = keyboard.nextLine();
			StringBuilder result = new StringBuilder(c);
			for (int a = 0; a < c.length(); a++) {
				char character = c.charAt(a);
				if (character == 'a') {
					result.setCharAt(a, Character.toUpperCase(character));
				} else if (character == 'e') {
					result.setCharAt(a, Character.toUpperCase(character));
				} else if (character == 'u') {
					result.setCharAt(a, Character.toUpperCase(character));
				} else if (character == 'i') {
					result.setCharAt(a, Character.toUpperCase(character));
				} else if (character == 'o') {
					result.setCharAt(a, Character.toUpperCase(character));
				}
				c = result.toString();
			}
			System.out.println(c);
		}
	}
}
