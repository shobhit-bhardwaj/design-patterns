package com.designPattern.SOLID.dip.problem;

public class ShoppingMall {
	private CreditCard creditCard;

	public ShoppingMall(CreditCard creditCard) {
		this.creditCard = creditCard;
	}

	public void swipeCardForCheckout(int amount) {
		creditCard.doPayment(amount);
	}
}