package array;

import java.util.Random;

public class BasicArray3 {
	public static void main(String[] args) {
		Random r = new Random();
		int a[] = new int[1000];
		int b = 0;

		for (int i = 1; i <= a.length; i++) {
			a[b] = 10 + r.nextInt(90);
			System.out.print(a[b] + " ");
			if (i % 20 == 0) {
				System.out.println();
			}
		}
	}

}
