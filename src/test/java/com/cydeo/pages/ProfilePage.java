package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
    public ProfilePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="settings")
    public WebElement settings;

    @FindBy(xpath = "//*[@id=\"expanddiv\"]/ul/li[2]/a")
    public WebElement setbutton;

    @FindBy(xpath = "//*[@id=\"displaynameform\"]/input[1]")
    public WebElement fullName;

    @FindBy(id="email")
    public WebElement email;

    @FindBy(id="phone")
    public WebElement phone;

    @FindBy(xpath="//*[@id=\"phoneform\"]/h3/div")
    public WebElement phoneSetting;
    @FindBy(xpath = "//*[@id=\"phoneform\"]/h3/div/div/ul/li[1]/a")
    public WebElement phonePrivate;

    @FindBy(xpath = "//*[@id=\"localeexample-time\"]")
    public WebElement localTime;

}
