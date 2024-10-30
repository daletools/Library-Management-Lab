package lab4.library;

import java.util.ArrayList;

public class Member {

	// GRASP Principle: Information Expert and Low Coupling
	// Can borrow and return books.
	private static int incrementID = 0;
	private int memberID;
	private String name;
	private ArrayList<Book> borrowedBooks;

	public Member(String name) {
		incrementID++;
		memberID = incrementID;
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
		if (book.isAvailable()) {
			book.setAvailable();
			borrowedBooks.add(book);
			System.out.println(this + ", has borrowed " + book);
		} else {
			System.out.println("Book is not available.");
		}
	}

	public void returnBook(Book book) {
		if (borrowedBooks.contains(book)) {
			book.setAvailable();
			borrowedBooks.remove(book);
			System.out.println(this + ", has returned " + book);
		} else {
			System.out.println("Member does not have book borrowed.");
		}
	}

	@Override
	public String toString() {
		return name + ", ID#" + memberID;
	}
}
