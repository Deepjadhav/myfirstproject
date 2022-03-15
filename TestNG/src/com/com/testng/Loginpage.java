package com.com.testng;

import org.testng.annotations.Test;

public class Loginpage {
	
	@Test(description="verify the username",priority=3)
	public void Tc1() {
		System.out.println("i am first test case");	
	}
	
	@Test(priority=1,description="verify password")
	public void Tc2() {
		System.out.println("i am second test case");
		
	}
	@Test(priority=2)
	public void Tc3() {
		System.out.println("i am third test case");
	
	}

}
