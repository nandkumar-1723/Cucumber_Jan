package Arise.StepDefination;

import Arise.Base.*;
import Arise.POM.*;
import io.cucumber.datatable.*;
import io.cucumber.java.en.*;

/**
 * @author Nandkumar Babar
 */
public class steps {

    @Given("Navigates to login page")
    public void navigates_to_login_page() throws Exception {
        HomePage hm = new HomePage();
        hm.navigatesToLoginPage();

    }

    @When("Enters the credentials")
    public void enters_the_valid_username_and_password(DataTable dataTable) {
        LoginPage lp = new LoginPage();
        String username = dataTable.asMaps().get(0).get("username");
        String password = dataTable.asMaps().get(0).get("password");
        lp.enterCredentials(username,password);
    }

    @Then("Verify the user status")
    public void verify_the_user_status() throws Exception {

       HomePage hm = new HomePage();
       hm.verifyTheLogin();
    }

    @Then("Verify the user status for wrong credentials")
    public void verify_the_user_status_for_wrong_credentials() throws Exception {
     LoginPage lm = new LoginPage();
     lm.verifyTheWrongCredentials();
    }
}
