package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
/**
 * This class implements chrome driver related methods , get, wait etc.
 */
public class BasePage <T extends  BasePage<T>> {

    protected  static WebDriver driver;

    protected FluentWait<WebDriver> wait;

    public BasePage(){
        driver = BaseTest.getDriver();
    }

    public T get(String url){
        driver.get(url);
        return(T) this;
    }
}
