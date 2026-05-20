package com.demo;

public class LoginWithPassword implements ILogin{
	
	
	public LoginWithPassword() {
		
		System.out.println("LoginPassword Constructor");
	}
	
	
	public void processLogin(int password) {
		
		System.out.println("Login Processing via Password = "+password);
	}

}
