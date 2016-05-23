package little_database;

import java.util.Scanner;

class Student {
	String name;
	int grade;
	double average;
}

public class ALittleDatabase {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		Student[] stu = new Student[3];

		stu[0] = new Student();
		System.out.print("Enter the first student's name: ");
		stu[0].name = keyboard.next();
		System.out.print("Enter the first student's grade: ");
		stu[0].grade = keyboard.nextInt();
		System.out.print("Enter the first student's average: ");
		stu[0].average = keyboard.nextDouble();
		System.out.println();

		stu[1] = new Student();
		System.out.print("Enter the second student's name: ");
		stu[1].name = keyboard.next();
		System.out.print("Enter the second student's grade: ");
		stu[1].grade = keyboard.nextInt();
		System.out.print("Enter the second student's average: ");
		stu[1].average = keyboard.nextDouble();
		System.out.println();

		stu[2] = new Student();
		System.out.print("Enter the third student's name: ");
		stu[2].name = keyboard.next();
		System.out.print("Enter the third student's grade: ");
		stu[2].grade = keyboard.nextInt();
		System.out.print("Enter the third student's average: ");
		stu[2].average = keyboard.nextDouble();
		System.out.println();

		System.out.print("The names are: " + stu[0].name + " " + stu[1].name + " " + stu[2].name + "\n");
		System.out.print("The grades are: " + stu[0].grade + " " + stu[1].grade + " " + stu[2].grade + "\n");
		System.out.print("The averages are: " + stu[0].average + " " + stu[1].average + " " + stu[2].average + "\n");
		System.out.println();

		double ave = (stu[0].average + stu[1].average + stu[2].average) / 3;

		System.out.println("The average for the three students is: " + ave);
	}
}
