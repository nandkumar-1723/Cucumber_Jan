package Arise.StepDefination;


import Arise.POM.*;
import io.cucumber.java.en.*;

/**
 * @author Nandkumar Babar
 */

public class step{

    LoginPage lp = new LoginPage();


    @Given("Navigates to login page")
    public void navigates_to_login_page() {

        System.out.println("Given:Navigates to the home page");

    }

    @When("Enters the credentials")
    public void enters_the_credentials() {
        System.out.println("When:Enter the credentials");
        lp.entersTheCredentials("student","Password123");
    }

    @Then("verify the login status")
    public void verify_the_login_status() {
        System.out.println("Then:Verify the login status");
        lp.verifyTheResult("Logged In Successfully");
    }
}
