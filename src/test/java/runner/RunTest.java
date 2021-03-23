package runner;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
/**
 * This package provides example test suite with Cucumber for Finnish Meteorological Institute and includes following steps:
 * 1 - Launches chrome driver
 * 2 - Navigates to https://en.ilmatieteenlaitos.fi/
 * 3 - Selects Local Weather
 * 4 - Local weather webpage is displayed
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "html:build/reports/cucumber"
                ,"json:build/reports/cucumber-tests/test.json"},
        glue = {"stepdefs"},
        features = "src/test/resources/features/fmi-scenario.feature",
        publish = true)

public class RunTest {
}
