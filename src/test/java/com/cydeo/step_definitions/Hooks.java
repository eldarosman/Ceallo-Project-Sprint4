package com.cydeo.step_definitions;

import com.cydeo.pages.LogInPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    LogInPage LogInPage = new LogInPage();

    @Before
    public void setupLogin() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        LogInPage.usernameInputBox.sendKeys(ConfigurationReader.getProperty("username"));
        LogInPage.passwordInputBox.sendKeys(ConfigurationReader.getProperty("password"));
        LogInPage.signInButton.click();

    }

    @After
    public void teardownScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshots = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshots, "image/png", scenario.getName());
        }

        Driver.closeDriver();
    }

}












