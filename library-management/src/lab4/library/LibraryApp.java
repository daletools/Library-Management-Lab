package lab4.library;

public class LibraryApp {

public static void main(String[] args) {
	
	LibrarianController library = new LibrarianController(new Library());
	Book dune = new Book("Dune", "Frank Herbert");
	Book _1984 = new Book("1984", "George Orwell");
	Book mobyDick = new Book("Moby Dick", "Herman Melville");
			
	library.addBook(dune);
	library.addBook(_1984); 
	library.addBook(mobyDick);
	library.showAvailableBooks();
	
	Member alice = new Member("Alice");
	Member bob = new Member("Bob");
	
	library.addMember(alice);
	library.addMember(bob);
	
	library.showAllMembers();
	
	library.borrowBook(dune, alice);
	library.showAvailableBooks();
	library.borrowBook(_1984, bob);
	library.showAvailableBooks();
	library.borrowBook(dune, bob);
	library.showAvailableBooks();
	library.returnBook(dune, alice);
	library.showAvailableBooks();
	library.borrowBook(dune, bob);
	library.showAvailableBooks();

	}
}