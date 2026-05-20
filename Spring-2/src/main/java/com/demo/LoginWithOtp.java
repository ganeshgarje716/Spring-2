package com.demo;

public class LoginWithOtp implements ILogin{
	
	
	public LoginWithOtp() {
		
		System.out.println("LoginOtp Constructor");
	}
	
	
	public void processLogin(int otp) {
		
		System.out.println("Login Processing via OTP = "+otp);
	}

}
