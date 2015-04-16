import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

/**
 * Created by sergii.stepanov on 16/04/2015.
 */
public class Base {

    WebDriver driver;

    @BeforeMethod
    public void startBrowser() {
        driver = WebDriverFactory.getDriver(DesiredCapabilities.firefox());
    }
    //

    @AfterSuite
    public void stopBrowser() {
        WebDriverFactory.dismissDriver();
    }
}
