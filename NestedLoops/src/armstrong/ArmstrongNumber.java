package armstrong;

public class ArmstrongNumber {
	public static void main(String[] args) {
		for (int a = 1; a < 10; a++) {
			for (int b = 0; b < 10; b++) {
				for (int c = 0; c < 10; c++) {
					int result = (int) (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
					int ams = (a * 100) + (b * 10) + (c * 1);
					if (result == ams) {
						System.out.print(result + " ");
					}
				}
			}
		}
	}
}
