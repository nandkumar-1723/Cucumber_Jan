package Arise.POM;

import Arise.Base.*;
import Arise.Utils.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

import java.util.*;

/**
 * @author Nandkumar Babar
 */
public class HomePage extends BaseTest {

    //Page factory  / object repo.

//    input --> inp
// button --> btn
// link --> lnk
// text --> txt
// dropdown --> dd

    @FindBy(xpath = "//a[text()='Practice']") private List<WebElement> btnPractice;
    @FindBy(xpath = "//a[text()='Test Login Page']") private List<WebElement> btnLoginPage;


    public HomePage(){
        PageFactory.initElements(BaseTest.driver, this);
    }

    //Methods

    public void navigatesToLoginPage() throws Exception {
        generic.action_Click(btnPractice);
        generic.action_Click(btnLoginPage);

    }

}
