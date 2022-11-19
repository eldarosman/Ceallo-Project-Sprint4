package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MyWebLocatorsPage extends BasePage{

    public MyWebLocatorsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

//    @FindBy(xpath = "(//tbody[@id='fileList'])[1]")
//    public WebElement allFilesArrayList;

    @FindBy(css = "[class='app-content-list-item-line-one']")
    List<WebElement> contactsList;



}
