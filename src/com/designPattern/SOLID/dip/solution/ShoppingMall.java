package com.designPattern.SOLID.dip.solution;

public class ShoppingMall {
	private BankCard bankCard;

	public ShoppingMall(BankCard bankCard) {
		this.bankCard = bankCard;
	}

	public void swipeCardForCheckout(int amount) {
		bankCard.doPayment(amount);
	}
}