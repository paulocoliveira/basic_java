package fundamentals.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class UsingStack {

	public static void main(String[] args) {
		Deque<String> books = new ArrayDeque<String>();
		books.add("book 1");
		books.push("book 2");
		books.push("book 3");
		
		books.size();
		
		for (String book: books) {
			System.out.println(">>> " + book);
		}
		
		//books.clear();
		books.isEmpty();
		books.size();
		books.contains("Rafaela");
		
		System.out.println(books.peek());
		System.out.println(books.element());
		
		System.out.println(books.pop());
		System.out.println(books.poll());
		System.out.println(books.poll());
		System.out.println(books.poll());
		System.out.println(books.pop());
		//System.out.println(books.remove());// TODO Auto-generated method stub

	}

}
