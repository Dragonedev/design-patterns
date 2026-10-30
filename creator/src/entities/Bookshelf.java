package entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bookshelf {

	private List<Book> books = new ArrayList<>();

	public Book addBook(String title) {
		Book book = new Book(title);
		books.add(book);

		return book;
	}

	public List<Book> getBooks() {
		return Collections.unmodifiableList(books);
	}
}
