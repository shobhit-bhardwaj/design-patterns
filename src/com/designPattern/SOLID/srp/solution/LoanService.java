package com.designPattern.SOLID.srp.solution;

public class LoanService {
	public void loanInterestInfo(double amount, String loanType) {
		if(loanType.equals("Car")) {
			//	CAR LOAN
		} else if(loanType.equals("Home")) {
			//	HOME LOAN
		} else if(loanType.equals("Personal")) {
			//	PERSONAL LOAN
		}
	}
}