package org.example;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;

import java.io.File;

public class ScreenShotClass {

    @Test
    public void takeScreenshot() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.guru99.com/take-screenshot-selenium-webdriver.html");
        TakesScreenshot tk = (TakesScreenshot) driver;
        File f = tk.getScreenshotAs(OutputType.FILE);
        File f1 = new File("C:\\Users\\AnjKumar\\a.jpg");
        FileUtils.copyFile(f,f1);
    }
}
