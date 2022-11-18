package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "a[id='nextcloud']")
    public WebElement mainMenuButton;

    @FindBy(xpath = "(//*[@tabindex='-1'])[1]")
    public WebElement filesMenuButton;

    @FindBy(xpath = "(//*[@tabindex='-1'])[2]")
    public WebElement photosMenuButton;

    @FindBy(xpath = "(//*[@tabindex='-1'])[3]")
    public WebElement activityMenuButton;

    @FindBy(xpath = "(//*[@tabindex='-1'])[4]")
    public WebElement talkMenuButton;

    @FindBy(xpath = "(//*[@tabindex='-1'])[5]")
    public WebElement mailMenuButton;

    @FindBy(xpath = "(//*[@tabindex='-1'])[6]")
    public WebElement contactsMenuButton;

    @FindBy(xpath = "(//*[@tabindex='-1'])[7]")
    public WebElement calendarMenuButton;

    @FindBy(xpath = "(//*[@tabindex='-1'])[8]")
    public WebElement notesMenuButton;

    @FindBy(xpath = "(//*[@tabindex='-1'])[9]")
    public WebElement deckMenuButton;

    @FindBy(xpath = "(//*[@tabindex='-1'])[10]")
    public WebElement tasksMenuButton;

    @FindBy(xpath = "//span[@class='material-design-icon magnify-icon unified-search__trigger']")
    public WebElement magnifyIconSearchButton;

    @FindBy(xpath = "//div[@class='notifications']")
    public WebElement notificationsButton;

    @FindBy(xpath = "div[id='contactsmenu']")
    public WebElement contactsButton;

    @FindBy(xpath = "//div[@class='avatardiv avatardiv-shown']")
    public WebElement usersMenuButton;

}
