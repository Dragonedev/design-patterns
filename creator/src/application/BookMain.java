package application;

import entities.Book;
import entities.Bookshelf;

public class BookMain {

	public static void main(String[] args) {

		Bookshelf bookshelf = new Bookshelf();

		Book book1 = bookshelf.addBook("Hobbit");
		Book book2 = bookshelf.addBook("Dune");
		Book book3 = bookshelf.addBook("Fahrenheit 451");

		for (Book b : bookshelf.getBooks()) {
			System.out.println(b.getTitle());
		}
	}
}