package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FilesPage {

    public FilesPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id=\"commentsTabView\"]/ul/li/div[1]/div[5]/ul/li[2]/a")
    public WebElement deleteCommentOption;

    @FindBy(xpath = "//*[@id=\"commentsTabView\"]/ul/li/div[1]/a")
    public WebElement commentOptions;

    @FindBy(xpath = "//*[@id=\"commentsTabView\"]/div[1]/form/input")
    public WebElement postCommentBtn;

    @FindBy(xpath = "//*[@id=\"commentsTabView\"]/ul/li/div[2]")
    public WebElement newComment;

    @FindBy(xpath = "//*[@id=\"commentsTabView\"]/div[1]/form/div[1]")
    public WebElement commentInputBox;

    @FindBy(xpath = "//*[@id=\"commentsTabView\"]")
    public WebElement commentsTab;

    @FindBy(xpath = "//*[@id=\"rightClickMenu\"]/ul/li[2]/a/span[2]")
    public WebElement detailsOption;

    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[1]/td[2]/a/span[1]/span")
    public WebElement renamedFolder;

    @FindBy(xpath = "//*[@id=\"rightClickMenu\"]/ul/li[3]/a/span[2]")
    public WebElement renameFolderOption;

    @FindBy(xpath = "//*[@id=\"rightClickMenu\"]/ul/li[6]/a/span[2]")
    public WebElement deleteFolderOption2;

    @FindBy(xpath = "//*[@id=\"rightClickMenu\"]/ul/li[7]/a/span[2]")
    public WebElement deleteFolderOption;

    @FindBy(xpath = "//*[@id=\"fileList\"]/tr/td[1]/a/span[1]/span")
    public WebElement favoritedFolder;

    @FindBy(xpath = "//*[@id=\"app-navigation\"]/ul/li[3]/a")
    public WebElement favoritesTab;

    @FindBy(xpath = "//*[@id=\"controls\"]/div[2]/div[2]/ul/li[2]/a/span[2]")
    public WebElement newFolderOption;

    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[1]/td[2]/a/span[1]/span")
    public WebElement freshFolder;

    @FindBy(xpath = "//*[@id=\"controls\"]/div[2]/a")
    public WebElement newFileBtn;

    @FindBy(xpath = "(//a[@href='/index.php/apps/files/'])[1]")
    public WebElement fileModuleButton;


    @FindBy(xpath = "//*[@id=\"rightClickMenu\"]/ul/li[1]/a/span[2]")
    public WebElement addToFavoritesButton;

}
