package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.Iterator;
import java.util.Set;

public class MultipleWindows {

    @Test
    public void testMultipleWindows() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");

        driver.findElement(By.id("tabButton")).click();
        String mainWindow = driver.getWindowHandle();

        driver.switchTo().window(mainWindow);
        driver.findElement(By.id("windowButton")).click();

        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> itr = windowHandles.iterator();

        while(itr.hasNext()) {
            String childWindow = itr.next();
            if(!childWindow.equalsIgnoreCase(mainWindow)) {
                driver.switchTo().window(childWindow);
                driver.close();
            }
        }
        driver.switchTo().window(mainWindow);
        driver.close();
    }
}
