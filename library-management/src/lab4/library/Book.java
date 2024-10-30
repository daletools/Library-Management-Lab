package lab4.library;

public class Book {

	// GRASP Principle: Information Expert
	// Manages its own state (available or borrowed).
	private String title;
	private String author;
	private boolean isAvailable;

	// DONE: implement Book functionality
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.isAvailable = true;
	}

	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}

	public boolean isAvailable() {
		return isAvailable;
	}
	
	public void setAvailable() {
		isAvailable = !isAvailable;
	}
	
	public String toString() {
		return title + ", written by " + author;
	}
}