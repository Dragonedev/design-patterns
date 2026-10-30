package entities;

// Alto acoplamento desnecessário na classe Payment

public class Payment {
	private BankAccount ba;
	private CreditCard cc;
	private Customer c;
	private EmailService es;
	private Invoice i;
	private SMSService ss;

	public Payment(BankAccount ba, CreditCard cc, Customer c, EmailService es, Invoice i, SMSService ss) {
		this.ba = ba;
		this.cc = cc;
		this.c = c;
		this.es = es;
		this.i = i;
		this.ss = ss;
	}

	public BankAccount getBa() {
		return ba;
	}

	public CreditCard getCc() {
		return cc;
	}

	public Customer getC() {
		return c;
	}

	public EmailService getEs() {
		return es;
	}

	public Invoice getI() {
		return i;
	}

	public SMSService getSs() {
		return ss;
	}

}
