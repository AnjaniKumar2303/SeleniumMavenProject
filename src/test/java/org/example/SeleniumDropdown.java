package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SeleniumDropdown {

    @Test
    public void test() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
        Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));
        dropdown.selectByVisibleText("Database Testing");
        driver.close();
    }
}
