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
	
}