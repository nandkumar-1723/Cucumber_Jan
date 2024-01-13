package Arise.StepDefination;

import io.cucumber.java.en.*;

/**
 * @author Nandkumar Babar
 */
public class steps {

    @Given("Launch the browser and navigates to login page")
    public void launch_the_browser_and_navigates_to_login_page() {

        System.out.println("Given: Launch the browser");

    }

    @When("Enters the username and password")
    public void enters_the_username_and_password() {

        System.out.println("When: Enters valid the username and password");

    }
    @Then("User should be on home page")
    public void user_should_be_on_home_page() {
        System.out.println("Then: User should be on home page");


    }

    @When("Enter the invalid username and password")
    public void enter_the_invalid_username_and_password() {

        System.out.println("Enter the invalid username and password");

    }
    @Then("User should get the error message")
    public void user_should_get_the_error_message() {
        System.out.println("User should get the error message");


    }

    @When("Register the account by email")
    public void register_the_account_by_email() {

        System.out.println("Registered..!!");
    }
    @Then("Verify the account status")
    public void verify_the_account_status() {

        System.out.println("Account status verified");
    }
}
