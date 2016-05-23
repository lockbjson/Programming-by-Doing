package webaddresses;

import java.net.URL;
import java.util.Scanner;

class Address {
	String street;
	String city;
	String state;
	int zip;
}

public class WebAddresses {
	public static void main(String[] args) throws Exception {
		URL addys = new URL("https://cs.leanderisd.org/txt/fake-addresses.txt");
		Scanner fin = new Scanner(addys.openStream());
		while (fin.hasNext()) {
			Address uno = new Address();
			uno.street = fin.nextLine();
			uno.city = fin.nextLine();
			uno.state = fin.next();
			uno.zip = fin.nextInt();
			fin.skip("\n");
			System.out.println(uno.street + ", " + uno.city + ", " + uno.state + "  " + uno.zip);
		}
		fin.close();

	}
}
