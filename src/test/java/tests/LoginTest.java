package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    private static ChromeDriver driver;
    //WebDriver driver;
    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void logintest(){
       driver.get("http://www.amazon.com");

       driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");
        driver.findElement(By.xpath("//input[@type='submit'][1]")).click();
        Assert.assertEquals(driver.getTitle(),"Amazon.com: Bags");


    }
}
