package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.DeletePage;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FileModule_stepDefinitions {
    BasePage basePage = new BasePage(){};
    DeletePage deletePage = new DeletePage();

    @When("user click Deleted files button")
    public void user_click_deleted_files_button() {
        deletePage.deletedFilesButton.click();
    }
    @Then("user should see most recent deleted file in the first line of the deleted file list")
    public void user_should_see_most_recent_deleted_file_in_the_first_line_of_the_deleted_file_list() {
        BrowserUtils.sleep(3);
        Assert.assertTrue(deletePage.recentlyDeletedFilesTable.isDisplayed());
    }

    @When("user on Delete files button and click")
    public void user_on_delete_files_button_and_click() {
        deletePage.deletedFilesButton.click();
    }
    @When("user click Deleted button")
    public void user_click_deleted_button() {
        deletePage.sortingOfRecentlyDeleted.click();
    }
    @Then("user should see ordering all deleted files by newest to oldest or vista versa")
    public void user_should_see_ordering_all_deleted_files_by_newest_to_oldest_or_vista_versa() {
        Assert.assertTrue(deletePage.recentlyDeletedFilesTable.isDisplayed());
    }

    @When("user is on Deleted file page")
    public void user_is_on_deleted_file_page() {
        deletePage.deletedFilesButton.click();

    }
    @When("user clicks Name button")
    public void user_clicks_name_button() {
        deletePage.sortingOfNames.click();
    }
    @Then("user should see ordering  alphabetically all the deleted files based on their names")
    public void user_should_see_ordering_alphabetically_all_the_deleted_files_based_on_their_names() {
        Assert.assertTrue(deletePage.recentlyDeletedFilesTable.isDisplayed());
    }

    @When("click three dots icon")
    public void click_three_dots_icon() {
        deletePage.allFilesButton.click();
        deletePage.talkFolderOptionButton.click();
    }
    @When("user click Delete files button")
    public void user_click_delete_files_button() {
        deletePage.talkFolderDeleteFileButton.click();

    }
    @Then("user should see the file is deleted")
    public void user_should_see_the_file_is_deleted() {
    Assert.assertTrue(deletePage.deletedFilesButton.isDisplayed());
    }

    @When("user is on Deleted files page")
    public void user_is_on_deleted_files_page() {
       deletePage.deletedFilesButton.click();
    }
    @When("user click Restore button")
    public void user_click_restore_button() {
        deletePage.restoreButton.click();
    }
    @Then("user should see file is restore")
    public void user_should_see_file_is_restore() {
        Assert.assertFalse(deletePage.Doc3File.isDisplayed());
    }
















}
