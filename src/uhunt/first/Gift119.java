package uhunt.first;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Gift119 {
	public static void main(String[] args) throws FileNotFoundException {
		// Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new FileInputStream("Gift119.txt"));
		boolean first = true;
		while (in.hasNext()) {
			if (first)
				first = false;
			else
				System.out.println();
			int count = in.nextInt();
			Map<String, Integer> gift = new HashMap<>();
			List<String> friends = new ArrayList<>();
			for (int i = 0; i < count; i++) {
				String name = in.next();
				gift.put(name, 0);
				friends.add(name);
			}
			for (int i = 0; i < count; i++) {
				String name = in.next();
				int money = in.nextInt();
				int friendCount = in.nextInt();
				if (money > 0 && friendCount>0 && money / friendCount > 0) {
					int give = money / friendCount;
					for (int j = 0; j < friendCount; j++) {
						String nameToGive = in.next();
						int currGift = gift.get(nameToGive);
						currGift += give;
						gift.put(nameToGive, currGift);
					}
				} else {
					for (int j = 0; j < friendCount; j++) {
						String skip = in.next();
					}
				}

				if (money > 0 && friendCount>0  && money / friendCount > 0) {
					int leftMoney = money % friendCount;
					int ownMoney = -money + gift.get(name) + leftMoney;
					gift.put(name, ownMoney);
				}
			}

			for (String name : friends) {
				System.out.println(name + " " + gift.get(name));
			}
//			System.out.println();
		}
		in.close();
	}
}
