package entities;

public class BankAccount {

	private String accountNumber;
	private Customer customer;
	private Invoice invoice;

	public BankAccount(String accountNumber, Customer customer, Invoice invoice) {
		this.accountNumber = accountNumber;
		this.customer = customer;
		this.invoice = invoice;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

}
