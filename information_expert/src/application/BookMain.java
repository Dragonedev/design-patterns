package application;

import entities.BookLoan;
import entities.ReadingSession;

public class BookMain {

	public static void main(String[] args) {

		BookLoan loan = new BookLoan("Hobbit", 10, 2.5);
		ReadingSession session1 = new ReadingSession(3, 3);
		System.out.println(loan.calculateFine());
		System.out.println(session1.calculatePagesRead());

	}

}
