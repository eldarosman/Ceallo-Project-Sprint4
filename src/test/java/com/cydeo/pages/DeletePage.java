package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeletePage extends BasePage {
    public DeletePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='nav-icon-trashbin svg']")
    public WebElement deletedFilesButton;

    @FindBy(xpath = "(//tbody[@id='fileList'])[11]")
    public  WebElement recentlyDeletedFilesTable;

    @FindBy(xpath = "//a[@id='modified']//span[contains(text(), 'Deleted')]")
    public WebElement sortingOfRecentlyDeleted;

    @FindBy(xpath = "(//th[@id='headerName' and @class='column-name'])[2]")
    public WebElement sortingOfNames;

    @FindBy(xpath = "//tr[@data-file='Talk']//span[@class='icon icon-more']")
    public WebElement talkFolderOptionButton;

    @FindBy(xpath = "//tr[@data-file='Talk']//span[@class='icon icon-more']/../../..")
    public WebElement talkFolder;

    @FindBy(xpath = "//span[.='Delete folder']")
    public WebElement talkFolderDeleteFileButton;

    @FindBy(xpath = "//span[@class='nametext extra-data' and @data-original-title='Talk']")
    public WebElement deletedTalkFolder;

    @FindBy(xpath = "//span[.=' Restore']")
    public WebElement restoreButton;
    @FindBy(xpath = "//a[.='All files']")
    public WebElement allFilesButton;

    @FindBy(xpath = "//span[.='doc4']")
    public WebElement Doc4File;

    @FindBy(xpath = "//span[.='Doc3']")
    public WebElement Doc3File;

}

