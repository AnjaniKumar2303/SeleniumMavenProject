package org.example.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import java.util.List;

public class ActionsClassSelenium {

    @Test
    public void testRightClick() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/buttons");
        Actions action = new Actions(driver);
        WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
        action.contextClick(rightClick).perform();
        System.out.println("Right click Context Menu displayed");
        driver.close();
    }

    @Test
    public void testDoubleClick() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/buttons");
        Actions action = new Actions(driver);
        WebElement doubleClick = driver.findElement(By.id("doubleClickBtn"));
        action.doubleClick(doubleClick).perform();
        System.out.println("Double click Context Menu displayed");
        driver.close();
    }

    @Test
    public void testMouseHover() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/menu/#");
        Actions action = new Actions(driver);
        WebElement menu = driver.findElement(By.id("nav"));
        Select a = new Select(menu);
        List<WebElement> w = a.getAllSelectedOptions();
        for(WebElement webElement : w) {
            if(webElement.getText().equalsIgnoreCase("Main Item 2")) {
                action.moveToElement(webElement).perform();
            }
        }
    }
}
