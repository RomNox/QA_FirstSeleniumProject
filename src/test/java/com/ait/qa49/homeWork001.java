package com.ait.qa49;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class homeWork001 {

    WebDriver driver;
    @BeforeMethod
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        driver.get("https://ilcarro.web.app");
        driver.manage().window().maximize();

        @Test
        public void OpenTestCar () {
            System.out.println("TestCar");
        }

@AfterMethod
        public void tearDown () {
driver.quit();
}
