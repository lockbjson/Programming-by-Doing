package little_database_shorter_loop;

import java.util.Scanner;

class Student {
	String name;
	int grade;
	double average;
}

public class ALittleDatabaseLoop {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		Student[] stu = new Student[3];
		double ave;

		for (int i = 0; i < stu.length; i++) {
			stu[i] = new Student();
			System.out.print("Enter student " + (i + 1) + "'s name: ");
			stu[i].name = keyboard.next();
			System.out.print("Enter student " + (i + 1) + "'s grade: ");
			stu[i].grade = keyboard.nextInt();
			System.out.print("Enter student " + (i + 1) + "'s average: ");
			stu[i].average = keyboard.nextDouble();

		}
		System.out.print("The name are: ");
		for (int i = 0; i < stu.length; i++) {
			System.out.print(stu[i].name + " ");
		}
		System.out.print("The grades are: ");
		for (int i = 0; i < stu.length; i++) {
			System.out.print(stu[i].grade + " ");
		}
		System.out.print("The averages are: ");
		for (int i = 0; i < stu.length; i++) {
			System.out.print(stu[i].average + " ");
		}

	}
}
