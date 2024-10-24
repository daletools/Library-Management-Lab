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

}