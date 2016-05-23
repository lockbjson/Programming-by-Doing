package array;

import java.util.Random;

public class BasicArray2 {
	public static void main(String[] args) {
		Random r = new Random();
		int[] a = new int[10];
		a[0] = 1 + r.nextInt(100);
		a[1] = 1 + r.nextInt(100);
		a[2] = 1 + r.nextInt(100);
		a[3] = 1 + r.nextInt(100);
		a[4] = 1 + r.nextInt(100);
		a[5] = 1 + r.nextInt(100);
		a[6] = 1 + r.nextInt(100);
		a[7] = 1 + r.nextInt(100);
		a[8] = 1 + r.nextInt(100);
		a[9] = 1 + r.nextInt(100);

		for (int i = 0; i < a.length; i++) {
			System.out.println("Slot " + i + " contains a " + a[i]);
		}
	}
}
