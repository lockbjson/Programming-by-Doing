package keyboard;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		String firstName, lastName, loginName;
		int grade, sid;
		double gpa;

		Scanner keyboard = new Scanner(System.in);

		System.out.print("First name: ");
		firstName = keyboard.next();

		System.out.print("Last name: ");
		lastName = keyboard.next();

		System.out.print("Grade (9-12): ");
		grade = keyboard.nextInt();

		System.out.print("Student ID: ");
		sid = keyboard.nextInt();

		System.out.print("Login: ");
		loginName = keyboard.next();

		System.out.print("GPA (0.0 - 4.0): ");
		gpa = keyboard.nextDouble();

		System.out.println("Your information:");
		System.out.println("\t Login: " + loginName);
		System.out.println("\t ID: " + sid);
		System.out.println("\t Name: " + lastName + ", " + firstName);
		System.out.println("\t GPA: " + gpa);
		System.out.println("\t Grade: " + grade);

	}

}
