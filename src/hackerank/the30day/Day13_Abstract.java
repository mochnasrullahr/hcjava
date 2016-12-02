package hackerank.the30day;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Day13_Abstract {
	public static void main(String[] args) throws FileNotFoundException {
//		Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(new FileInputStream("Day13_Abstract.txt"));
		String title = sc.nextLine();
		String author = sc.nextLine();
		int price = sc.nextInt();
		Book new_novel = new MyBook(title, author, price);
		new_novel.display();

	}
}

class MyBook extends Book {
	private int price;

	MyBook(String t, String a, int price) {
		super(t, a);
		this.price = price;
	}

	@Override
	void display() {
		System.out.format("Title: %s\nAuthor: %s\nPrice: %d", title, author, price);
	}

}

abstract class Book {
	String title;
	String author;

	Book(String t, String a) {
		title = t;
		author = a;
	}

	abstract void display();

}