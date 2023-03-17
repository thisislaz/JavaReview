package com.lazaroalvarez.abstractdemo;

public class PaymentTest {

	public static void main(String[] args) {
//		Payment laptop = new Payment(2000); 
		
		CashPayment tacos = new CashPayment(1);
		tacos.paymentDetails();
		
		CreditCardPayment laptop = new CreditCardPayment(2000,"4242424242424242","Lazaro Alvarez", "08/25");
		laptop.paymentDetails();
	}

}
