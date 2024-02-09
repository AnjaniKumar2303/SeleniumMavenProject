package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DragAndDropSelenium {

    @Test
    public void dragAndDrop() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
        WebElement from = driver.findElement(By.id("sourceImage"));
        WebElement to = driver.findElement(By.id("targetDiv"));
        Actions act = new Actions(driver);
        act.dragAndDrop(from,to).build().perform();
    }
}
