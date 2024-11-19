package com.ait.qa49;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class homeWork002 {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");
    }

    @Test
    public void findElementsWithSimpleLocators() {
        // Примеры простых локаторов
        WebElement header = driver.findElement(By.tagName("header"));
        WebElement logo = driver.findElement(By.className("header-logo"));
        WebElement searchBox = driver.findElement(By.id("small-searchterms"));
        WebElement shoppingCart = driver.findElement(By.className("cart-label"));
        WebElement footer = driver.findElement(By.tagName("footer"));
        WebElement registerLink = driver.findElement(By.className("ico-register"));
        WebElement loginLink = driver.findElement(By.className("ico-login"));
        WebElement searchButton = driver.findElement(By.className("search-box-button"));
    }

    @Test
    public void findElementsWithCssSelectors() {
        // Примеры локаторов с помощью CSS
        WebElement header = driver.findElement(By.cssSelector("header"));
        WebElement logo = driver.findElement(By.cssSelector(".header-logo"));
        WebElement searchBox = driver.findElement(By.cssSelector("#small-searchterms"));
        WebElement shoppingCart = driver.findElement(By.cssSelector(".cart-label"));
        WebElement footer = driver.findElement(By.cssSelector("footer"));
        WebElement registerLink = driver.findElement(By.cssSelector(".ico-register"));
        WebElement loginLink = driver.findElement(By.cssSelector(".ico-login"));
        WebElement searchButton = driver.findElement(By.cssSelector(".search-box-button"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
