package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class SeleniumIframe {

    @Test
    public void numberOfFrames() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/frames");
        WebElement iframeElement = driver.findElement(By.id("framesWrapper"));
        List<WebElement> webElementList = iframeElement.findElements(By.tagName("iframe"));
        System.out.println(webElementList.size());
    }

    @Test
    public void testFrame() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String mainWindow = driver.getWindowHandle();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://demoqa.com/frames");
        driver.switchTo().frame(driver.findElement(By.id("frame1")));
        WebElement frameElement = driver.findElement(By.id("sampleHeading"));
        System.out.println(frameElement.getText());
        driver.switchTo().window(mainWindow);
        driver.close();
    }
}
