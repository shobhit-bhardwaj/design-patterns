package com.designPattern.SOLID.srp.problem;

public class BankService {
	public void debit(double amount) {
		//	DEBIT ACCOUNT
	}

	public void credit(double amount) {
		//	CREDIT ACCOUNT
	}

	public void printStatement() {
		//	PRINT ACCOUNT STATEMENT
	}

	public void loanInterestInfo(double amount, String loanType) {
		if(loanType.equals("Car")) {
			//	CAR LOAN
		} else if(loanType.equals("Home")) {
			//	HOME LOAN
		} else if(loanType.equals("Personal")) {
			//	PERSONAL LOAN
		}
	}

	public void sendOTP(String medium) {
		if(medium.equals("email")) {
			//	SEND OTP ON EMAIL
		} else if(medium.equals("mobile")) {
			//	SEND OTP ON MOBILE
		}
	}
}