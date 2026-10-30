package entities;

public class BookLoan {
	private String bookTitle;
	private int overdueDays;
	private double dailyFine;

	public BookLoan(String bookTitle, int overdueDays, double dailyFine) {
		this.bookTitle = bookTitle;
		this.overdueDays = overdueDays;
		this.dailyFine = dailyFine;
	}

	public double calculateFine() {
		return overdueDays * dailyFine;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

}
