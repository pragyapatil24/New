package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FirstTest {
    public static void main (String[]args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize() ;
        driver.get ("http://www.seleniumframework.com/");
        WebElement element = driver.findElement(By.name("email") );
        element.click();
        Thread.sleep(3000);
        element.sendKeys("abc@gmail.com") ;
        List<WebElement> divTags= driver.findElements(By.tagName("input") );
        driver.quit() ;

    }
}
