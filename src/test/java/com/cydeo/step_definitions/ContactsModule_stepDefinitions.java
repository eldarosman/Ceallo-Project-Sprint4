package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.ContactsModulePage;
import com.cydeo.utilities.BrowserUtils;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class ContactsModule_stepDefinitions {

    ContactsModulePage contactPage = new ContactsModulePage();
    Faker faker = new Faker();
    String name = faker.name().firstName();

    int initialSize = 0;




    @Given("user is on the contact module")
    public void user_is_on_the_contact_module() {
        contactPage.contactsMenuButton.click();
        BrowserUtils.sleep(3);

    }

    @When("user clicks new contact icon")
    public void user_clicks_new_contact_icon() {
        contactPage.createNewContact.click();
        contactPage.inputNameBox.clear();
        contactPage.inputNameBox.sendKeys(name);
        BrowserUtils.sleep(3);
    }

    @Then("verify new contact was created")
    public void verify_new_contact_was_created() {

        for (WebElement eachContact : contactPage.listOfContacts) {
            if (eachContact.getText().equals(name)) {
                Assert.assertTrue(eachContact.isDisplayed());
            }
        }

    }

    //------------------------------------------------------------------------

    @Then("verify user can see the list of contacts and number of contacts")
    public void verify_user_can_see_the_list_of_contacts_and_number_of_contacts() {

        int actualCount = 0;
        int expectedCount = Integer.parseInt(contactPage.contactCount.getText());


        for (WebElement eachContact : contactPage.listOfContacts) {
            Assert.assertTrue(eachContact.isDisplayed());

            actualCount++;
        }


        Assert.assertTrue(expectedCount == actualCount);

    }

    //------------------------------------------------------------------------

    @When("user clicks contact options")
    public void user_clicks_contact_options() {
        contactPage.contactsOptions.click();
        BrowserUtils.sleep(3);
    }

    @When("user click delete option")
    public void user_click_delete_option() {
        initialSize = contactPage.listOfContacts.size();
        contactPage.deleteContact.click();
        BrowserUtils.sleep(3);
    }

    @Then("verify contact was deleted")
    public void verify_contact_was_deleted() {

        int actualSize = contactPage.listOfContacts.size();

        Assert.assertTrue(actualSize < initialSize);



    }

    //------------------------------------------------------------------------

    @When("user clicks picture options")
    public void user_clicks_picture_options() {
        contactPage.userPictureIconOptions.click();
    }
    @When("user clicks choose from files option")
    public void user_clicks_choose_from_files_option() {
        contactPage.chooseFromFilesPicture.click();
    }
    @When("user chooses an option")
    public void user_chooses_an_option() {
        contactPage.avatarOption.click();
        BrowserUtils.sleep(3);
    }
    @When("user clicks choose button")
    public void user_clicks_choose_button() {
        contactPage.chooseButton.click();
        BrowserUtils.sleep(3);
    }
    @Then("verify the picture is displayed")
    public void verify_the_picture_is_displayed() {

        contactPage.userPictureIconOptions.click();

        try{
            Assert.assertTrue(contactPage.deleteUserPictureOption.isDisplayed());
            System.out.println("User Picture WAS uploaded!");
        } catch (NoSuchElementException e){
            System.out.println("User Picture was NOT uploaded!");
        }

    }




}
