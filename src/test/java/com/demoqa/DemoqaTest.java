package com.demoqa;

import dev.failsafe.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DemoqaTest {

    @Test
    public void login() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        DemoqaDashboardPage demoqaDashboardPage = new DemoqaDashboardPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ProfilePage profilePage = new ProfilePage(driver);
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/books");
        demoqaDashboardPage.clickLogin();
        loginPage.enterUsername("AmanKumar");
        loginPage.enterPassword("Aman@1234");
        loginPage.clickLogin();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        profilePage.logout();
    }
}
