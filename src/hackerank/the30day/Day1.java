package hackerank.the30day;

import java.util.Scanner;

public class Day1 {
	public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        
        /* Declare second integer, double, and String variables. */
        int inputInt = Integer.parseInt(scan.nextLine());
        double inputDouble = Double.parseDouble(scan.nextLine());
        String inputString = scan.nextLine(); 
        /* Read and save an integer, double, and String to your variables.*/

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+inputInt);
        /* Print the sum of the double variables on a new line. */
		System.out.println(d+inputDouble);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(s+inputString);
        
        scan.close();
    }
}
