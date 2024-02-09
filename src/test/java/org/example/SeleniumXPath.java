package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumXPath {

    @Test
    public void testXpath() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com/");
        WebElement webElement = driver.findElement(By.xpath("//*[@id='APjFqb']"));
        System.out.println(webElement.getTagName());
        ///webElement = driver.findElement(By.xpath("//*[text()='Google offered in']"));
        //System.out.println(webElement.getTagName());
        webElement = driver.findElement(By.xpath("//*[contains(@aria-label, 'Google Search']"));
        System.out.println(webElement.getTagName());

        webElement = driver.findElement(By.xpath("//*[starts-with(@aria-label, 'Google Search']"));

        webElement = driver.findElement(By.xpath("//*[starts-with(@aria-label, 'Google Search']"));

        webElement = driver.findElement(By.xpath("//input[@type='text'][last()]"));
    }
}
