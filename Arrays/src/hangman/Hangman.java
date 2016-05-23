package hangman;

import java.util.Scanner;

public class Hangman {

	public static void word_guessing() {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		String[] word = { "word", "believe", "mint", "destination", "locomotive", "compartment", "departure",
				"arrive" };
		int a = 1, count_word = 0, count_misses = 0;

		int chooseWord = (int) (Math.random() * 8);
		String misses = "";
		char words[] = new char[word[chooseWord].length()];
		// assign words[i] by '_'
		for (int i = 0; i < word[chooseWord].length(); i++) {
			words[i] = '_';
		}

		System.out.println(word[chooseWord]);
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-\n");
		// print Word: _ _ _ _ _
		System.out.print("Word: ");
		for (int i = 0; i < word[chooseWord].length(); i++) {
			System.out.print(words[i] + " ");
		}
		// while loop until complete string
		while (a != 0) {
			System.out.print("\n\nMisses: ");
			System.out.print(misses + " ");
			System.out.print("\n\nGuess: ");
			String guess = keyboard.next();
			System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-\n");
			System.out.print("Word: ");
			for (int i = 0; i < word[chooseWord].length(); i++) {
				if (guess.charAt(0) == word[chooseWord].charAt(i)) {
					words[i] = word[chooseWord].charAt(i);
					count_word += 1;
				}
				System.out.print(words[i] + " ");
			}
			if (!word[chooseWord].contains(guess)) {
				misses = misses.concat(guess);
				count_misses += 1;
				if (count_misses == 4) {
					System.out.println("\n\nMisses: " + misses);
					System.out.println("\nRun out. The tries is over four!");
					a = 0;
				}
			}
			if (count_word == word[chooseWord].length()) {
				System.out.println("\n\nMisses: ");
				System.out.println("\nYOU GOT IT!");
				System.out.println("\nPlay \"again\" or \"quit\"? ");
				String choice = keyboard.next();
				if (choice.equals("again")) {
					word_guessing();
				} else if (choice.equals("quit")) {
					a = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		word_guessing();
	}
}
