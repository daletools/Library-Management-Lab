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

	// change following method names to match the final method name sin the classes
	public void borrowBook(String title, String name) {
		Book b = library.findBookbyTitle(title);
		Member m = library.findMemberByName(name);
		if (b == null || m == null) {
			System.out.println("Book or Member cannot be null.");
			return;
		}
		m.borrowBook(b);
	}

	public void returnBook(String title, String name) {
		Book b = library.findBookbyTitle(title);
		Member m = library.findMemberByName(name);
		if (b == null || m == null) {
			System.out.println("Book or Member cannot be null.");
			return;
		}
		m.returnBook(b);
	}

	public void showAvailableBooks() {
		library.showAvailableBooks();
	}

	public void showAllMembers() {
		library.showAllMembers();
	}

	public void addBook(Book b) {
		if (b != null) {
			library.addBook(b);
		} else {
			System.out.println("Book cannot be null.");
		}

	}

	public void registerMember(Member m) {
		if (m != null) {
			library.registerMember(m);
		} else {
			System.out.println("Member cannot be null.");
		}
	}

	public void removeBook(Book b) {
		if (b != null) {
			library.removeBook(b);
		} else {
			System.out.println("Book cannot be null.");
		}
	}

	public void removeMember(Member m) {
		if (m != null) {
			library.removeMember(m);
		} else {
			System.out.println("Member cannot be null.");
		}
	}

	public Member findMemberByName(String name) {
		return library.findMemberByName(name);
	}

	public Book findBookbyTitle(String title) {
		return library.findBookbyTitle(title);
	}

	public void displayCatalog() {
		library.displayCatalog();
	}
}