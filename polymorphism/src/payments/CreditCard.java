package payments;

public class CreditCard implements PaymentMethod {

	@Override
	public void processPayment(double amount) {
		System.out.println("Credit card payment:  R$" + amount);

	}
}
