package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	
	public static void main(String[] args) {
		
		
//		UserService service=new UserService();
//		
//		service.loginOtp=new LoginWithOtp();
//		service.loginPwd=new LoginWithPassword();
//		
//		service.doLogin("OTP");
//		service.doLogin("PWD");
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("NewFile.xml");
		
		UserService service = context.getBean(UserService.class);
		
		service.doLogin();
		
	}
	
} 
 