package org.example.seleniumcodeagain;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;

public class TakeScreenshotClass {

    @Test
    public void testScreenshot() {

        try {

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.geeksforgeeks.org/java-interview-questions/#q30");
            TakesScreenshot tk = (TakesScreenshot) driver;
            File f1 = tk.getScreenshotAs(OutputType.FILE);
            File f2 = new File("C:\\Users\\AnjKumar\\d.jpg");
            FileUtils.copyFile(f1, f2);

        } catch(Exception e) {
            System.out.println(e);
        }

    }

}
