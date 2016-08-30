import com.thoughtworks.gauge.Gauge;
import com.thoughtworks.gauge.Step;
import driver.Driver;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class StepImplementation {

    @Step("Navigate to <url>")
    public void navigateTo(String url) {
        Driver.webDriver.get(url);
        assertTrue(Driver.webDriver.getTitle().contains("Gauge"));
    }

    @Step("Go to Gauge Get Started Page")
    public void gotoGetStartedPage() throws InterruptedException {
        WebElement getStartedButton = Driver.webDriver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/section[1]/div[2]/a[1]"));
        getStartedButton.click();
        Gauge.writeMessage("Page title is " + Driver.webDriver.getTitle());
    }
    
    @Step("Go to Gauge Documentation")
    public void gotoDocumentationPage() throws InterruptedException {
        Driver.webDriver.get("http://getgauge.io/documentation/user/current/");
        Gauge.writeMessage("Page title is " + Driver.webDriver.getTitle());
        
    }
    
    @Step("Go to Step Alias Page")
    public void gotoStepAliasPage() throws InterruptedException {
        Driver.webDriver.get("http://getgauge.io/documentation/user/current/advanced_readings/step_alias.html");
        Gauge.writeMessage("Page title is " + Driver.webDriver.getTitle());
    }
    
    @Step("Is Page title <title>?")
    public void checkPageTitle(String title) {
        String actualTitle = Driver.webDriver.getTitle();
        assertThat(actualTitle,is(title));
        Gauge.writeMessage("Page title is " + actualTitle);
        Gauge.writeMessage("Page title should be " + title);
    }
}
