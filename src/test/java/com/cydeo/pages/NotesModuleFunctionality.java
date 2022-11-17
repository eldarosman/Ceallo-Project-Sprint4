package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class NotesModuleFunctionality {

    public NotesModuleFunctionality() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//button[@id='notes_new_note']")
    public WebElement addNote;

    @FindBy(xpath = "//span[@class='action-buttons']//div//div//div//button")
    public WebElement dotsButton;

    @FindBy(xpath = "//span[.='Detalii']")
    public WebElement detailsButton;

    @FindBy(xpath = "//div[@class='app-sidebar-header__tertiary-actions']//a")
    public WebElement starButton;


    @FindBy(xpath = "//p[@class='app-sidebar-header__subtitle']")
    public WebElement wordsLetters;

    @FindBy(xpath = "//input[@id='category']")
    public WebElement categoryButton;

    @FindBy(xpath = "//li[@class='app-navigation-entry app-navigation-noclose separator-below app-navigation-entry--no-icon app-navigation-entry--collapsible']//button")
    public WebElement colapseButton;

    @FindBy(xpath = "//span[@title='Java']")
    public WebElement newCategory;

    @FindBy(xpath = "(//span[@class='app-navigation-entry__title'])[4]")
    public WebElement newNote;

    @FindBy(xpath = "(//button[@aria-label='Actions'])[4]")
    public WebElement optionButton;


    @FindBy(xpath = "//span[.='Şterge nota']")
    public WebElement deleteButton;

    @FindBy(xpath = "//span[@class='deletedLabel']")
    public WebElement deletedLabel;

    @FindBy(xpath = "//span[.='Adăugați la favorite']")
    public WebElement favoriteButton;


    @FindBy(xpath = "//div[@class='app-navigation-entry-icon nav-icon icon-starred']")
    public WebElement iconStar;

    @FindBy(xpath = "(//span[@class='app-navigation-entry__title'])[4]")
    public WebElement helloNote;


}
