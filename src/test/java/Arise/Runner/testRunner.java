package Arise.Runner;


import io.cucumber.testng.*;

/**
 * @author Nandkumar Babar
 */

@CucumberOptions(
      features = "src/test/java/Arise/Feature",
      glue = "Arise/StepDefination",
      monochrome = true,
        tags = "@Login_123"
)

public class testRunner extends AbstractTestNGCucumberTests   {

    // NO NO

}
