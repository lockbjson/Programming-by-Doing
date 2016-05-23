package hangman;

public class Test {
	public static void main(String[] args) {
		String s = "departure";
		char words[] = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			System.out.print(words[i] + " ");
			if (String.valueOf(words[i]).equals(s)) {
				System.out.println("cuc");
			}
		}
	}
}