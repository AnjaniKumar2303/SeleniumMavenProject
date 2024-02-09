package com.demoqa;

import com.demoqa.utils.DemoqatestUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;

    LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By usernameLocator = By.id("userName");
    By passwordLocator = By.id("password");

    public void enterUsername(String username) {
        driver.findElement(usernameLocator).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordLocator).sendKeys(password);
    }

    public void clickLogin() {
        WebElement loginElement = driver.findElement(By.id("login"));
        DemoqatestUtils.scrollToElement(driver, loginElement);
        loginElement.click();
    }
}
