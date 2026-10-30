package application;

import controller.LibraryController;
import entities.Book;

public class BookMain {

	public static void main(String[] args) {

		Book book = new Book("Hobbit");

		LibraryController controller = new LibraryController();

		controller.bookBorrow(book);

		System.out.println(book.isAvailable());

	}

}
