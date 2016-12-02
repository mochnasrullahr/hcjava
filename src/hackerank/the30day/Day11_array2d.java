package hackerank.the30day;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day11_array2d {
	public static void main(String[] args) throws FileNotFoundException {
		// Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new FileInputStream("Day11_array2d.txt"));
		int arr[][] = new int[6][6];
		int[] hg = {1, 2, 3, 5, 7, 8, 9};
		int hgw = 3, hgh = 3;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				int n = in.nextInt();
				arr[i][j] = n;
//				System.out.print(n + " ");
			}
//			System.out.println();
		}
		in.close();

		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				int sum = arr[j][i]+arr[j][i+1]+arr[j][i+2]+arr[j+1][i+1]+arr[j+2][i]+arr[j+2][i+1]+arr[j+2][i+2];
				if (sum>maxSum) {
					maxSum = sum;
//					System.out.format("i: %d, j: %d\n", j, i);
//					System.out.format("%d %d %d\n  %d\n%d %d %d\n", arr[j][i], arr[j][i+1], arr[j][i+2], arr[j+1][i+1], arr[j+2][i], arr[j+2][i+1], arr[j+2][i+2]);
				}
			}
		}
		System.out.println(maxSum);
	}
}
