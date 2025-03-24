//package com.test.basics;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public class GooglePage1 {
//    WebDriver driver;
//
//    
//    @FindBy(xpath = "//*[@name='q']")
//    private WebElement searchBox;
//
// 
//    public void searchFor(String text) {
//        searchBox.sendKeys(text);
//        searchBox.submit();
//    }
//}

package com.test.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GooglePage1{
    
    WebDriver driver;
    private WebElement searchBox;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        
        //googlePage = new GooglePage1(driver);
    }
    @Test
    public void searchFor(String text) {
       // googlePage.searchFor("Selenium WebDriver");
    	searchBox.sendKeys(text);
    	searchBox.submit();
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
