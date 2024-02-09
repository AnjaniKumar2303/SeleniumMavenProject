package org.example.seleniumcodeagain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IFrameClass {

    @Test
    public void testIFrame() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/frames");
        WebElement iframe = driver.findElement(By.id("frame1"));
        driver.switchTo().frame(iframe);
        System.out.println(driver.getTitle());
        driver.close();
    }
}
