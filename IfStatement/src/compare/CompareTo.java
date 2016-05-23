package compare;

public class CompareTo {
	public static void main(String[] args) {

		System.out.println("------------< 0------------");
		System.out.print("Comparing \"axe\" with \"cat\" produces ");
		int i1 = "axe".compareTo("cat");
		System.out.println(i1);

		System.out.print("Comparing \"anh\" with \"yeu\" produces ");
		int i2 = "anh".compareTo("yeu");
		System.out.println(i2);

		System.out.print("Comparing \"snack\" with \"snake\" produces ");
		int i3 = "snack".compareTo("snake");
		System.out.println(i3);

		System.out.print("Comparing \"artichoke\" with \"potato\" produces ");
		int i4 = "artichoke".compareTo("potato");
		System.out.println(i4);

		System.out.print("Comparing \"mink\" with \"mint\" produces ");
		int i5 = "mink".compareTo("mint");
		System.out.println(i5);

		System.out.println("--------------> 0-------------");
		System.out.print("Comparing \"pick someone up\" with \"falling love\" produces ");
		System.out.println("pick someone up".compareTo("falling love"));

		System.out.print("Comparing \"Hello\" with \"Facebook\" produces ");
		System.out.println("Hello".compareTo("Facebook"));

		System.out.print("Comparing \"you\" with \"xme\" produces ");
		System.out.println("you".compareTo("xme"));

		System.out.print("Comparing \"hot\" with \"!h0t\" produces ");
		System.out.println("hot".compareTo("!h0t"));

		System.out.print("Comparing \"h3ate\" with \"S4uccess\" produces ");
		System.out.println("h3ate".compareTo("S4uccess"));

		System.out.println("------------0------------");
		System.out.print("Comparing \"axe\" with \"axe\" produces ");
		int i10 = "axe".compareTo("axe");
		System.out.println(i10);

		System.out.print("Comparing \"---\" with \"---\" produces ");
		System.out.println("---".compareTo("---"));
	}

}
