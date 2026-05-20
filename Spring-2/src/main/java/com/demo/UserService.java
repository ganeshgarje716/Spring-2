 package com.demo;

public class UserService {
	
	
	public UserService() {
		
		System.out.println("User Service Constructor Called");
	}
	
	
	LoginWithOtp loginOtp;
	
	LoginWithPassword loginPwd;
	
	
	UserService(LoginWithOtp loginOtp){
		
		this.loginOtp=loginOtp;
	}
	
	
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
