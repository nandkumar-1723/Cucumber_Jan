package Arise.StepDefination;


import io.cucumber.java.en.*;

/**
 * @author Nandkumar Babar
 */

//Provide any class name
// You will get the below step when you run the scenarios very first time from the runner class
public class step {

    @Given("Navigates to login page")
    public void navigates_to_login_page() {

        System.out.println("Navigates to login page");
    }

    @When("Enters the credentials")
    public void enters_the_credentials() {
        System.out.println("Enter the credentials");
    }

    @Then("verify the login status")
    public void verify_the_login_status() {
        System.out.println("Validation the login status");

    }
}
