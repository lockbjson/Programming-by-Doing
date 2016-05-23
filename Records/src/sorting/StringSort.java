package sorting;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class StringSort {
	public static void main(String[] args) throws IOException {
		Car[] car = new Car[5];
		Car temp;
		int i = 0;
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		System.out.print("From which file do you want to load this information? ");
		String file = keyboard.next();
		Scanner readFile = new Scanner(new File(file));

		while (readFile.hasNext()) {
			car[i] = new Car();
			car[i].make = readFile.next();
			car[i].model = readFile.next();
			car[i].year = readFile.nextInt();
			car[i].license = readFile.next();
			i++;
		}
		readFile.close();
		System.out.println("Data loaded.");
		System.out.println("Data sorted.");

		for (i = 0; i < car.length; i++) {
			for (int j = i + 1; j < car.length; j++) {
				if (car[i].make.compareTo(car[j].make) > 0) {
					temp = car[i];
					car[i] = car[j];
					car[j] = temp;
				}
			}
		}

		for (i = 0; i < car.length; i++) {
			System.out.println("Car " + (i + 1));
			System.out.println("\tMake: " + car[i].make);
			System.out.println("\tModel: " + car[i].model);
			System.out.println("\tYear: " + car[i].year);
			System.out.println("\tLicense: " + car[i].license);
			System.out.println();
		}
	}
}
