

/**
 * The MIT License (MIT)
 *
 * Copyright (c) 2016 TRIOLOGY GmbH
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package de.triology.blog.gauge_e2e_tests;

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
