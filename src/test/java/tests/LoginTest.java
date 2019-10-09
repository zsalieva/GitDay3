package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
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
    public void logintest() {
        driver.get("http://www.amazon.com");

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");
        driver.findElement(By.xpath("//input[@type='submit'][1]")).click();
        Assert.assertEquals(driver.getTitle(), "Amazon.com: Bags");
    }
    
     @Test   // Another user added this file 
    public void Search3() {
        driver.get("http://www.amazon.com");

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptops");
        driver.findElement(By.xpath("//input[@type='submit'][1]")).click();
        Assert.assertEquals(driver.getTitle(), "Amazon.com: Laptops");
    }
    @Test
            public void selectItem() {
        driver.findElementByXPath("//img[@class='mediaCentralImage imageContainer__image'][1]").click();
    }
     @After
             public void tearDown(){
              driver.close();
        }
        }



