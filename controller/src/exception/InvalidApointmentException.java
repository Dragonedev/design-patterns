package exception;

public class InvalidApointmentException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InvalidApointmentException(String message) {
		super(message);

	}

}
