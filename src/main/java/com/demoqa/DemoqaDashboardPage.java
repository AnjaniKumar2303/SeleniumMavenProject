package com.demoqa;

import com.demoqa.utils.DemoqatestUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoqaDashboardPage {

    WebDriver driver;

    DemoqaDashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    By login = By.id("login");

    public void clickLogin() {
        WebElement loginElement = driver.findElement(login);
        loginElement.click();
    }

}
