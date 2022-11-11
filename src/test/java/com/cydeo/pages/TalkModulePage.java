package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.cydeo.utilities.Driver.getDriver;

public class TalkModulePage extends BasePage {

    public void TalkModulePage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(css = "button[slot='trigger']")
    public WebElement plusButton;

    @FindBy(css = "input.conversation-name")
    public WebElement conversationNameField;

    @FindBy(xpath = "//button[@class='navigation__button navigation__button-right primary']")
    public WebElement addParticipantsButton;

    @FindBy(xpath = "//li[@class='participant-row']")
    public List<WebElement> listOfParticipants;

    @FindBy(xpath = "//button[@class='navigation__button navigation__button-right primary']")
    public WebElement createConversationButton;

    @FindBy(css = "a[aria-label='Conversation, Testers']")
    public WebElement createdConversation;

    public void addParticipants() {
        plusButton.click();
        conversationNameField.sendKeys("Testers");
        addParticipantsButton.click();
        for (WebElement each : listOfParticipants) {
            each.click();
        }
        createConversationButton.click();
    }

}


