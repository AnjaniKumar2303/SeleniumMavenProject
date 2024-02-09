import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumWithoutPOM {

    @Test
    public void work() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/books");
        driver.findElement(By.id("login")).click();
        driver.findElement(By.id("userName")).sendKeys("AmanKumar");
        driver.findElement(By.id("password")).sendKeys("Aman@1234");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement loginElement = driver.findElement(By.id("login"));
        js.executeScript("arguments[0].scrollIntoView(true);", loginElement);
        loginElement.click();
    }
}
