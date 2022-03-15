package com.com.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class homepage {
	@BeforeMethod
	public void precondition() {
		System.out.println("homepage before method ");
 		
 }
	@Test
	public void Tc1() {
		System.out.println("i am home page test case");
	
		
	}
	@AfterMethod
	public void Aftercondition() {
		System.out.println("home page after method");
		
		
	}

}
