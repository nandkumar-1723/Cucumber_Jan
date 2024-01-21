package Arise.StepDefination;


import Arise.POM.*;
import io.cucumber.datatable.*;
import io.cucumber.java.en.*;

/**
 * @author Nandkumar Babar
 */

//Provide any class name
// You will get the below step when you run the scenarios very first time from the runner class
public class step {

    @Given("Navigates to login page")
    public void navigates_to_login_page() {
        LoginPage lp = new LoginPage();
        lp.navigatesToLoginPage();
    }

    @When("Enters the credentials")
    public void enters_the_credentials(DataTable table) {
        String username = table.asMaps().get(0).get("username");  // get(0) --> row index & username --> Header name
        String password = table.asMaps().get(0).get("password");
        LoginPage lp = new LoginPage();
        lp.enterTheCredentials(username,password);
    }

    @Then("verify the login status")
    public void verify_the_login_status(DataTable table) {
        String text = table.asMaps().get(0).get("text");
        System.out.println(text);
        LoginPage lp = new LoginPage();
        lp.verifyLoginStatus(text);

    }
}
