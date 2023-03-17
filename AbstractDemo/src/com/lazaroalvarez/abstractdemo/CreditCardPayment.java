package com.lazaroalvarez.abstractdemo;

public class CreditCardPayment extends Payment {

	private String cardNum, ownerName, expDate;

	public CreditCardPayment(double amount, String cardNum, String ownerName, String expDate) {
		super(amount);
		this.cardNum = cardNum;
		this.ownerName = ownerName;
		this.expDate = expDate;
	}
	
	@Override
	public void paymentDetails() {
		super.paymentDetails();
		System.out.println("Card number: "+cardNum+" Owner: "+ownerName+ " Exp Date: "+expDate);
	}
}
