package controller;

import entities.Book;
import entities.Loan;

public class LibraryController {

	public Loan bookBorrow(Book book) {
		if (!book.isAvailable()) {
			throw new IllegalStateException("Book unavailble");
		}

		book.setAvailable(false);

		return new Loan(book);
	}
}
