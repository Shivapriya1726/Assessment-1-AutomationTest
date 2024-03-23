package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "StepDefinition"
)
public class Run {
    // This class will not contain any code, it serves as an entry point for Cucumber tests
}
