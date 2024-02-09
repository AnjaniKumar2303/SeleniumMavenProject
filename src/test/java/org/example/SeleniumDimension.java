package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import javax.swing.text.Position;

public class SeleniumDimension {

    @Test
    public void testDimension() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.spicejet.com/");
        driver.manage().window().maximize();
        Dimension size = driver.findElement(By.cssSelector("a[data-testid='test-id-Hotels']")).getSize();
        System.out.println(size.height);
        System.out.println(size.width);

    }

    @Test
    public void testPosition() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.spicejet.com/");
        driver.manage().window().maximize();
        Point point = driver.findElement(By.cssSelector("a[data-testid='test-id-Hotels']")).getLocation();
        System.out.println(point.x);
        System.out.println(point.y);
    }
}
