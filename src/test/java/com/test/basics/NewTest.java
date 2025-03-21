package com.test.basics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NewTest {
    public WebDriver driver;  // Class-level driver variable
    @Test
    public void validation() {
        //driver.findElement(By.xpath("//select[@class=\"L3Qlm PGEEnb s8lUn ToxeQe\"]")).click();
        // Click search button (if needed)
        driver.findElement(By.id("selenium143")).click();
    }
    @BeforeTest
    public void beforeTest() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options); 
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://omayo.blogspot.com/");
    }

    

    @AfterTest
    public void afterTest() {
//        if (driver != null) {
           driver.quit();  
//        }
    }
}
