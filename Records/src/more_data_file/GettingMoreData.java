package more_data_file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Person {
	String name;
	int age;

	public String toString() {
		return this.name + this.age;
	}
}

public class GettingMoreData {

	public static void main(String[] args) throws IOException {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Which file to open: ");
		String readFile = keyboard.next();
		Scanner file = new Scanner(new File(readFile));

		System.out.println("Reading data from " + readFile);
		System.out.println();

		Person[] p = new Person[5];
		for (int i = 0; i < p.length; i++) {
			p[i] = new Person();
			p[i].name = file.nextLine();
			p[i].age = Integer.parseInt(file.nextLine());
			System.out.println(p[i].name + " is " + p[i].age);
		}
	}
}
