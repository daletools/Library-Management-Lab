package lab4.library;

public class LibrarianController {

	// GRASP Principle: Controller
	// Handles user requests like borrowing and returning books.
	// Delegates tasks to the appropriate objects.
	private Library library;

	// DONE: implement functionality of Member class
	public LibrarianController(Library library) {
		this.library = library;
	}

	public Library getLibrary() {
		return library;
	}

	public void borrowBook(Book b, Member m) {
		m.borrowBook(b);
	}
	public void returnBook(Book b, Member m) {
		m.returnBook(b);
	}
	public void showAvailableBooks() {
		library.showAvailableBooks();
	}
	public void displayCatalogue() {
		library.displayCatalog();
	}
	public void showAllMembers() {
		library.showAllMembers();
	}
	public void addBook(Book b) {
		library.addBook(b);
	}
	public void registerMember(Member m) {
		library.registerMember(m);
	}
	public void removeBook(Book b) {
		library.removeBook(b);
	}
	public void removeMember(Member m) {
		library.removeMember(m);
	}
	public Member findMemberByName(String s) {
		return library.findMemberByName(s);
	}
	public Book findBookByTitle(String s) {
		return library.findBookbyTitle(s);
	}
}