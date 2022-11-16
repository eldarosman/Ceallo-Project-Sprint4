package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TasksPage extends BasePage{

    public TasksPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (xpath = "(//a[@class='app-navigation-entry-link'])[9]")
    public WebElement addListButton;

    @FindBy (id = "newListInput")
    public WebElement newListInput;

    @FindBy (xpath = "(//input[@class='action icon-checkmark'])[3]")
    public WebElement saveButton;

    // Use loop for find the element
    @FindBy (xpath = "//span[@class='app-navigation-entry__title']")
    public List<WebElement> tasksNavigators;

    public void tasksNavigationButton(String elementsName){
        for (WebElement each : tasksNavigators) {
            if (each.getText().equals(elementsName)){
                each.click();
            }
        }
    }

    @FindBy (id = "target")
    public WebElement newTaskBox;

    @FindBy (xpath = "//div[@class='title']/span")
    public WebElement taskInTheList;

    @FindBy (xpath = "//button[@class='inline task-star reactive no-nav']")
    public WebElement tasksStarButton;

    // isSelected(); --> if checkbox is selected it will return true, else false
    @FindBy (xpath = "//label[@class='priority-high reactive no-nav']")
    public WebElement tasksCheckbox;

    @FindBy (xpath = "//*[@id=\"collection_current\"]/div/div[1]")
    public WebElement currentTasksNumbers;







}
