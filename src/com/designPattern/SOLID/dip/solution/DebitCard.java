package com.designPattern.SOLID.dip.solution;

public class DebitCard implements BankCard {

	@Override
	public void doPayment(int amount) {
		System.out.println("Payment Done by Debit Card");
	}
}