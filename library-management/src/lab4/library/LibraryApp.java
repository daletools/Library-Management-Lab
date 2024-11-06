package lab4.library;

public class LibraryApp {

	public static void main(String[] args) {

		LibrarianController library = new LibrarianController(new Library());

		Member alice = new Member("Alice");
		Member bob = new Member("Bob");
		Member carl = new Member("Carl");

		Book dune = new Book("Dune", "Frank Herbert");
		Book _1984 = new Book("1984", "George Orwell");
		Book mobyDick = new Book("Moby Dick", "Herman Melville");
		Book fahrenheight451 = new Book("Fahrenheight 451", "Ray Bradbury");

		// Add and Remove a Member
		System.out.println("Adding a Member:");
		System.out.println("----------------");
		library.registerMember(alice);
		library.registerMember(bob);
		library.registerMember(carl);
		library.showAllMembers();

		System.out.println();
		System.out.println("Removing a Member:");
		System.out.println("------------------");
		library.removeMember(carl);
		library.showAllMembers();

		System.out.println();

		// Add and Remove a Book
		System.out.println("Adding a Book:");
		System.out.println("--------------");
		library.addBook(dune);
		library.addBook(_1984);
		library.addBook(mobyDick);
		library.addBook(fahrenheight451);
		library.showAvailableBooks();

		System.out.println();
		System.out.println("Removing a Book:");
		System.out.println("----------------");
		library.removeBook(fahrenheight451);
		library.displayCatalogue();

		System.out.println();

		// Borrow and Return a Book
		System.out.println("Borrow and Return a Book:");
		System.out.println("-------------------------");
		library.borrowBook(dune, alice);
		library.showAvailableBooks();
		System.out.println();
		library.borrowBook(_1984, bob);
		library.showAvailableBooks();
		System.out.println();
		library.borrowBook(dune, bob);
		library.showAvailableBooks();
		System.out.println();
		library.returnBook(dune, alice);
		library.showAvailableBooks();
		System.out.println();
		library.borrowBook(dune, bob);
		System.out.println();
		library.showAvailableBooks();
		System.out.println();
		library.displayCatalogue();

		System.out.println();

		// Lookup a book and member
		System.out.println("Lookup a Book and Member:");
		System.out.println("-------------------------");
		library.findMemberByName("Alice");
		library.findMemberByName("Henry");
		library.findBookByTitle("Moby Dick");
		library.findBookByTitle("Harry Potter");
	}
}