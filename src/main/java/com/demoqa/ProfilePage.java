package com.demoqa;

import com.demoqa.utils.DemoqatestUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfilePage {

    WebDriver driver;

    ProfilePage(WebDriver driver) {
        this.driver = driver;
    }

    public void logout() {
        WebElement logoutElement = driver.findElement(By.cssSelector("button#submit"));
        DemoqatestUtils.scrollToElement(driver, logoutElement);
        logoutElement.click();
    }
}
