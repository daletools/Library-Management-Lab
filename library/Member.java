package lab4.library;

import java.util.ArrayList;

public class Member {

	// GRASP Principle: Information Expert and Low Coupling
	// Can borrow and return books.
	private static int memberCount = 0;
	private int memberID;
	private String name;
	private ArrayList<Book> borrowedBooks;

	public Member(String name) {
		memberCount++;
		this.memberID = memberCount;
		this.name = name;
		borrowedBooks = new ArrayList<>();
	}

	public void borrowBook(Book book) {
		book.setAvailable(false);
		borrowedBooks.add(book);
	}

	public void returnBook(Book book) {
		book.setAvailable(true);
		borrowedBooks.remove(book);
	}
}
