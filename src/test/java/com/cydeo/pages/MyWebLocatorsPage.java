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

    @FindBy(xpath = "//input[@class='unified-search__form-input']")
    public WebElement searchInputbox;

    @FindBy(xpath = "//h3[@class='unified-search__result-line-one']")
    public List<WebElement> searchResults;

    @FindBy(xpath = "(//h3[@class='unified-search__result-line-one'])[1]")
    public WebElement firstSearchResult;

    @FindBy(xpath = "//tr[@class='ui-droppable highlighted']")
    public WebElement highlightedSearchResult;

    @FindBy(xpath = "//tr[@class='highlighted']")
    public WebElement highlightedImageSearchResult;




}
