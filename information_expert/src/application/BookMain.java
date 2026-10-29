package application;

import entities.BookLoan;

public class BookMain {

	public static void main(String[] args) {

		BookLoan loan = new BookLoan("Hobbit", 10, 2.5);

		System.out.println(loan.calculateFine());

	}

}
