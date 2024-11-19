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

public class homeWork002 {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
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

    @Test
    public void findElementsWithXPath() {
        // XPath для поиска элементов на странице

        WebElement logo = driver.findElement(By.xpath("//div[@class='header-logo']//a"));


        List<WebElement> menuItems = driver.findElements(By.xpath("//ul[@class='top-menu']//li/a"));


        WebElement searchField = driver.findElement(By.xpath("//input[@id='small-searchterms']"));


        WebElement searchButton = driver.findElement(By.xpath("//input[@value='Search']"));


        WebElement featuredSection = driver.findElement(By.xpath("//div[@class='product-grid']"));


        WebElement firstProduct = driver.findElement(By.xpath("(//div[@class='item-box'])[1]"));


        WebElement addToCartButton = driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]"));


        WebElement footer = driver.findElement(By.xpath("//div[@class='footer']"));


        List<WebElement> footerLinks = driver.findElements(By.xpath("//div[@class='footer']//a"));


        WebElement newsletterTitle = driver.findElement(By.xpath("//div[@class='newsletter']//h2"));


        WebElement newsletterField = driver.findElement(By.xpath("//input[@id='newsletter-email']"));


        WebElement subscribeButton = driver.findElement(By.xpath("//input[@value='Subscribe']"));


        WebElement contactUs = driver.findElement(By.xpath("//a[text()='Contact us']"));


        WebElement myAccount = driver.findElement(By.xpath("//a[text()='My account']"));


        WebElement registerButton = driver.findElement(By.xpath("//a[text()='Register']"));

        // Вывод всех найденных элементов в консоль
        System.out.println("Найдено 15 элементов с использованием XPath:");
        System.out.println("1. Logo: " + logo.isDisplayed());
        System.out.println("2. Menu items: " + menuItems.size());
        System.out.println("3. Search field: " + searchField.isDisplayed());
        System.out.println("4. Search button: " + searchButton.isDisplayed());
        System.out.println("5. Featured section: " + featuredSection.isDisplayed());
        System.out.println("6. First product: " + firstProduct.isDisplayed());
        System.out.println("7. Add to cart button: " + addToCartButton.isDisplayed());
        System.out.println("8. Footer: " + footer.isDisplayed());
        System.out.println("9. Footer links: " + footerLinks.size());
        System.out.println("10. Newsletter title: " + newsletterTitle.isDisplayed());
        System.out.println("11. Newsletter field: " + newsletterField.isDisplayed());
        System.out.println("12. Subscribe button: " + subscribeButton.isDisplayed());
        System.out.println("13. Contact us link: " + contactUs.isDisplayed());
        System.out.println("14. My account link: " + myAccount.isDisplayed());
        System.out.println("15. Register button: " + registerButton.isDisplayed());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
