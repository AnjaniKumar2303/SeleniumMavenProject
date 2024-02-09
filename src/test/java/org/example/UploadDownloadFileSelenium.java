package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadDownloadFileSelenium {

    @Test
    public void testUoloadFile() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.guru99.com/test/upload/");
        WebElement uploadElement  = driver.findElement(By.id("uploadfile_0"));
        uploadElement.sendKeys("C:\\Users\\AnjKumar\\OneDrive - OpenText\\Documents\\HTML\\list.html");
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("submitbutton")).click();
    }

    @Test
    public void testDownloadFile() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.guru99.com/test/upload/");
        WebElement downloadButton  = driver.findElement(By.id("messenger-download"));
        String sourceLocation = downloadButton.getAttribute("href");
    }
}
