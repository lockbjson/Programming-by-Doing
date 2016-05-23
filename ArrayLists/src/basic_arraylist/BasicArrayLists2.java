package basic_arraylist;

import java.util.ArrayList;
import java.util.Random;

public class BasicArrayLists2 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			int a = 1 + r.nextInt(100);
			al.add(a);
		}
		System.out.println("ArrayList: " + al);
	}
}
