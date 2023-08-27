import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestDemo {

    @Test
    public void titleTest() throws MalformedURLException {

        MutableCapabilities caps = new MutableCapabilities();

        WebDriver driver = new RemoteWebDriver(new URL("https://hub.browserstack.com/wd/hub"), caps);
        driver.get("https://rahulshettyacademy.com");
   //     Assert.assertTrue(driver.getTitle().matches("Selenium, API Testing, Software Testing & More QA Tutorials | Rahul Shetty Academy"), "Title found:  " +driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Selenium, API Testing, Software Testing & More QA Tutorials | Rahul Shetty Academy");
    }

}
