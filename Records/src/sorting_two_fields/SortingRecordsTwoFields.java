package sorting_two_fields;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class StudentGrade {
	int id;
	int gradeNumber;
	int grade;
	String letterGrade;
}

public class SortingRecordsTwoFields {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Open which file: ");
		String file = keyboard.next();
		Scanner readFile = new Scanner(new File(file));
		System.out.println();

		StudentGrade[] sg = new StudentGrade[30];
		int i = 0;
		StudentGrade temp;

		while (readFile.hasNext()) {
			sg[i] = new StudentGrade();
			sg[i].id = Integer.parseInt(readFile.next());
			sg[i].gradeNumber = Integer.parseInt(readFile.next());
			sg[i].grade = Integer.parseInt(readFile.next());
			sg[i].letterGrade = readFile.next();
			i++;
		}
		readFile.close();
		System.out.println("Data loaded!");
		System.out.println("Data sorted!");
		System.out.println();

		// for (i = 0; i < sg.length; i++) {
		// for (int j = i + 1; j < sg.length; j++) {
		// if (sg[i].id > sg[j].id || sg[i].gradeNumber > sg[j].gradeNumber) {
		// temp = sg[i];
		// sg[i] = sg[j];
		// sg[j] = temp;
		// }
		// }
		// }
		for (i = 0; i < sg.length; i++) {
			for (int j = i + 1; j < sg.length; j++) {
				if (sg[i].id > sg[j].id) {
					temp = sg[i];
					sg[i] = sg[j];
					sg[j] = temp;
				}
			}
		}

		for (i = 0; i < sg.length; i++) {
			for (int j = i + 1; j < sg.length; j++) {
				if (sg[i].id == sg[j].id && sg[i].gradeNumber > sg[j].gradeNumber) {
					temp = sg[i];
					sg[i] = sg[j];
					sg[j] = temp;
				}
			}
		}

		System.out.println("Here are the sorted grades: ");
		for (i = 0; i < sg.length; i++) {
			System.out.print(sg[i].id + " " + sg[i].gradeNumber + " " + sg[i].grade + " " + sg[i].letterGrade);
			System.out.println();
		}
	}
}
