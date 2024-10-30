package lab4.library;

import java.util.ArrayList;

public class Library {

	// GRASP Principles: Creator, Controller
	// Manage the catalog of books and members.
	// Track which books are borrowed and available

	// Attributes:
	// private catalog (list of Book)
	// private members (list of Members)
	private ArrayList<Book> catalog;
	private ArrayList<Member> members;

	// TODO: implement functionality of Member class
	public Library() {
		this.catalog = new ArrayList<>();
		this.members = new ArrayList<>();
	}

	public ArrayList<Book> getCatalog() {
		return catalog;
	}

	public ArrayList<Member> getMembers() {
		return members;
	}

	// Adds a book to the library catalog
	public void addBook(Book book) {
		catalog.add(book);
		System.out.println(book + " has been added to the catalog.");
	}

	// Adds a new member to the library
	public void addMember(Member member) {
		if (!members.contains(member)) {
			members.add(member);
			System.out.println("Member " + member + " has been added.");
		} else {
			System.out.println("Member " + member + " already exists.");
		}
	}

	// Show the available books in the library
	public void showAvailableBooks() {
		System.out.println("Available Books:");
		for (Book book : catalog) {
			if (book.isAvailable()) {
				System.out.println(book);
			}
		}
	}

	// Show members of in the library
	public void showAllMembers() {
		System.out.println("Library members:");
		for (Member member : members) {
			System.out.println(member);
		}
	}

	public void removeBook(Book book) {
		if (catalog.contains(book)) {
			catalog.remove(book);
			System.out.println("The book " + book + " has been removed.");
		} else {
			System.out.println("The book " + book + " is not in the catalog.");
		}
	}
	
	public void removeMember(Member member) {
		if (members.contains(member)) {
			members.remove(member);
			System.out.println("Member " + member + " has been removed.");
		} else {
			System.out.println("Member " + member + " is not registered.");
		}
	}
	
	

}