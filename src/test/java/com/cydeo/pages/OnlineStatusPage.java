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
    public WebElement userIcon;

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

    @FindBy(xpath = "//span[@class='predefined-status__message']")
    public List<WebElement> allDefaultOptionsStatusMessage;

    @FindBy(xpath = "//button[@class='status-buttons__primary primary']")
    public WebElement setStatusMessageButton;

    @FindBy(xpath = "//button[@class='status-buttons__select']")
    public WebElement clearStatusMessageButton;



    @FindBy(xpath = "//form[@class='custom-input__form']/input")
    public WebElement statusMessageInputBox;


    @FindBy(xpath = "//button[@class='custom-input__emoji-button']")
    public WebElement emojiButton;


    @FindBy(xpath = "//span[@class='emoji-mart-emoji']")
    public List<WebElement> allEmojis;



}
