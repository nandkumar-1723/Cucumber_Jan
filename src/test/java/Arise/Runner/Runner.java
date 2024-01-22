package Arise.Runner;

import Arise.Base.*;
import io.cucumber.testng.*;
import org.testng.annotations.*;

/**
 * @author Nandkumar Babar
 */

@CucumberOptions(
        features = "src/test/java/Arise/Feature", //path from repository / content root
        glue = "Arise/StepDefination", //path from source root
        tags = "@login_outline", //Tag from feature file
        monochrome = true
)


// Class name could be anything
public class Runner extends AbstractTestNGCucumberTests {

    @BeforeClass
    public void preCondtion(){
        System.out.println("Pre-condtions (Launch Browser)");
        BaseTest.launchBrowser();
    }

    // It will run the feature files

    @AfterClass
    public void postCondtion() throws InterruptedException {
        System.out.println("Post-Condtions (Quite browser)");
        Thread.sleep(5000);
        BaseTest.driver.quit();
    }
}
