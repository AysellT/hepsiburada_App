package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                  "json:target/cucumber.json",
                  "utilities.formatter.PrettyReports:target/cucunber-pretty-reports"},

        features = "src/test/resources",
        glue = "stepdefinitions",
        tags = "@run",
        dryRun = false
)
public class Runner {
}
