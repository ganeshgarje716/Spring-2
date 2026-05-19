 package com.demo;

public class UserService {
	
	
	LoginWithOtp loginOtp;
	
	LoginWithPassword loginPwd;
	
	
	public void doLogin(String type) {
		
		if (type.equals("OTP")) {
			
			loginOtp.processLogin(1212);
			
			System.out.println("Login Success using OTP");
		}
		
		if (type.equals("PWD")) {
			
			loginPwd.processLogin(202020);
			
			System.out.println("Login Success using Password");
		}
		
		
		
	}

}
