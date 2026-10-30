package payments;

public class Pix implements PaymentMethod {

	@Override
	public void processPayment(double amount) {
		System.out.println("Pix payment:  R$" + amount);

	}
}
