package com.cydeo.step_definitions;

import com.cydeo.pages.LogInPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.Before;
import org.apache.commons.logging.Log;

public class Hooks {

    LogInPage LogInPage = new LogInPage();

    @Before
    public void setupLogin(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        LogInPage.usernameInputBox.sendKeys(ConfigurationReader.getProperty("username"));
        LogInPage.passwordInputBox.sendKeys(ConfigurationReader.getProperty("password"));
        LogInPage.signInButton.click();

    }





}
