package lab4.library;

import java.util.ArrayList;

public class Member {

	// GRASP Principle: Information Expert and Low Coupling
	// Can borrow and return books.
	private int memberID;
	private String name;
	private ArrayList<Book> borrowedBooks;

	public Member(int memberID, String name) {
		this.memberID = memberID;
		this.name = name;
		this.borrowedBooks = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public ArrayList<Book> getBorrowedBooks() {
		return borrowedBooks;
	}

	public void borrowBook(Book book) {
		book.setAvailable();
		borrowedBooks.add(book);
	}

	public void returnBook(Book book) {
		book.setAvailable();
		borrowedBooks.remove(book);
	}

}
