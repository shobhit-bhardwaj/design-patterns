package com.designPattern.SOLID.isp.solution;

public class PayTM implements UPIPayments, WalletManager {

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
}