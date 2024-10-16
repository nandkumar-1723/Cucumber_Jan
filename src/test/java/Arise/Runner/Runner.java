package Arise.Runner;

import Arise.Base.*;
import io.cucumber.testng.*;
import org.testng.annotations.*;

/**
 * @author Nandkumar Babar
 */

@CucumberOptions(
        features = "src/test/java/Arise/Feature",
        glue = "Arise/StepDefination",
        tags = "@scenario_outline",
        monochrome = true
)
public class Runner extends AbstractTestNGCucumberTests {

    @BeforeClass
    public void preConditions(){
        //It will launch the browser
        System.out.println("Launch the browser");
        BaseTest.launchBrowser();
    }

    // Here feature file execution will happens it depends on cucumberOptions parameters

    @AfterClass
    public void postCondtions() throws InterruptedException {
        //Close the browser
        Thread.sleep(5000);
        System.out.println("Quite the browser");
        BaseTest.driver.quit();
    }
}
