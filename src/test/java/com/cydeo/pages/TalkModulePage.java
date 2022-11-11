package com.cydeo.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.cydeo.utilities.Driver.getDriver;

public class TalkModulePage {

    public void TalkModulePage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "(//a[@aria-label='Talk'])[1]")
    public WebElement talkMenuTab;

    @FindBy(css = "button[slot='trigger']")
    public WebElement plusButton;

    @FindBy(css = "input.conversation-name")
    public WebElement conversationNameField;

    @FindBy(xpath = "//button[@class='navigation__button navigation__button-right primary']")
    public WebElement addParticipantsButton;

    @FindBy (xpath = "//li[@class='participant-row']")
    public List<WebElement> listOfParticipants;

    @FindBy(xpath = "//button[@class='navigation__button navigation__button-right primary']")
    public WebElement createConversationButton;

    Faker faker = new Faker();
    String groupName = String.valueOf(faker.funnyName());
    public void addParticipants() {
       plusButton.click();
       conversationNameField.sendKeys(groupName);
       addParticipantsButton.click();
        for (WebElement each : listOfParticipants) {
            each.click();
        }
        createConversationButton.click();
    }

}


