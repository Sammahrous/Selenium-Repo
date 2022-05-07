package Homework1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.sql.Driver;

public class TestMethod {

    @Test
    public void useSelenium() {
        System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
    }
}
