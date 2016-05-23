package finding.prime;

public class FindingPrime {

	public static boolean isPrime(int n) {

		if (n != 3 && n % 3 == 0) {
			return false;
		} else if (n != 2 && n % 2 == 0) {
			return false;
		} else if (n != 5 && n % 5 == 0) {
			return false;
		} else if (n != 7 && n % 7 == 0) {
			return false;
		} else {
			return true;
		}
	}

	public static void main(String[] args) {
		for (int i = 2; i <= 100; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}
}
