package com.designPattern.SOLID.ocp.problem;

public class NotificationService {
	public void sendOTP(String medium, String message) {
		if(medium.equals("email")) {
			//	SEND OTP ON EMAIL
		} else if(medium.equals("mobile")) {
			//	SEND OTP ON MOBILE
		}
	}
}