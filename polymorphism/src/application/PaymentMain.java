package application;

import java.util.Scanner;

import payments.BankSlip;
import payments.CreditCard;
import payments.PaymentMethod;
import payments.Pix;

public class PaymentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		PaymentMethod p = null;
		System.out.println("\n========================");
		System.out.println("(Credit Card)-[c]: ");
		System.out.println("(Pix)-[p]: ");
		System.out.println("(Bank Slip)-[b]: ");
		System.out.println("========================\n");
		System.out.print("Choose a method: ");
		char method = sc.next().charAt(0);
		switch (method) {
		case 'c':
			p = new CreditCard();
			break;
		case 'p':
			p = new Pix();
			break;
		case 'b':
			p = new BankSlip();
			break;
		default:
			break;
		}
		p.processPayment(amount);
	}
}
