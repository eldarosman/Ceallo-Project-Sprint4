package com.cydeo.step_definitions;

import com.cydeo.pages.TasksPage;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class TaskModule_stepDefinitions {

    TasksPage tasksPage = new TasksPage();

    //--------@CEA-1097--------

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

    //--------@CEA-1098--------

    @Given("user on the Tasks page")
    public void user_on_the_tasks_page() {
        tasksPage.tasksMenuButton.click();
    }
    @When("user click on {string}")
    public void user_click_on(String listName) {
        BrowserUtils.sleep(2);
        tasksPage.tasksNavigationButton(listName);
    }
    @When("user enters a new task {string}")
    public void user_enters_a_new_task(String taskName) {
        BrowserUtils.sleep(2);
        tasksPage.newTaskBox.sendKeys(taskName, Keys.ENTER);
    }
    @Then("user should see a new task in List")
    public void user_should_see_a_new_task_in_list() {
        BrowserUtils.sleep(2);
        String expectedTaskName = "Peperoni";
        String actualTaskName = tasksPage.taskInTheList.getText();

        Assert.assertEquals(expectedTaskName, actualTaskName);
    }

    //--------@CEA-1099--------

    @When("user click on the star icon")
    public void user_click_on_the_star_icon() {
        BrowserUtils.sleep(2);
        tasksPage.tasksStarButton.click();
    }
    @When("user click {string} navigation list")
    public void user_click_navigation_list(String importantNavigator) {
        BrowserUtils.sleep(2);
        tasksPage.tasksNavigationButton(importantNavigator);
    }
    @Then("user should see {string} task")
    public void user_should_see_task(String expectedTaskName) {
        BrowserUtils.sleep(2);
        String actualTaskName = tasksPage.taskInTheList.getText();

        Assert.assertEquals(expectedTaskName, actualTaskName);
    }

    //--------@CEA-1100--------
    @Then("user sees numbers of uncompleted tasks in current tab")
    public void user_sees_numbers_of_uncompleted_tasks_in_current_tab() {
        BrowserUtils.sleep(2);
        Assert.assertTrue(tasksPage.currentTasksNumbers.isDisplayed());
        System.out.println("currentTasksNumbers = " + tasksPage.currentTasksNumbers.getText());
    }
}
