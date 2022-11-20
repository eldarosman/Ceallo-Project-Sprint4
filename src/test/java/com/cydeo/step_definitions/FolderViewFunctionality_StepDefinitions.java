package com.cydeo.step_definitions;

import com.cydeo.pages.FolderViewFunctionalityPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.google.common.collect.Ordering;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FolderViewFunctionality_StepDefinitions {

FolderViewFunctionalityPage folderViewFunctionalityPage = new FolderViewFunctionalityPage();

     //==========Scenario 1
     @Given("user is on home page")
     public void user_is_on_home_page() {
         String url = ConfigurationReader.getProperty("url");
         Driver.getDriver().get(url);
     }

    @When("user navigate to Files button and clicks")
    public void user_navigate_to_files_button_and_clicks() {
        BrowserUtils.sleep(3);
    folderViewFunctionalityPage.filesButton.click();
    }

    @When("user navigate to Name button and click")
    public void user_navigate_to_name_button_and_click() {
         BrowserUtils.sleep(3);
    folderViewFunctionalityPage.nameButton.click();
        BrowserUtils.sleep(3);
        folderViewFunctionalityPage.nameButton.click();
        BrowserUtils.sleep(3);
    }

    @Then("User verify that user can change folder view order by Name")
    public void user_verify_that_user_can_change_folder_view_order_by_name() {

        if(folderViewFunctionalityPage.arrowNameUpButton.getAttribute("class").equals("sort-indicator icon-triangle-n")){
            System.out.println("Verification is passed -> increasing alphanumerical order");
        }else if(folderViewFunctionalityPage.arrowNameDownButton.getAttribute("class").equals("sort-indicator icon-triangle-s")){
            System.out.println("Verification is passed -> decreasing alphanumerical order");
        }else{
            System.out.println("Verification is failed");
        }

       /*for (WebElement each : folderViewFunctionalityPage.allNamesFolders) {
            BrowserUtils.sleep(3);
            if (each.getText().matches("[a-zA-Z0-9]+")) {
                System.out.println("Verification is passed -> ordered alphanumerically");
            } else {
                System.out.println("Verification is failed");
            }
        }*/
    }

    //==========Scenario 2
    @Given("user is on homePAGE")
    public void user_is_on_HOME_page() {
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
    }

    @When("user navigate to Files BUTTON and clicks")
    public void user_navigate_to_files_Button_and_clicks() {
        BrowserUtils.sleep(10);
        folderViewFunctionalityPage.filesButton.click();
    }

    @When("user navigate to Size button and click")
    public void user_navigate_to_size_button_and_click() {
        BrowserUtils.sleep(5);
        folderViewFunctionalityPage.sizeButton.click();
        BrowserUtils.sleep(5);
        folderViewFunctionalityPage.sizeButton.click();
        BrowserUtils.sleep(5);
    }

    @Then("User verify that user can change folder view order by Size")
    public void user_verify_that_user_can_change_folder_view_order_by_size() {
        if(folderViewFunctionalityPage.arrowSizeUpButton.getAttribute("class").equals("sort-indicator icon-triangle-n")){
            System.out.println("Verification is passed -> increasing alphanumerical order");
        }else if(folderViewFunctionalityPage.arrowSizeDownButton.getAttribute("class").equals("sort-indicator icon-triangle-s")){
            System.out.println("Verification is passed -> decreasing alphanumerical order");
        }else{
            System.out.println("Verification is failed");
        }
    }
    //==========Scenario 3
    @Given("user is on HOME page")
    public void user_IS_on_home_Page() {
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
    }

    @When("user navigate to Files Button and clicks")
    public void user_navigate_to_Files_button_AND_clicks() {
        BrowserUtils.sleep(10);
        folderViewFunctionalityPage.filesButton.click();
    }

    @When("user navigate to Modified button and click")
    public void user_navigate_to_modified_button_and_click() {
        BrowserUtils.sleep(5);
        folderViewFunctionalityPage.modifiedButton.click();
        BrowserUtils.sleep(5);
        folderViewFunctionalityPage.modifiedButton.click();
        BrowserUtils.sleep(5);
    }

    @Then("User verify that user can change folder view order by Modified")
    public void user_verify_that_user_can_change_folder_view_order_by_modified() {
        if(folderViewFunctionalityPage.arrowModifiedUpButton.getAttribute("class").equals("sort-indicator icon-triangle-n")){
            System.out.println("Verification is passed -> increasing alphanumerical order");
        }else if(folderViewFunctionalityPage.arrowModifiedDownButton.getAttribute("class").equals("sort-indicator icon-triangle-s")){
            System.out.println("Verification is passed -> decreasing alphanumerical order");
        }else{
            System.out.println("Verification is failed");
        }
    }
    //==========Scenario 4
    @Given("user is on Home page")
    public void user_is_on_Home_page() {
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
    }

    @When("user navigate to FilesButton and clicks")
    public void user_navigate_to_Files_button_and_clicks() {
        folderViewFunctionalityPage.filesButton.click();
    }

    @When("user navigate to toggle-view button and click")
    public void user_navigate_to_toggle_view_button_and_click() {
     folderViewFunctionalityPage.toggleGridListViewButton.click();
        BrowserUtils.sleep(5);
        folderViewFunctionalityPage.toggleGridListViewButton.click();
        BrowserUtils.sleep(5);
     }

   @Then("User verify that user can change the folder view by clicking the toggle-view button")
    public void user_verify_that_user_can_change_the_folder_view_by_clicking_the_toggle_view_button() {
         if(folderViewFunctionalityPage.toggleGridListViewButton.getAttribute("class").equals("button icon-toggle-pictures")) {
            BrowserUtils.sleep(5);
             System.out.println("Verification is passed-user can see Grid View");
        }else if(folderViewFunctionalityPage.toggleGridListViewButton.getAttribute("class").equals("button icon-toggle-filelist")){
            System.out.println("Verification is passed-user can see List View");
        }else{
             System.out.println("Verification is failed");
         }
         }

    //==========Scenario 5
    @Given("user is on homePage")
    public void user_is_on_home_Page() {
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
    }

    @When("user navigate to FILES button and clicks")
    public void user_navigate_to_Files_Button_and_clicks() {
        folderViewFunctionalityPage.filesButton.click();
    }

    @When("user navigate to “select all” checkbox and click")
    public void user_navigate_to_select_all_checkbox_and_click() {
       folderViewFunctionalityPage.selectAllButton.click();
    }

    @Then("User verify that user can select all the files at once")
    public void user_verify_that_user_can_select_all_the_files_at_once() {

        //System.out.println("User can select all the files at once - " + folderViewFunctionalityPage.selectAllButton.isEnabled());
        if(folderViewFunctionalityPage.selectAllButton.isEnabled()){
            System.out.println("Verification passed - User can select all the files at once");
        }else{
            System.out.println("Verification failed");
        }


    }
    @Then("User verify that user can see the total values of all files")
    public void user_verify_that_user_can_see_the_total_values_of_all_files() {
        String expectedTitle = "17 folders and 6 files (including 7 hidden)";
        String actualTitle = folderViewFunctionalityPage.totalFoldersAndFiles.getText();

        Assert.assertEquals(expectedTitle,actualTitle);
    }
}
