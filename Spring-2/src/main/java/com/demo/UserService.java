 package com.demo;

public class UserService {
	
	
	LoginWithOtp loginOtp;
	
	
	public void doLogin(int otp) {
		
		loginOtp.processLogin(otp);
		System.out.println("Login Success");
	}

}
