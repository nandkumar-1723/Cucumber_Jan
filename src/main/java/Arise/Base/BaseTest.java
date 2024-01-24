package Arise.Base;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

/**
 * @author Nandkumar Babar
 */
public class BaseTest {

    public static WebDriver driver;

    //Launch the chrome browser
    public static void launchBrowser(){
        ChromeOptions chrome = new ChromeOptions();
        chrome.setBrowserVersion("stable");
//        chrome.addArguments("headless");  // pass the argument to run the browser in headless mode
        driver = new ChromeDriver(chrome);
        driver.get("https://practicetestautomation.com/");
        driver.manage().window().maximize();
    }
}
