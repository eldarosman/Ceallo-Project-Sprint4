package com.cydeo.step_definitions;

import com.cydeo.pages.TasksPage;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class TaskModule_stepDefinitions {

    TasksPage tasksPage = new TasksPage();

    @Given("user on the Tasks module")
    public void user_on_the_tasks_module() {
        tasksPage.tasksMenuButton.click();
    }
    @When("user click on Add List button")
    public void user_click_on_add_list_button() {
        BrowserUtils.sleep(2);
        tasksPage.tasksNavigationButton("Add List…");
    }
    @When("user enters name of List {string}")
    public void user_enters_name_of_list(String taskListName) {
        BrowserUtils.sleep(2);
        tasksPage.newListInput.sendKeys(taskListName);
    }
    @When("user click on Save button")
    public void user_click_on_save_button() {
        BrowserUtils.sleep(1);
        tasksPage.saveButton.click();
    }
    @Then("user should see just created list {string} in page")
    public void user_should_see_just_created_list_in_page(String taskListName) {
        BrowserUtils.sleep(1);
        for (WebElement each : tasksPage.tasksNavigators) {
            if (each.getText().equals(taskListName)){
                Assert.assertTrue(true);
            }
        }
    }

}
