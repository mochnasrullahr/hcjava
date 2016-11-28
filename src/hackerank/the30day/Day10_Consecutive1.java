package hackerank.the30day;

import java.util.Scanner;

public class Day10_Consecutive1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int result = consecutive1(n);
		System.out.println(result);
	}

	private static int consecutive1(int n) {
		String binary = getBinary(n);
		String[] split1 = binary.split("[0]");
		int max = 0;
		for (int i = 0; i < split1.length; i++) {
			if (split1[i].length()>max)
				max=split1[i].length();
		}
		return max;
	}

	private static String getBinary(int n) {
		return Integer.toBinaryString(n);
	}
}
