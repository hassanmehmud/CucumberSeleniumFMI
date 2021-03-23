package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * This is the setup class which configures and initiates chromedriver
 */
public class BaseTest {

    private static WebDriver driver;
    private static WebDriver startDriver(){
        System.setProperty("webdriver.chrome.driver",
                "src/test/resources/features/chromedriver.exe"); //PATH TO CHROME DRIVER
        driver = new ChromeDriver();
        return driver;
    }

    public static WebDriver getDriver(){
        if (driver != null){
            return driver;
        }
        WebDriver driver = startDriver();
        return driver;
    }
}
