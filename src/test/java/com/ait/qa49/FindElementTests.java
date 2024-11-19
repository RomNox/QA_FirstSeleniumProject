package com.ait.qa49;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FindElementTests {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ilcarro.web.app");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void findElementByTagName() {
        WebElement element = driver.findElement(By.tagName("h1"));
        System.out.println(element.getText());

        WebElement element1= driver.findElement(By.tagName("h1"));
        System.out.println(element1.getText());

        List<WebElement> elements = driver.findElements(By.tagName("a"));
        System.out.println(elements.size());
    }

    @Test
    public void findElementBySimpleLocator() {
        WebElement elementCity = driver.findElement(By.id("city"));
        System.out.println(elementCity.getText());
        driver.findElement(By.linkText("Let the car work"));
    }

    @Test
    public void findElementByCSSSelector() {
        WebElement elementCity = driver.findElement(By.cssSelector("#city"));
        System.out.println(elementCity.getText());
    }

    @Test
    public void findElementByXpath() {
        driver.findElement(By.xpath("//input[@id='city']"));
        driver.findElement(By.xpath("//div[@class='header']"));
        driver.findElement(By.xpath("//h2[contains(.,'Yalla')]"));
        driver.findElement(By.xpath("//h2[text()='Type your data and hit Yalla!']"));
        driver.findElement(By.xpath("//label[starts-with(@for,'ci')]"));
        driver.findElement(By.xpath("//a[@class='navigation-link']/.."));
        driver.findElement(By.xpath("//h1/parent::*"));
        driver.findElement(By.xpath("//h1/ancestor::*"));
        driver.findElement(By.xpath("//h1/following-sibling::form"));
    }

}
