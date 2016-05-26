package sorting_arraylist_records;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Car {
	String make;
	String model;
	int year;
	String license;

	public String toString() {
		return this.year + " " + this.make + " " + this.model + " " + this.license;
	}
}

public class SortingRecords {
	public static void main(String[] args) throws IOException {
		ArrayList<Car> arr = new ArrayList<Car>();
		Car[] car = new Car[5];
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		System.out.print("From which file do you want to load this information? ");
		String file = keyboard.next();
		@SuppressWarnings("resource")
		Scanner readFile = new Scanner(new File(file));
		System.out.println();

		for (int i = 0; i < car.length; i++) {
			car[i] = new Car();
			car[i].make = readFile.next();
			car[i].model = readFile.next();
			car[i].year = readFile.nextInt();
			car[i].license = readFile.next();
			arr.add(car[i]);
		}
		System.out.println("Data loaded.");
		// System.out.println("ArrayList before: " + arr);

		System.out.println("Data sorted.");
		for (int i = 0; i < arr.size(); i++) {
			for (int j = 0; j < arr.size(); j++) {
				if (arr.get(i).year < arr.get(j).year) {
					Car temp = arr.get(i);
					arr.set(i, arr.get(j));
					arr.set(j, temp);
				}
			}
		}
		System.out.println("ArrayList: " + arr);
	}
}
