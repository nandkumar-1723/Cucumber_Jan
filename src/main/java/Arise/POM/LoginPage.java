package Arise.POM;

import Arise.Base.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;
import org.testng.*;

import java.time.*;
import java.util.*;

/**
 * @author Nandkumar Babar
 */
public class LoginPage extends BaseTest {

    //Page factory  / object repo.

//    input --> inp
// button --> btn
// link --> lnk
// text --> txt
// dropdown --> dd


    @FindBy(xpath = "//input[@name='username']") private WebElement inpUsername;
    @FindBy(xpath = "//input[@name='password']") private WebElement inpPassword;
    @FindBy(xpath = "//button[@id='submit']") private WebElement btnSubmit;
    @FindBy(xpath = "//div[@id='error']") private WebElement txtLoginError;


    public LoginPage(){
        PageFactory.initElements(BaseTest.driver, this);
    }

    //Methods
     public void enterCredentials(String username , String password){

        WebDriverWait wait = new WebDriverWait(BaseTest.driver,Duration.ofMinutes(2));
        wait.until(ExpectedConditions.visibilityOf(inpUsername)).sendKeys(username);
         wait.until(ExpectedConditions.visibilityOf(inpPassword)).sendKeys(password);
         wait.until(ExpectedConditions.visibilityOf(btnSubmit)).click();

     }

     public void verifyTheWrongCredentials() throws Exception {

         WebDriverWait wait = new WebDriverWait(BaseTest.driver,Duration.ofMinutes(2));
         wait.until(ExpectedConditions.visibilityOf(txtLoginError));
//         Assert.assertEquals(txtLoginError.getText(),"Your  is invalid!");

         if (!(txtLoginError.getText().contains("is invalid!"))){
             throw new Exception("its not showing the error message");
         }

     }


}
