package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PopUpsAndAlerts {

    @Test
    public void testSimpleAlert() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/alerts");
        driver.findElement(By.id("alertButton")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    @Test
    public void testPromptAlert() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/alerts");
        WebElement buttonElement = driver.findElement(By.id("promtButton"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("arguments[0].scrollIntoView(true)", buttonElement);
        //buttonElement.click();
        js.executeScript("arguments[0].click()", buttonElement);
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Testing");
        alert.accept();
    }
}
