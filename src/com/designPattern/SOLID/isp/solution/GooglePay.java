package com.designPattern.SOLID.isp.solution;

public class GooglePay implements UPIPayments, BankManager {

	@Override
	public void doTransfer() {
		System.out.println("Payment Transferred");
	}

	@Override
	public void getScratchCard() {
		System.out.println("Scratch Card Received");
	}

	@Override
	public void getCashbackAsCreditBalance() {
		System.out.println("Balance Added in Bank Account");
	}
}