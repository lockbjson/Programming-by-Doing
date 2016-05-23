package copy_array;

import java.util.ArrayList;
import java.util.List;

public class CopyingArrayLists {
	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		// array list 1
		for (int i = 0; i < 10; i++) {
			int r = 1 + (int) (Math.random() * 100);
			al1.add(r);
		}
		// copy array list 1 in another array list
		ArrayList<Integer> al2 = new ArrayList<Integer>(al1);
		
		// change the last value in the first ArrayList to a -7
			al1.set(al1.size() - 1, -7);

		// print ArrayList 1
		System.out.println("ArrayList 1: " + al1);

		// print ArrayList 2
		for (int i = 0; i < 10; i++) {
		}
		System.out.println("ArrayList 2: " + al2);

	}

}
