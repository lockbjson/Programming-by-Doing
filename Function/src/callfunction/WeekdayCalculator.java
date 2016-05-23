package callfunction;

import java.util.Scanner;

public class WeekdayCalculator {

	public static String weekday(int mm, int dd, int yyyy) {
		int yy, total, remainder = 0;
		String date = "";

		yy = yyyy - 1900;
		total = yy / 4;
		total = yy + total + dd + month_offset(mm);
		if (is_leap(yyyy)) {
			month_name(mm);
			if (mm == 1) {
				total = total - 1;
			} else if (mm == 2) {
				total = total - 1;
			}
		}
		remainder = total % 7;
		weekday_name(remainder);
		date = weekday_name(remainder) + ", " + month_name(mm) + " " + dd + ", " + yyyy + "!";
		return date;
	}

	public static int month_offset(int month) {
		if (month == 1) {
			return 1;
		} else if (month == 2) {
			return 4;
		} else if (month == 3) {
			return 4;
		} else if (month == 4) {
			return 0;
		} else if (month == 5) {
			return 2;
		} else if (month == 6) {
			return 5;
		} else if (month == 7) {
			return 0;
		} else if (month == 8) {
			return 3;
		} else if (month == 9) {
			return 6;
		} else if (month == 10) {
			return 1;
		} else if (month == 11) {
			return 4;
		} else if (month == 12) {
			return 6;
		} else {
			return -1;
		}
	}

	public static String month_name(int month) {
		String result = "";

		if (month == 1) {
			result = "January";
		} else if (month == 2) {
			result = "February";
		} else if (month == 3) {
			result = "March";
		} else if (month == 4) {
			result = "April";
		} else if (month == 5) {
			result = "May";
		} else if (month == 6) {
			result = "June";
		} else if (month == 7) {
			result = "July";
		} else if (month == 8) {
			result = "August";
		} else if (month == 9) {
			result = "Septemper";
		} else if (month == 10) {
			result = "October";
		} else if (month == 11) {
			result = "November";
		} else if (month == 12) {
			result = "December";
		} else {
			result = "error";
		}
		return result;
	}

	public static String weekday_name(int weekday) {
		String result = "";
		if (weekday == 1) {
			result = "Sunday";
		} else if (weekday == 2) {
			result = "Monday";
		} else if (weekday == 3) {
			result = "Tuesday";
		} else if (weekday == 4) {
			result = "Wednesday";
		} else if (weekday == 5) {
			result = "Thursday";
		} else if (weekday == 6) {
			result = "Friday";
		} else if (weekday == 7) {
			result = "Sartuday";
		} else if (weekday == 0) {
			result = "Sartuday";
		} else {
			result = "error";
		}
		return result;
	}

	public static boolean is_leap(int year) {
		boolean result = false;
		if (year % 400 == 0) {
			result = true;
		} else if (year % 100 == 0) {
			result = false;
		} else if (year % 4 == 0) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Welcome to Mr. Mitchell's fantastic birth-o-meter!");
		System.out.println();
		System.out.println("All you have to do is enter your birth date, and it will");
		System.out.println("tell you the day of the week on which you were born.");
		System.out.println();
		System.out.println("Some automatic tests....");
		System.out.println("12 10 2003 => " + weekday(12, 10, 2003));
		System.out.println(" 2 13 1976 => " + weekday(2, 13, 1976));
		System.out.println(" 2 13 1977 => " + weekday(2, 13, 1977));
		System.out.println(" 7  2 1974 => " + weekday(7, 2, 1974));
		System.out.println(" 1 15 2003 => " + weekday(1, 15, 2003));
		System.out.println("10 13 2000 => " + weekday(10, 13, 2000));
		System.out.println();

		System.out.println("Now it's your turn!  What's your birthday?");
		System.out.print("Birth date (mm dd yyyy): ");
		int mm = keyboard.nextInt();
		int dd = keyboard.nextInt();
		int yyyy = keyboard.nextInt();
		int a = 1;
		while (a != 0) {
			if (mm > 12 || dd > 31 || yyyy < 1900) {
				System.out.println("Please! Input birth date again.");
				System.out.print("Birth date (mm dd yyyy): ");
				mm = keyboard.nextInt();
				dd = keyboard.nextInt();
				yyyy = keyboard.nextInt();
				
			} else {
				System.out.print("You were born on ");
				System.out.println(weekday(mm, dd, yyyy));
				System.out.print("Do you want continue?(y/n): ");
				String yn = keyboard.next();
				if (yn.equals("y")) {
					System.out.print("Birth date (mm dd yyyy): ");
					mm = keyboard.nextInt();
					dd = keyboard.nextInt();
					yyyy = keyboard.nextInt();
				} else if (yn.equals("n")) {
					System.out.println("Good bye!!!");
					a = 0;
				} else {
					System.out.println("Please! Input again.");
				}
			}
		}
	}
}
