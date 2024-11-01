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

	public void addBook(Book book) {
		catalog.add(book);
		System.out.println(book + " has been added to the catalog.");
	}

	public void addMember(Member member) {
		if (!members.contains(member)) {
			members.add(member);
			System.out.println("Member " + member + " has been added.");
		} else {
			System.out.println("Member " + member + " already exists.");
		}
	}

	public void showAvailableBooks() {
		System.out.println("Available Books:");
		for (Book book : catalog) {
			if (book.isAvailable()) {
				System.out.println(book);
			}
		}
	}

	public void showAllMembers() {
		System.out.println("Library members:");
		for (Member member : members) {
			System.out.println(member);
		}
	}

	public void displayCatalog() {
		System.out.println("All Books:");
		for (Book book : catalog) {
			System.out.println(book);
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

	public Member findMember(String name) {
		for (Member member : members) {
			if (member.getName().equals(name)) {
				System.out.println("Found member: " + member);
				return member;
			}
		}
		System.out.println("Member with name " + name + " not found.");
		return null;
	}

	public Book findBook(String title) {
		for (Book book : catalog) {
			if (book.getTitle().equals(title)) {
				System.out.println("Found book: " + book);
				return book;
			}
		}
		System.out.println("Book with title " + title + " not found.");
		return null;
	}

}