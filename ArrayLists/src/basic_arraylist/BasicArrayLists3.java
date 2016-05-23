package basic_arraylist;

import java.util.ArrayList;

public class BasicArrayLists3 {
	public static void main(String[] args) {
		int[] in = new int[40];
		ArrayList<Integer> ar = new ArrayList<Integer>();
		for (int i = 0; i < in.length; i++) {
			in[i] = 10 + (int) (Math.random() * 90);
			ar.add(in[i]);
		}
		System.out.println(ar);
	}
}
