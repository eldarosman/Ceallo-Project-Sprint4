package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OnlineStatusPage {

    public OnlineStatusPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='avatardiv avatardiv-shown']")
    public WebElement userIconButton;

    @FindBy(xpath = "//a[@class='user-status-menu-item__toggle']")
    public WebElement currentUserStatus;

    @FindBy(xpath = "//label[contains(@class,'user-status')]")
    public List<WebElement> allUserStatuses;

    @FindBy(xpath = "//button[@class='action-item action-item--single header-close icon-close undefined undefined has-tooltip']")
    public WebElement closeStatusWindow;

    @FindBy(xpath = "//label[normalize-space(text())='Online']")
    public WebElement statusButton_Online;

    @FindBy(xpath = "//label[normalize-space(text())='Do not disturb']")
    public WebElement statusButton_DoNotDisturb;

    @FindBy(xpath = "//label[normalize-space(text())='Away']")
    public WebElement statusButton_Away;

    @FindBy(xpath = "//label[normalize-space(text())='Invisible']")
    public WebElement statusButton_Invisible;





}
