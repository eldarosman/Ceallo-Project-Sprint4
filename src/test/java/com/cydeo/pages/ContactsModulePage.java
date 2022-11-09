package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ContactsModulePage {

    private ContactsModulePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    Faker faker = new Faker();

    @FindBy(xpath = "//button[@id='new-contact-button']")
    public WebElement createNewContact;

    @FindBy(xpath = "(//div[@class='app-navigation-entry__counter'])[1]")
    public WebElement contactCount;

    @FindBy (xpath = "(//div[@class=\'app-content-list-item-line-one\'])[1]")
    public WebElement firstContact;

    @FindBy(xpath = "//div[@class=\'app-content-list-item-line-one\']")
    List<WebElement> listOfContacts;

    @FindBy(xpath = "//button[@class='icon action-item__menutoggle icon-picture-force-white']")
    public WebElement userPictureIconOptions;

    @FindBy (xpath = "(//button[@class='action-button focusable'])[6]")
    public WebElement chooseFromFilesPicture;

    @FindBy (xpath = "(//button[@class='icon action-item__menutoggle action-item__menutoggle--default-icon'])[5]")
    public WebElement contactsOptions;

    @FindBy (xpath = "(//button[@class='action-button focusable'])[6]")
    public WebElement deleteContact;

    //creating WebElement to add personal info for each contact

    @FindBy( xpath = "//input[@id='contact-fullname']")
    public WebElement inputNameBox;

    //method to generate a name
    public void fakeName (){
        inputNameBox.sendKeys(faker.name().firstName());
    }

    @FindBy (xpath = "//input[@id='contact-org']")
    public WebElement companyInputBox;

    @FindBy (xpath = "//input[@id='contact-title']")
    public WebElement titleInputBox;

    @FindBy (xpath = "//input[@class='property__value property__value--with-ext']")
    public WebElement emailInputBox;

    @FindBy (xpath = "(//input[@class=\'property__value\'])[1]")
    public WebElement homePhoneNumber;

    @FindBy (xpath = "(//input[@class=\'property__value\'])[2]")
    public WebElement postOfficeBox;

    @FindBy (xpath = "(//input[@class=\'property__value\'])[3]")
    public WebElement addressInputBox;

    @FindBy (xpath = "(//input[@class=\'property__value\'])[5]")
    public WebElement postalCode;

    @FindBy (xpath = "(//input[@class=\'property__value\'])[6]")
    public WebElement city;

    @FindBy (xpath = "(//input[@class=\'property__value\'])[7]")
    public WebElement state;

    @FindBy (xpath = "(//input[@class=\'property__value\'])[8]")
    public WebElement country;
}
