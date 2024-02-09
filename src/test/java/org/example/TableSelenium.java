package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;

public class TableSelenium {

    @Test
    public void testStaticTable() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.guru99.com/test/web-table-element.php");
        WebElement webElement  = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/thead/tr/th[1]"));
        System.out.println(webElement.getTagName());
    }

    @Test
    public void testDynamicTable() throws ParseException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.guru99.com/test/web-table-element.php");

        // Number of columns
        List<WebElement> cols  = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/thead/tr/th"));
        System.out.println(cols.size());

        //Number of rows
        List<WebElement> rows  = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"));
        System.out.println(rows.size());

        String max;
        double m=0;
        double r=0;

        //Get all values in a column
        for (int i=1; i<=rows.size(); i++) {
            max = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[" + (i) + "]/td[4]")).getText();
           // NumberFormat f =NumberFormat.getNumberInstance();
           // Number num = f.parse(max);
           // System.out.println(num);
           // max = num.toString();
            //System.out.println(max);
            m = Double.parseDouble(max);
            System.out.println(m);
            if(m>r)
            {
                r=m;
            }
        }
        System.out.println("Maximum current price is : "+ r);
        }

    @Test
    public void printAllValuesInATable() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.guru99.com/test/web-table-element.php");

        // Number of columns
        List<WebElement> cols  = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/thead/tr/th"));
        System.out.println(cols.size());

        //Number of rows
        List<WebElement> rows  = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"));
        System.out.println(rows.size());

        for (int i=0; i<rows.size(); i++) {
            List<WebElement> columnsInTheRow = rows.get(i).findElements(By.tagName("td"));
            System.out.println("Number of cells in row " + i + " is " + columnsInTheRow.size());

            for(int j=0; j<columnsInTheRow.size(); j++ ) {
                System.out.println("The value in row " + i + " and column " + j + " is : ");
                System.out.println(columnsInTheRow.get(j).getText());

            }

        }
    }
}
