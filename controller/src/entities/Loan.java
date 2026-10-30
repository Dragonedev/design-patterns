package entities;

public class Loan {

	private Book book;

	public Loan(Book book) {
		this.book = book;
	}

	public Book getBook() {
		return book;
	}
}
