package InputText;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		String output = "";
		Scanner keyboard = new Scanner(System.in);
		String[] arr1 = { "$1", "$2", "$3", "$4" };
		String[] arr2 = new String[4];

		System.out.print("Input1: ");
		for (int i = 0; i < arr2.length; i++) {
			String input1 = keyboard.next();
			arr1[2] = input1;
			System.out.println(arr1[2]);
		}
		System.out.print("Input2: ");
		while (keyboard.hasNext()) {
			output = keyboard.next();
		}
		System.out.println(output);

	}
}
