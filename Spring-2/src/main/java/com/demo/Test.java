package com.demo;

public class Test {
	
	
	public static void main(String[] args) {
		
		
		UserService service=new UserService();
		
		service.loginOtp=new LoginWithOtp();
		service.loginPwd=new LoginWithPassword();
		
		service.doLogin("OTP");
		service.doLogin("PWD");
		
	}
	
}
 