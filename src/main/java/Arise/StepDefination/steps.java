package Arise.StepDefination;

import Arise.Base.*;
import io.cucumber.java.en.*;

/**
 * @author Nandkumar Babar
 */
public class steps {

    @Given("Launch the browser and navigates to login page")
    public void launch_the_browser_and_navigates_to_login_page() {
        System.out.println("Browser is launching");

        BaseTest.launchBrowser();

        System.out.println("Browser is launched..!!");

    }
    @When("Enters the valid username and password")
    public void enters_the_valid_username_and_password() {
        System.out.println("Enter the credentials --> Step-2");
    }

    @Then("Verify the user status")
    public void verify_the_user_status() {

        System.out.println("Verify the status --> Step-3");

    }
}
