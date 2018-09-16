package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Youtube {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","/Users/hasan/IdeaProjects/Framewrkjava/Driver/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.youtube.com/");
        driver.findElement(By.name("search_query")).sendKeys("bd cricket", Keys.ENTER);
    }
}
