package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/java/features",
        glue="src/main/java/stepdefs",
        plugin = {"pretty", "html:target/cucumber-pretty.txt"})


public class TestRunner {

}

