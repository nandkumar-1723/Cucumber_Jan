package Arise.StepDefination;

import Arise.Base.*;
import Arise.POM.*;
import io.cucumber.java.en.*;

/**
 * @author Nandkumar Babar
 */
public class steps {

    @Given("Launch the browser and navigates to login page")
    public void launch_the_browser_and_navigates_to_login_page() throws Exception {
        HomePage hm = new HomePage();
        hm.navigatesToLoginPage();

    }

    @When("Enters the valid username and password")
    public void enters_the_valid_username_and_password() {
        LoginPage lp = new LoginPage();
        lp.enterCredentials("student","Password123");

    }

    @Then("Verify the user status")
    public void verify_the_user_status() throws Exception {

       HomePage hm = new HomePage();
       hm.verifyTheLogin();

    }
}
