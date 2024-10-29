package lab4.library;

import java.util.ArrayList;

public class Member {

	// GRASP Principle: Information Expert and Low Coupling
	// Can borrow and return books.

	private String name;
	private ArrayList<Book> borrowedBooks;
	// private borrowedbBooks TODO: implement collection of borrowed books

	// TODO: implement functionality of Member class
	public Member(String name) {
		this.name = name;
		this.borrowedBooks = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public ArrayList<Book> getBorrowedBooks() {
		return borrowedBooks;
	}

	
}