package Arise.Base;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.*;

import java.time.*;

/**
 * @author Nandkumar Babar
 */
public class BaseTest {

    public static WebDriver driver;


    //Launch the chrome browser
    public static void launchBrowser(){
        ChromeOptions chrome = new ChromeOptions();
        chrome.setBrowserVersion("stable");
        driver = new ChromeDriver(chrome);
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();
    }

}
