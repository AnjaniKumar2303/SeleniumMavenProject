package org.example.seleniumcodeagain;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class WaitClass {

    @Test
    public void testWait() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("");

        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //pageloadtimeout
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        //setscripttimeout
        driver.manage().timeouts().setScriptTimeout(4, TimeUnit.SECONDS);

        //explicitwait
        By id =  By.id("abd");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(id));

        //FluentWait
        Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        wait1.until(ExpectedConditions.visibilityOfElementLocated(id));
    }
}
