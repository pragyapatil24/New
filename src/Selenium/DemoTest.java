package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest {
    static WebDriver driver;
    public static void main(String[] args) {

        System .setProperty("WebDriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver() ;
        driver.get("https://www.orangehrm.com/");

    }


}
