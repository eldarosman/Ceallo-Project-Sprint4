package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.ContactsModulePage;
import com.cydeo.pages.MyWebLocatorsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.security.auth.kerberos.KerberosKey;

public class SearchModule_stepDefinitions {

    BasePage basePage = new BasePage(){};

    MyWebLocatorsPage myWebLocatorsPage = new MyWebLocatorsPage();

    String fileOrFolderName = "PicturesPhoto1";
    String contactsName = "sibel";
    String imageName = "resim";

    //Actions action = new Actions(Driver.getDriver());

    //------------------------------------------------------TC1
    @When("user click on the Search icon")
    public void user_click_on_the_search_icon() {
        basePage.magnifyIconSearchButton.click();
    }

    @When("user enters a file name {string}")
    public void user_enters_a_file_name(String string) {
        myWebLocatorsPage.searchInputbox.sendKeys(fileOrFolderName + Keys.ENTER);
        BrowserUtils.sleep(3);
    }

    @When("user click on the file name")
    public void user_click_on_the_file_name() {
        myWebLocatorsPage.firstSearchResult.click();
        BrowserUtils.sleep(3);
    }

    @Then("user should see a new page with the file name, size")
    public void user_should_see_a_new_page_with_the_file_name_size() {
        Assert.assertTrue(myWebLocatorsPage.highlightedSearchResult.getAttribute("data-file").equals("PicturePhoto1"));
    }

    //------------------------------------------------------TC2
    @When("user click on contacts searching icon")
    public void user_click_on_contacts_searching_icon() {
       myWebLocatorsPage.magnifyIconSearchButton.click();
    }

    @When("user enters a contact name {string}")
    public void user_enters_a_contact_name(String contactsName) {
        myWebLocatorsPage.searchInputbox.sendKeys(contactsName);
        BrowserUtils.sleep(3);
    }

    @Then("user should see the contact name")
    public void user_should_see_the_contact_name() {
        Assert.assertTrue(myWebLocatorsPage.firstSearchResult.getAttribute("title").equalsIgnoreCase(contactsName));
    }

    //------------------------------------------------------TC3
    @When("user click on Photo module icon")
    public void user_click_on_photo_module_icon() {
        myWebLocatorsPage.magnifyIconSearchButton.click();
    }

    @When("user enters an image name {string}")
    public void user_enters_an_image_name(String imageName) {
        myWebLocatorsPage.searchInputbox.sendKeys(imageName);
        BrowserUtils.sleep(3);
        myWebLocatorsPage.firstSearchResult.click();
        BrowserUtils.sleep(3);
    }

    @Then("user should see searched image file on that page")
    public void user_should_see_searched_image_file_on_that_page() {
        System.out.println(myWebLocatorsPage.highlightedImageSearchResult.getAttribute("data-file"));
        Assert.assertFalse(myWebLocatorsPage.highlightedImageSearchResult.getAttribute("data-file").contains(imageName));
    }

    //------------------------------------------------------TC4
    @When("user click on Ceallo icon at the top left corner")
    public void user_click_on_ceallo_icon_at_the_top_left_corner() {

    }

    @Then("user should see Dashboard page")
    public void user_should_see_dashboard_page() {

    }

}
