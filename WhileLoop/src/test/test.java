package test;

public class test {
	private static String r1_cA, r2_cA, r3_cA, r4_cA, r5_cA;
	private static String r1_cB, r2_cB, r3_cB, r4_cB, r5_cB;

	public static void checkA() {
		r1_cA = "  ";
		r2_cA = "  ";
		r3_cA = "* ";
		r4_cA = "* ";
		r5_cA = "* ";
		System.out.println(r1_cA);
		System.out.println(r2_cA);
		System.out.println(r3_cA);
		System.out.println(r4_cA);
		System.out.println(r5_cA);
		System.out.println("A" + " ");
	}

	public static void checkB() {
		r1_cB = "  ";
		r2_cB = "* ";
		r3_cB = "* ";
		r4_cB = "* ";
		r5_cB = "* ";
		System.out.println(r1_cA + r1_cB);
		System.out.println(r2_cA + r2_cB);
		System.out.println(r3_cA + r3_cB);
		System.out.println(r4_cA + r4_cB);
		System.out.println(r5_cA + r5_cB);
		System.out.println("A" + " " + "B");
	}

	public static void main(String[] args) {
		checkA();
		checkB();
	}

}
