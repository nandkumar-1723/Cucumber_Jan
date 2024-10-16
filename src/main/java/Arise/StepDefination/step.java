package Arise.StepDefination;


import Arise.POM.*;
import io.cucumber.datatable.*;
import io.cucumber.java.en.*;

/**
 * @author Nandkumar Babar
 */

public class step{

    LoginPage lp = new LoginPage();


    @Given("Navigates to login page")
    public void navigates_to_login_page() {
        System.out.println("Navigated to home page");
    }

    @When("Enters the credentials")
    public void enters_the_credentials(DataTable table) {
        String username = table.asMaps().get(0).get("username");
        String password = table.asMaps().get(0).get("password");
        lp.entersTheCredentials(username,password);
    }

    @Then("verify the login status")
    public void verify_the_login_status(DataTable table) {
        String message = table.asMaps().get(0).get("message");
        lp.verifyTheResult(message);
    }
}
