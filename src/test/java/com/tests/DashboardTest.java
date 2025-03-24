package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.pages.DashboardPage;
import com.pages.LoginPage;

public class DashboardTest extends BaseTest {
	
	LoginPage objLogin;
	DashboardPage objdashboardPage;
	
    @Test(priority=0)
    public void testDashboard() {  
        // Login to the application
        objLogin = new LoginPage(driver);
        objLogin.loginToOrangeHRM("Admin", "admin123");

        // Initialize dashboard page
        objdashboardPage = new DashboardPage(driver);

        // Verify dashboard page text
        Assert.assertTrue(objdashboardPage.getHomePageText().contains("Dashboard"), "Dashboard not displayed!");
    }
}
