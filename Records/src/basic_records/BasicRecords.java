package basic_records;

import java.util.Scanner;

class Address {
	String name;
	int grade;
	double average;
}

public class BasicRecords {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		Address first = new Address();
		System.out.print("Enter the first student's name: ");
		first.name = keyboard.next();
		System.out.print("Enter the first student's grade: ");
		first.grade = keyboard.nextInt();
		System.out.print("Enter the first student's average: ");
		first.average = keyboard.nextDouble();
		System.out.println();

		Address second = new Address();
		System.out.print("Enter the second student's name: ");
		second.name = keyboard.next();
		System.out.print("Enter the second student's grade: ");
		second.grade = keyboard.nextInt();
		System.out.print("Enter the second student's average: ");
		second.average = keyboard.nextDouble();
		System.out.println();

		Address third = new Address();
		System.out.print("Enter the third student's name: ");
		third.name = keyboard.next();
		System.out.print("Enter the third student's grade: ");
		third.grade = keyboard.nextInt();
		System.out.print("Enter the third student's average: ");
		third.average = keyboard.nextDouble();
		System.out.println();

		System.out.print("The names are: " + first.name + " " + second.name + " " + third.name + "\n");
		System.out.print("The grades are: " + first.grade + " " + second.grade + " " + third.grade + "\n");
		System.out.print("The averages are: " + first.average + " " + second.average + " " + third.average + "\n");
		System.out.println();

		double ave = (first.average + second.average + third.average) / 3;

		System.out.println("The average for the three students is: " + ave);

	}
}
