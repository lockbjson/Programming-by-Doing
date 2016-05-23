package parallelarrays;

import java.util.Scanner;

public class ParallelArrays {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String[] s = { "Mitchell", "Ortiz", "Luu", "Zimmerman", "Brooks" };
		double[] d = new double[5];
		int[] in = { 123456, 813225, 823669, 307760, 827131 };

		System.out.println("Values: ");
		for (int i = 0; i < s.length; i++) {
			d[i] = 1 + (double) (Math.random() * 100);
			System.out.println("\t" + s[i] + " " + (Math.round(d[i] * 10.0) / 10.0) + " " + in[i]);
		}
		System.out.print("\nID number to find: ");
		int find = keyboard.nextInt();
		int slot = 0;
		String name = "";
		double ave = 0;
		int id = 0;
		for (int i = 0; i < in.length; i++) {
			if (find == in[i]) {
				name = s[i];
				ave = d[i];
				id = in[i];
				slot = i;
			}
		}
		System.out.println("Found in slot " + slot);
		System.out.println("\tName: " + name);
		System.out.println("\tAverage: " + (Math.round(ave * 10.0) / 10.0));
		System.out.println("\tID: " + id);
	}

}
