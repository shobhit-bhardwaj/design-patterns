package com.designPattern.SOLID.isp.problem;

public class PayTM implements UPIPayments {

	@Override
	public void doTransfer() {
		System.out.println("Payment Transferred");
	}

	@Override
	public void getScratchCard() {
		System.out.println("Scratch Card Received");
	}

	@Override
	public void getCashbackInWallet() {
		System.out.println("Balance Added in PayTM Wallet");
	}

	@Override
	public void getCashbackAsCreditBalance() {
		//	NOT SUPPORTED
	}
}