package hackerank.the30day;

import java.util.Scanner;

public class Day6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < T; i++) {
			String input = sc.nextLine();
			int leng = input.length();
			String left = "";
			String right = "";
			for (int j = 0; j < leng; j++) {
				if (j%2==0) left += input.charAt(j);
				else right += input.charAt(j);
			}
			System.out.format("%s %s", left, right);
			System.out.println();
		}
		sc.close();
	}
}
