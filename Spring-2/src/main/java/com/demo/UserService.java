 package com.demo;

public class UserService {
	
	
	
//	LoginWithOtp loginOtp;
//	
//	LoginWithPassword loginPwd;
	
	
	ILogin login;
	
	
	public void setWay(ILogin login) {
		
		this.login=login;
	}
	
	
//	UserService(LoginWithOtp loginOtp){
//		
//		this.login=loginOtp;
//	}
	
	
//	public void doLogin(String type) {
//		
//		if (type.equals("OTP")) {
//			
//			login.processLogin(1212);
//			
//			System.out.println("Login Success using OTP");
//		}
//		
//		if (type.equals("PWD")) {
//			
//			login.processLogin(202020);
//			
//			System.out.println("Login Success using Password");
//		}
	
	
    public void doLogin() {
		
		login.processLogin(232323);
		System.out.println("Login Success");
		
	}

}
