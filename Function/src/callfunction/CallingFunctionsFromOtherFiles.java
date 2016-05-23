package callfunction;

import java.util.Scanner;

public class CallingFunctionsFromOtherFiles {

	public static String weekday(int mm, int dd, int yyyy) {
		int yy, total, remainder = 0;
		String date = "";

		yy = yyyy - 1900;
		total = yy / 4;
		total = yy + total + dd + monthoffset.MonthOffset.month_offset(mm);
		if (weekday.calculator.WeekdayCalculator.is_leap(yyyy)) {
			monthname.MonthName.month_name(mm);
			if (mm == 1) {
				total = total - 1;
			} else if (mm == 2) {
				total = total - 1;
			}
		}
		remainder = total % 7;
		weekdayname.WeekDayName.weekday_name(remainder);
		date = weekdayname.WeekDayName.weekday_name(remainder) + ", " + monthname.MonthName.month_name(mm) + " " + dd
				+ ", " + yyyy + "!";
		return date;
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
