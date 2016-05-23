package basic_arraylist;

import java.util.ArrayList;

public class BasicArrayLists1 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			al.add(-113);
			System.out.println("Slot " + (al.size() - 1) + " contains a " + al.get(i));
		}
	}

}
