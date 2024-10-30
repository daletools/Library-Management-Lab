package lab4.library;

public class Book {

	// GRASP Principle: Information Expert
	// Manages its own state (available or borrowed).
	private String title;
	private boolean isAvailable;

	// DONE: implement Book functionality
	public Book(String title) {
		this.title = title;
		this.isAvailable = true;
	}

	public String getTitle() {
		return title;
	}

	public boolean isAvailable() {
		return isAvailable;
	}
	
	public void setAvailable() {
		isAvailable = !isAvailable;
	}
}