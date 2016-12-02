package hackerank.the30day;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Day12_Inheritance {
	public static void main(String[] args) throws FileNotFoundException {
//		Scanner scan = new Scanner(System.in);
		Scanner scan = new Scanner(new FileInputStream("Day12_Inheritance.txt"));
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}

class Student extends Person{
	public Student(String firstName, String lastName, int id, int[] testScores2) {
		super(firstName, lastName, id);
		testScores = testScores2;
	}

	public String calculate() {
		int total = 0;
		for (int i : testScores) {
			total +=i;
		}
		int avg = total / testScores.length;
		if (90<=avg && avg<=100) return "O";
		if (80<=avg && avg<90) return "E";
		if (70<=avg && avg<80) return "A";
		if (55<=avg && avg<70) return "P";
		if (40<=avg && avg<55) return "D";
		if (avg<40) return "T";
		
		return null;
	}

	private int[] testScores;
   
}

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}