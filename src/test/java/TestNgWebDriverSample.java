import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgWebDriverSample extends Base{


  @Test
  public void test1() {
    doSomething("http://seleniumhq.org/");
  }

    @Test
    public void test2() {
        doSomething("http://google.com");
    }

  private void doSomething(String url) {
    driver.get(url);
    driver.findElement(By.name("q")).sendKeys("selenium");
    driver.findElement(By.id("submit")).click();
//    new WebDriverWait(driver, 30).until(
//        ExpectedConditions.titleContains("Google Custom Search"));
  }

}
