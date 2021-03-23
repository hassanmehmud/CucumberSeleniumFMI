package domain.pages;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.*;
import stepdefs.StepDefinitions;
import utilities.BasePage;

/**
 * This class mainly does the web interaction and performs the requires test steps
 */
public class FmiHomePage extends BasePage<FmiHomePage> {

    @FindBy(xpath= "//span[contains(text(),'Local weather')]")
    WebElement weatherlink;
    @FindBy(xpath = "//h1[@class='localweather']")
    WebElement lweather;
    /*
     * This method gets the URL from stepdefinition class and opens the webpages, completing GIVEN and WHEN
     */
    public static FmiHomePage open() {
        String webURL = StepDefinitions.theUserHasAWebpageURL();
        new FmiHomePage().get(webURL);
        driver.manage().window().maximize();
        return PageFactory.initElements(driver, FmiHomePage.class);
    }
    /*
     * This method gets selects local weather tag using xpath and asserts if local weather is displayed and asserts for HELSINKI, completing THEN
     */
    public FmiHomePage selectLocalWeatherLink() {
        weatherlink.click();
        String weatherText = lweather.getText();
        try {
            Assert.assertEquals(weatherText,"Helsinki");
            System.out.println("Local Weather Displayed");
        } catch (AssertionError e) {

            System.out.println(("The Test has failed, local weather not displayed ") + e.getMessage());
        }
        driver.close();
        driver.quit();
        return PageFactory.initElements(driver, FmiHomePage.class);


    }
}
