package org.example.selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class IncognitaMode {

    @Test
    public void testIncognito() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("incognito");
        ChromeDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.google.com/");
    }
}
