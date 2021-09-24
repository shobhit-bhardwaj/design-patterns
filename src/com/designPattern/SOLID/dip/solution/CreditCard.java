package com.designPattern.SOLID.dip.solution;

public class CreditCard implements BankCard {

	@Override
	public void doPayment(int amount) {
		System.out.println("Payment Done by Credit Card");
	}
}