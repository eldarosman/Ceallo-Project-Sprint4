package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.ContactsModulePage;
import com.cydeo.pages.SearchModuleWebLocatorsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class SearchModule_stepDefinitions {

    BasePage basePage = new BasePage(){};

    SearchModuleWebLocatorsPage searchModuleWebLocatorsPage = new SearchModuleWebLocatorsPage();

    ContactsModulePage contactPage = new ContactsModulePage();

    String fileOrFolderName = "PicturePhoto1";
    String contactsName = "sibel";
    String imageName = "resim";

    //------------------------------------------------------TC1
    @When("user click on the Search icon")
    public void user_click_on_the_search_icon() {
        basePage.magnifyIconSearchButton.click();
    }

    @When("user enters a file name {string}")
    public void user_enters_a_file_name(String string) {
        searchModuleWebLocatorsPage.searchInputbox.sendKeys(fileOrFolderName + Keys.ENTER);
        BrowserUtils.sleep(3);
    }

    @When("user click on the file name")
    public void user_click_on_the_file_name() {
        searchModuleWebLocatorsPage.firstSearchResultFiles.click();
        BrowserUtils.sleep(3);
    }

    @Then("user should see a new page with the file name, size")
    public void user_should_see_a_new_page_with_the_file_name_size() {
        Assert.assertTrue(searchModuleWebLocatorsPage.highlightedSearchResult.getAttribute("data-file").equals(fileOrFolderName));
    }

    //------------------------------------------------------TC2
    @When("user click on contacts searching icon")
    public void user_click_on_contacts_searching_icon() {
        basePage.contactsSearchButton.click();
    }

    @When("user enters a contact name {string}")
    public void user_enters_a_contact_name(String contactsName) {
        searchModuleWebLocatorsPage.contactsSearchInputbox.sendKeys(contactsName);
        BrowserUtils.sleep(3);
        searchModuleWebLocatorsPage.contactFirstSearchResultInfoButton.click();
        BrowserUtils.sleep(3);
    }

    @Then("user should see the contact name")
    public void user_should_see_the_contact_name() {
        for (WebElement eachContact : contactPage.listOfContacts) {
            if (eachContact.getText().equals(contactsName)) {
                Assert.assertTrue(eachContact.isDisplayed());
            }
        }
    }

    //------------------------------------------------------TC3
    @When("user click on Photo module icon")
    public void user_click_on_photo_module_icon() {
        basePage.magnifyIconSearchButton.click();
    }

    @When("user enters an image name {string}")
    public void user_enters_an_image_name(String imageName) {
        searchModuleWebLocatorsPage.searchInputbox.sendKeys(imageName);
        BrowserUtils.sleep(3);
        searchModuleWebLocatorsPage.firstSearchResultImages.click();
        BrowserUtils.sleep(3);
    }

    @Then("user should see searched image file on that page")
    public void user_should_see_searched_image_file_on_that_page() {
        Assert.assertTrue(searchModuleWebLocatorsPage.highlightedSearchResult.getAttribute("data-file").contains(imageName));
    }

    //------------------------------------------------------TC4
    @When("user click on Ceallo icon at the top left corner")
    public void user_click_on_ceallo_icon_at_the_top_left_corner() {
        basePage.mainMenuButton.click();
        BrowserUtils.sleep(3);
    }

    @Then("user should see Dashboard page")
    public void user_should_see_dashboard_page() {
        String expectedPageTitle = "Files - Ceallo - QA";
        Assert.assertTrue(Driver.getDriver().getTitle().equalsIgnoreCase(expectedPageTitle));
    }

}
