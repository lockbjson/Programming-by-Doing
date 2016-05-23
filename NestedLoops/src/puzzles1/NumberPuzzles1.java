package puzzles1;

public class NumberPuzzles1 {
	public static void main(String[] args) {
		int sum1, sum2;
		for (int a = 1; a < 60; a++) {
			for (int b = 1; b < 60; b++) {
				sum1 = a + b;
				sum2 = a - b;
				if (sum1 == 60 && a > b && sum2 == 14) {
					System.out.println("Sum is 60: " + a + " " + b + " ");
				}
			}
		}
	}
}
