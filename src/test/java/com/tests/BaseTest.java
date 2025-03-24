package com.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.pages.DashboardPage;
import com.pages.LoginPage;

public class BaseTest {
	WebDriver driver;
	LoginPage objLogin;
	DashboardPage objDashboardPage;

  @BeforeClass
	  public void setup() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 
    }
  
  @AfterClass  
  public void tearDown() {
          //driver.quit();
  }
}
