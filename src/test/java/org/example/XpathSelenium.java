package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XpathSelenium {

    @Test
    public void testImplicitWait() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/text-box");
        //contains
        WebElement webElement = driver.findElement(By.xpath("//input[contains(@id, 'userName')]"));
        System.out.println(webElement.getTagName());

        //startsWith
        webElement = driver.findElement(By.xpath("//input[starts-with(@id, 'userName')]"));

        //text()
        webElement = driver.findElement(By.xpath("//label[text()='Email']"));

        //and
        webElement = driver.findElement(By.xpath("//label[@name='' and @id='']"));

        //or
        webElement = driver.findElement(By.xpath("//label[@name='' or @id='']"));


    }
}
