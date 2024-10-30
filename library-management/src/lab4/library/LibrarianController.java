package lab4.library;

public class LibrarianController {

	// GRASP Principle: Controller
	// Handles user requests like borrowing and returning books.
	// Delegates tasks to the appropriate objects.
	private Library library;

	// TODO: implement functionality of Member class
	public LibrarianController(Library library) {
		this.library = library;
	}

	public Library getLibrary() {
		return library;
	}
	//change following method names to match the final method name sin the classes
	public void borrowBook(Book b, Member m) {
		m.borrowBook(b);
	}
	public void returnBook(Book b, Member m) {
		m.returnBook(b);
	}
	public void showAvailableBooks() {
		library.showAvailableBooks();
	}
	public void showMembers() {
		library.showMembers;
	}
	public void addBook(Book b) {
		library.addBook(b);
	}
	public void addMember(Member m) {
		library.addMember(m);
	}
	public void removeBook(Book b) {
		library.removeBook(b);
	}
	public void removemember(Member m) {
		library.removeMember(m);
	}
}