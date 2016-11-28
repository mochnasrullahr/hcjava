package hackerank.the30day;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Key-Value data
 */
public class Day8 {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<String, Integer> phoneBook = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String name = in.next();
			int phone = in.nextInt();
			// Write code here
			phoneBook.put(name, phone);
		}
		while (in.hasNext()) {
			String s = in.next();
			// Write code here
			Integer data = phoneBook.get(s);
			if (data!=null) 
				System.out.format("%s=%d\n", s, data);
			else 
				System.out.println("Not found");
		}
		in.close();
	}
}
