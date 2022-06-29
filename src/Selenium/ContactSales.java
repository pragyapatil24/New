package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContactSales {
    static WebDriver driver ;
    static Actions  actions;
    public static void main(String[] args) {
        Utility utility = new Utility();
        ContactSales c = new ContactSales();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.orangehrm.com/");
        WebElement linkContactSales = driver.findElement(By.xpath("Contact Sales"));
        linkContactSales.click();

       // c.ClickButton(LinkContactSales);

    }


}

