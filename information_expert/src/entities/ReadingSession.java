package entities;

public class ReadingSession {

	private int pagesPerDay;
	private int readingDays;

	public ReadingSession(int pagesPerDay, int readingDays) {
		this.pagesPerDay = pagesPerDay;
		this.readingDays = readingDays;
	}

	public int calculatePagesRead() {
		return pagesPerDay * readingDays;
	}
}
