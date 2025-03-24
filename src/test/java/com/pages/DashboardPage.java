package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.testng.annotations.Test;

public class DashboardPage {
	WebDriver driver;
	
	By homePageUserName=By.xpath("//h6[@class=\"oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module\"]");
	
	public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHomePageText() {
        return driver.findElement(homePageUserName).getText();
    }
}