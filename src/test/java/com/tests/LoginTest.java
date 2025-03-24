package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.LoginPage;

public class LoginTest extends BaseTest {
	
	LoginPage objLogin;
	DashboardPage objdashboardPage;
	
  @Test
  public void testLogin() {
        objLogin = new LoginPage(driver); 
        
        String loginPageTitle=objLogin.getLoginTitle();
      
        Assert.assertTrue(loginPageTitle.contains("Login"));
        
    }
}