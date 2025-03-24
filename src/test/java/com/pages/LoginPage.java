package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.testng.annotations.Test;

public class LoginPage {
  WebDriver driver;
 
  By userName=By.xpath("//input[@name=\"username\"]");
  
  By password=By.xpath("//input[@type=\"password\"]");
  
  By titleText=By.xpath("//h5[@class=\"oxd-text oxd-text--h5 orangehrm-login-title\"]");
  
  By login=By.xpath("//button[@type=\"submit\"]");
  
  public LoginPage(WebDriver driver) {
	  this.driver=driver;
  }
  
  public void setUserName(String strUserName) {
	  driver.findElement(userName).sendKeys(strUserName);
	  
  }
  public void setPassword(String strPassword) {
      driver.findElement(password).sendKeys(strPassword);
  }


  public void clickLogin() {
      driver.findElement(login).click();
  }

  //get title of login page
  public String getLoginTitle() {
      String tit= driver.findElement(titleText).getText();
      System.out.println("Login page title:"+tit);
	  return tit;
  }
  
  public void loginToOrangeHRM(String strUserName, String strPassword) {
	  //fill username
      this.setUserName(strUserName);
      //fill password
      this.setPassword(strPassword);
      //click login button
      this.clickLogin();
  }


}

