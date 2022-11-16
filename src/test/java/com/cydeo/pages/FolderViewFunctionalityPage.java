package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FolderViewFunctionalityPage {

    public FolderViewFunctionalityPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id=\"headerName-container\"]/a/span[1]")
    public WebElement filesButton;

    @FindBy(xpath = "//*[@id=\"headerName-container\"]/a/span[1]")
    public WebElement nameButton;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/table/thead/tr/th[3]/a/span[1]")
    public WebElement sizeButton;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/table/thead/tr/th[4]/a/span[1]")
    public WebElement modifiedButton;

    @FindBy(xpath = "//label[@for='select_all_files']/.")
    public WebElement selectAllButton;

    @FindBy(xpath = "//span[@class='sort-indicator icon-triangle-n']")
    public WebElement arrowNameUpButton;

    @FindBy(xpath = "//span[@class='sort-indicator icon-triangle-s']")
    public WebElement arrowNameDownButton;

    @FindBy(xpath = "//span[@class='sort-indicator icon-triangle-n']")
    public WebElement arrowSizeUpButton;

    @FindBy(xpath = "//span[@class='sort-indicator icon-triangle-s']")
    public WebElement arrowSizeDownButton;

    @FindBy(xpath = "//span[@class='sort-indicator icon-triangle-n']")
    public WebElement arrowModifiedUpButton;

    @FindBy(xpath = "//span[@class='sort-indicator icon-triangle-s']")
    public WebElement arrowModifiedDownButton;

    @FindBy(xpath = "//label[@class='button icon-toggle-filelist']")
    public WebElement toggleListViewButton;

    @FindBy(xpath = "//label[@class='button icon-toggle-pictures']")
    public WebElement toggleGridViewButton;

    @FindBy(xpath = "//label[@id='view-toggle']")
    public WebElement toggleGridListViewButton;

    //@FindBy(xpath = "//*[@id=\"headerName-container\"]/a/span[1]")
    //public WebElement totalValuesOfFiles;

    @FindBy(xpath = "//span[@class='innernametext']")
    public List<WebElement> allNamesFolders;

    @FindBy(xpath = "//span[@class='innernametext']")
    public List<WebElement> allGridListFoldersByTitle;

    @FindBy(xpath = "//div[@class='thumbnail']")
    public List<WebElement> allListFolders;

    @FindBy(xpath = "//div[@class='thumbnail-wrapper']")
    public List<WebElement> allGridFolders;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/table/thead/tr/th[2]/div/a/span[1]")
    public WebElement totalFoldersAndFiles;

    @FindBy(xpath = "//table[@ class = 'list-container has-controls view-grid multiselect']")
    public WebElement allGridViewButtom;













}
