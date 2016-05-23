package individual;

public class IndividualDigits {
	public static void main(String[] args) {
		for (int a = 1; a < 10; a++) {
			for (int b = 0; b < 10; b++) {
				System.out.print(a + "" + b + ", " + a + "+" + b + " = " + (a + b) + "\n");
			}
		}
	}
}
