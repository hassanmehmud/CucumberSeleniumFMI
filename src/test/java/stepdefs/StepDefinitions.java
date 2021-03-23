package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.picocontainer.DefaultPicoContainer;
import org.picocontainer.MutablePicoContainer;
import service.NavigateWebServ;

/**
 * This class defines the steps definition mapped to each of the tests in features file src/test/resources/features/fmi-scenario.feature
 */
public class StepDefinitions {

    private static NavigateWebServ navigateWebServ;

    public StepDefinitions(NavigateWebServ navigateWebServ) {
        this.navigateWebServ = navigateWebServ;
    }
    /*
    * Sets up pico container to share states
     */
    public void setUp() {
        MutablePicoContainer pico = new DefaultPicoContainer();
        pico.addComponent(navigateWebServ);
    }
    @org.jetbrains.annotations.NotNull
    @org.jetbrains.annotations.Contract(pure = true)
    /*
     * Returns URL of FMI
     */
    @Given("The user has a webpage URL")
    public static String theUserHasAWebpageURL() {
        return ("https://en.ilmatieteenlaitos.fi/");

    }
    /*
     * Opens FMI homepage
     */
    @When("The user opens the home page successfully")
    public void theUserOpensTheHomePageSuccessfully() {
        navigateWebServ.openWebPage();
    }
    /*
     * Selects local weather tag and local weather is displayed
     */
    @Then("The user is able to check local weather successfully")
    public void theUserIsAbleToCheckLocalWeatherSuccessfully()  {
        navigateWebServ.selectLocalWeatherLink();

    }
}