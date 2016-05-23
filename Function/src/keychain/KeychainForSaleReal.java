package keychain;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class KeychainForSaleReal {
	public static Scanner keyboard;
	private static int count;

	public static int add_keychains() {
		int add = 0;
		int a = 1;
		keyboard = new Scanner(System.in);

		while (a != 0) {
			System.out.print("You have " + count + " keychains. How many to add? ");
			add = keyboard.nextInt();
			if (add < 0) {
				System.out.println("Must a positive number. Try again!");
			} else {
				a = 0;
			}
		}
		count = add + count;
		System.out.println("You now have " + count + " keychains.");
		return count;
	}

	public static int remove_keychains() {
		int remove;
		keyboard = new Scanner(System.in);

		System.out.print("You have " + count + " keychains. How many to remove? ");
		remove = keyboard.nextInt();
		count = count - remove;
		System.out.println("You now have " + count + " keychains.");
		return count;
	}

	public static void view_order(int num_keychains, double price_per_keychains, double tax, int base_shipping,
			int per_keychain_shipping) {
		int price = 10;
		per_keychain_shipping = 1;
		int sub_total_before_tax = (count * price) + (per_keychain_shipping * count) + base_shipping;
		tax = 8.25;
		base_shipping = 5;
		double final_cost = (sub_total_before_tax - (sub_total_before_tax / (1 + tax / 100))) + sub_total_before_tax;
		System.out.println("You have " + count + " keychains.");
		System.out.println("Keychains cost $" + price + " each.");
		System.out.println("The additional per keychain shipping cost is $" + per_keychain_shipping);
		System.out.println("The shipping charges on the order $" + base_shipping);
		System.out.println("The subtotal before tax is $" + sub_total_before_tax);
		System.out.println("The tax on the order is " + tax + "%");
		System.out.println("The final cost of the order is $" + final_cost + ".");
	}

	public static void checkout() {
		int price = 10;
		int total;
		double tax = 8.25;
		int shipping = 5;
		int per_keychain_shipping = 1;
		total = count * price;
		keyboard = new Scanner(System.in);

		System.out.println("CHECKOUT\n");
		System.out.print("What is your name? ");
		String name = keyboard.next();
		view_order(count, price, tax, shipping, per_keychain_shipping);
		System.out.println("Thanks for your order, " + name);
	}

	public static void main(String[] args) {
		double tax = 0.0825;
		int shipping_cost = 5;
		int additional = 1;
		int price = 10;
		int choose = 1;
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Ye Olde Keychain Shoppe\n");

		while (choose != 0) {
			System.out.println();
			System.out.println("1. Add Keychains to Order");
			System.out.println("2. Remove Keychains from Order");
			System.out.println("3. View Current Order");
			System.out.println("4. Checkout\n");

			System.out.print("Please enter your choice: ");
			int menu = keyboard.nextInt();
			System.out.println();
			if (menu == 1) {
				add_keychains();
			} else if (menu == 2) {
				remove_keychains();
			} else if (menu == 3) {
				view_order(count, price, tax, shipping_cost, additional);
			} else if (menu == 4) {
				checkout();
				choose = 0;
			} else {
				System.out.println("ERROR!");
			}
		}
	}
}
