package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.MyWebLocatorsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchModule_stepDefinitions extends BasePage {

    BasePage basePage = new BasePage();

    MyWebLocatorsPage myWebLocatorsPage = new MyWebLocatorsPage();

    //Actions action = new Actions(Driver.getDriver());

    //------------------------------------------------------TC1
    @When("user click on the Search icon")
    public void user_click_on_the_search_icon() {
        basePage.magnifyIconSearchButton.click();
    }

    @When("user enters a file name PicturePhoto1")
    public void user_enters_a_file_name_picture_photo1() {

    }

    @When("user click on the file name")
    public void user_click_on_the_file_name() {

    }

    @Then("user should see a new page with the file name, size")
    public void user_should_see_a_new_page_with_the_file_name_size() {

    }


    //------------------------------------------------------TC2
    @When("user click on contacts searching icon")
    public void user_click_on_contacts_searching_icon() {

    }

    @When("user enters a contact name {string}")
    public void user_enters_a_contact_name(String string) {

    }

    @Then("user should see the contact name")
    public void user_should_see_the_contact_name() {

    }


    //------------------------------------------------------TC3
    @When("user click on Photo module icon")
    public void user_click_on_photo_module_icon() {

    }

    @Then("user should see all the images files on that page")
    public void user_should_see_all_the_images_files_on_that_page() {

    }


    //------------------------------------------------------TC4
    @When("user click on Ceallo icon at the top left corner")
    public void user_click_on_ceallo_icon_at_the_top_left_corner() {

    }

    @Then("user should see Dashboard page")
    public void user_should_see_dashboard_page() {

    }

}
