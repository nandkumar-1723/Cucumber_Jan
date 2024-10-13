package Arise.POM;

import Arise.Base.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;
import org.testng.*;

import java.time.*;

/**
 * @author Nandkumar Babar
 */public class LoginPage {


     //input --> inp
    // button --> btn
    // text --> txt
    // dropdown --> dd


     @FindBy(xpath = "//input[@id='username']") private WebElement inpUsername;
    @FindBy(xpath = "//input[@id='password']") private WebElement inpPassword;
    @FindBy(xpath = "//button[@id='submit']") private WebElement btnSubmit;
    @FindBy(xpath = "//h1[text()='Logged In Successfully']") private WebElement txtMessage;

    WebDriverWait wait = new WebDriverWait(BaseTest.driver, Duration.ofMinutes(2));

    public LoginPage(){
        PageFactory.initElements(BaseTest.driver,this);
    }

    public void entersTheCredentials(String username, String password){
        wait.until(ExpectedConditions.visibilityOf(inpUsername)).sendKeys(username);
        wait.until(ExpectedConditions.visibilityOf(inpPassword)).sendKeys(password);
        wait.until(ExpectedConditions.visibilityOf(btnSubmit)).click();
    }

    public void verifyTheResult(String textMessage){
        String message = wait.until(ExpectedConditions.visibilityOf(txtMessage)).getText();
        Assert.assertEquals(message,textMessage);
    }
}
