package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import java.time.Duration;

public class SeleniumWait {

    @Test
    public void testImplicitlyWait() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com/");
    }

    @Test
    public void pageLoadTimeoutWait() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.get("https://www.google.com/");
    }

    @Test
    public void pageLoadTimeokutWait() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.get("https://www.google.com/");
    }

    @Test
    public void testExplicitWait() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.navigate().to("https://www.guru99.com/upload-download-file-selenium-webdriver.html");
        By locator = By.id("upload-file-in-selenium");
        WebElement webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        System.out.println(webElement.getTagName());
    }

    @Test
    public void testFluentWait() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.guru99.com/upload-download-file-selenium-webdriver.html");
        By locator = By.id("upload-file-in-selenium");
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        WebElement webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        System.out.println(webElement.getTagName());
    }

    @Test
    public void testCustomWaitUsingFluentWait() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows/");
    }
}
