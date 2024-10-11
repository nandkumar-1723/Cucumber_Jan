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
        tags = "@nandkumar",
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
    public void postCondtions(){
        //Close the browser
        System.out.println("Quite the browser");
        BaseTest.driver.quit();
    }
}
