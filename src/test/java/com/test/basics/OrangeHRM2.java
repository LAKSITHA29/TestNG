package com.test.basics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class OrangeHRM2 {
	WebDriver driver;
	
  @Test
  public void verifyLogin() {
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
