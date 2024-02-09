package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class SeleniumAll {

    @Test
    public void scroll() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("scrollBy(0, 4500)");

    }

    @Test
    public void radioButtons() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/AnjKumar/OneDrive - OpenText/Documents/Selenium/RadioButtons.html");
        driver.manage().window().maximize();
        int a = driver.findElements(By.xpath("//input[@name='group1']")).size();
        System.out.println(a);
        for(int i=1;i<=a;i++)
        {
            driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        }
        driver.close();
    }

    @Test
    public void checkBox() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.spicejet.com/");
        driver.manage().window().maximize();

        driver.close();
    }

}
