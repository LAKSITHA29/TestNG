package com.test.basics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.AfterTest;

//@Ignore
public class Priority {
	
  @Ignore
  @Test(priority=2)
  public void A() {
	  System.out.println("A");
  }
  @Test
  public void C() {
	  System.out.println("C");
  }
  @Test(priority=0)
  public void E() {
	  System.out.println("E");
  } 
  @Test
  public void D() {
	  System.out.println("D");
  }
  @Test(priority=1)
  public void B() {
	  System.out.println("B");
  }
  
  
  
  
  
  
  
  
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

//  @BeforeTest
//  public void beforeTest() {
//  }
//
//  @AfterTest
//  public void afterTest() {
//  }

}
