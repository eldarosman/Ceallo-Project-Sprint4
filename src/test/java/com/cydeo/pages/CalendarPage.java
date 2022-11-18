package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage {

    public CalendarPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='user']")
    public WebElement userNameInputbox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordInputbox;

    @FindBy(xpath = "//input[@id='submit-form']")
    public WebElement loginButton;





    @FindBy(xpath = "(//a[@aria-label='Calendar'])[1]")
    public WebElement calendarButton;

    @FindBy(xpath = "(//button[@aria-label='Actions'])[1]")
    public WebElement clickDateDropdownMenu;

    @FindBy(xpath = "//li[@class='action active']")
    public WebElement selectDayOfDropdownMenu;

    @FindBy(xpath = "//span[.='Week']")
    public WebElement selectWeekOfDropdownMenu;

    @FindBy(xpath = "//span[.='Month']")
    public WebElement selectMonthOfDropdownMenu;

    @FindBy(xpath = "//span[.='List']")
    public WebElement selectListOfDropdownMenu;

    @FindBy(xpath = "//*[@id=\"app-navigation-vue\"]/header/div[2]/div/div/div/button[@aria-label='Actions']")
    public WebElement selectionOfDropdownMenu;

    @FindBy(xpath = "//button[@class='button primary new-event']")
    public WebElement addNewEvent;

    @FindBy(xpath = "//input[@placeholder='Event title']")
    public WebElement eventTitleInputbox;

    @FindBy(xpath = "(//button[@class='primary'])[1]")
    public WebElement eventTitleSaveButton;

    @FindBy(xpath = "//div[@class='fc-daygrid-event-dot']")
    public WebElement eventIcon;

    @FindBy(xpath = "//div[.='Interview']")
    public WebElement eventText;

    @FindBy(xpath = "//div[@class='event-popover__buttons']/button[1]")
    public WebElement eventMoreButton;

    @FindBy(xpath = "(//button[@class='icon action-item__menutoggle action-item__menutoggle--default-icon'])[3]")
    public WebElement eventThreePointIcon;

    @FindBy(xpath = "//span[@class='action-button__icon icon-delete']")
    public WebElement eventDeleteButton;
























}

