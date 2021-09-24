package com.designPattern.SOLID.srp.solution;

public class NotificationService {
	public void sendOTP(String medium) {
		if(medium.equals("email")) {
			//	SEND OTP ON EMAIL
		} else if(medium.equals("mobile")) {
			//	SEND OTP ON MOBILE
		}
	}
}