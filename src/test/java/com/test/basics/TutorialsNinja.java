package com.test.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TutorialsNinja {
	public WebDriver driver;
  @Test
 
 
  public void verify() {
	  String expectedTitle="Your Store"; 
	  String actual=driver.getTitle();
	 // Assert.assertEquals(expectedTitle, actual);
	  
	  SoftAssert softAssertion=new SoftAssert();
	  softAssertion.assertEquals(expectedTitle, actual,"incorrect");
	  
	  driver.findElement(By.xpath("(//a[@class=\"dropdown-toggle\"])[1]")).click();
	  driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
	  
	  String exp="Register Account";
	  String act=driver.getTitle();
	 // Assert.assertEquals(exp, act);
	  
	  SoftAssert softAssertion1=new SoftAssert();
	  softAssertion1.assertEquals(exp, act);
	  
	  softAssertion.assertAll();//gives 1st one exception ,2nd one error
	  
	  
  }
  @BeforeTest
  public void setup(){  //beforeTest() {
	  ChromeOptions options = new ChromeOptions();
      driver = new ChromeDriver(options); 
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.get("https://tutorialsninja.com/demo/");
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}


