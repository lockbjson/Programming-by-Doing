package twentyquestion;

import java.util.Scanner;

public class TwentyQuestionv2 {
	private static String type;
	private static String size;
	private static String result = "";

	public static void check() {
		if (type.equalsIgnoreCase("inside") && size.equalsIgnoreCase("yes")) {
			result = "houseplant";
		}
		if (type.equalsIgnoreCase("inside") && size.equalsIgnoreCase("no")) {
			result = "shower curtain";
		}
		if (type.equalsIgnoreCase("outsite") && size.equalsIgnoreCase("yes")) {
			result = "bison";
		}
		if (type.equalsIgnoreCase("outsite") && size.equalsIgnoreCase("no")) {
			result = "billboard";
		}
		if (type.equalsIgnoreCase("both") && size.equalsIgnoreCase("yes")) {
			result = "dog";
		}
		if (type.equalsIgnoreCase("both") && size.equalsIgnoreCase("no")) {
			result = "cell phone";
		}
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("TWO MORE QUESTIONS, BABY!");
		System.out.println();
		System.out.println("Think of something and I'll try to guess it!");
		System.out.println();

		System.out.print("Question 1) Does it stay inside or outside or both? ");
		type = keyboard.next();

		System.out.print("Question 2) Is it a living thing? ");
		size = keyboard.next();

		TwentyQuestionv2.check();
		System.out.println("" + result);
	}

}
