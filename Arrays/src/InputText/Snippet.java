package InputText;

import java.util.Scanner;

public class Snippet {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		String[] input1 = new String[4];
		String[] symbols = { "$1", "$2", "$3", "$4" };
		String[] input2 = new String[3];
		System.out.print("Input1: ");
		for (int i = 0; i < input1.length; i++) { input1[i] = keyboard.next();}
		System.out.print("Input2: ");
		for (int i = 0; i < input2.length; i++) { input2[i] = keyboard.next();
			for (int j = 0; j < symbols.length; j++) {
				if (input2[i].contains(symbols[j])) { input2[i] = input2[i].replace(symbols[j], input1[j]);}
			}
			System.out.print(input2[i] + " ");
		}
	}
}
