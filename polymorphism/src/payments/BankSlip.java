package payments;

public class BankSlip implements PaymentMethod {

	@Override
	public void processPayment(double amount) {
		System.out.println("Bank Slip payment:  R$" + amount);

	}
}
