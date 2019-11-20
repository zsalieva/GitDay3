package cybertek.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/recources/features",   //path to features files
        glue = "cybertek/step_definitions",     //path to step definitions
        dryRun = false,
        tags = "@wip"     // which scenario specifically want to be run
)


public class CukesRunner {

}
