package com.cydeo.step_definitions;

import com.cydeo.pages.FilesPage;
import com.cydeo.pages.LogInPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FilesModuleStepDefinitions {

    FilesPage filesPage = new FilesPage();

    Actions action = new Actions(Driver.getDriver());

    //(1)----------------------------------------------------------------------------------
    @When("user clicks Add to favorites")
    public void user_clicks_add_to_favorites() throws InterruptedException {


        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);
        filesPage.fileModuleButton.click();

        List<WebElement> elementsList = Driver.getDriver().findElements(By.xpath("//*[@id=\"fileList\"]/tr[1]/td[2]/a/span[1]/span"));

        if (elementsList.isEmpty()){
            Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            filesPage.newFileBtn.click();

            Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            action.moveToElement(filesPage.newFolderOption).click().sendKeys("yeet"+ Keys.ENTER).perform();
        }else {

        }


        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        action.moveToElement(filesPage.freshFolder).contextClick(filesPage.freshFolder).perform();

        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        action.moveToElement(filesPage.addToFavoritesButton).click().perform();

    }

    @Then("folder should be added to favorites")
    public void folder_should_be_added_to_favorites() throws InterruptedException {

        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        action.moveToElement(filesPage.favoritesTab).click().perform();

        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        filesPage.favoritedFolder.isEnabled();

        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        action.moveToElement(filesPage.favoritedFolder).contextClick(filesPage.favoritedFolder).perform();

        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        action.moveToElement(filesPage.deleteFolderOption).click().perform();


    }
    //(1)----------------------------------------------------------------------------------



    //(2)----------------------------------------------------------------------------------
    @When("user clicks Rename")
    public void user_clicks_rename() throws InterruptedException {

        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        filesPage.newFileBtn.click();

        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        action.moveToElement(filesPage.newFolderOption).click().sendKeys("yeet"+ Keys.ENTER).perform();

        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        action.moveToElement(filesPage.freshFolder).contextClick(filesPage.freshFolder).perform();

    }

    @When("user enters a New name for file or folder and presses Enter key")
    public void user_enters_a_new_name_for_file_or_folder_and_presses_enter_key() throws InterruptedException {
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        action.moveToElement(filesPage.renameFolderOption).click().sendKeys("yeet2"+ Keys.ENTER).perform();

    }

    @Then("user should be able to see a changed name of file or folder")
    public void user_should_be_able_to_see_a_changed_name_of_file_or_folder() throws InterruptedException {

        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertTrue(filesPage.renamedFolder.isEnabled());

        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        action.moveToElement(filesPage.renamedFolder).contextClick().perform();

        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        action.moveToElement(filesPage.deleteFolderOption2).click().perform();

    }
    //(2)----------------------------------------------------------------------------------



    //(3)----------------------------------------------------------------------------------
    @When("user clicks Details")
    public void user_clicks_details() throws InterruptedException {

        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        filesPage.newFileBtn.click();

        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        action.moveToElement(filesPage.newFolderOption).click().sendKeys("yeet"+ Keys.ENTER).perform();

        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        action.moveToElement(filesPage.freshFolder).contextClick(filesPage.freshFolder).perform();

        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        action.moveToElement(filesPage.detailsOption).click().perform();

    }

    @When("user clicks Comments")
    public void user_clicks_comments() throws InterruptedException {
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        action.moveToElement(filesPage.commentsTab).click().perform();

    }

    @When("user enters a New comment text for file or folder and presses Enter key")
    public void user_enters_a_new_comment_text_for_file_or_folder_and_presses_enter_key() throws InterruptedException {
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        action.moveToElement(filesPage.commentInputBox).click().sendKeys("yeet comment").perform();
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        action.moveToElement(filesPage.postCommentBtn).click().perform();


    }

    @Then("user should be able to see a recently written comment")
    public void user_should_be_able_to_see_a_recently_written_comment() throws InterruptedException {
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        filesPage.newComment.isEnabled();

        action.moveToElement(filesPage.freshFolder).contextClick(filesPage.freshFolder).perform();

        action.moveToElement(filesPage.deleteFolderOption2).click().perform();
    }
    //(3)----------------------------------------------------------------------------------



    //(4)----------------------------------------------------------------------------------

    @When("user clicks on three dot icon near the comment that should be deleted")
    public void user_clicks_on_three_dot_icon_near_the_comment_that_should_be_deleted() throws InterruptedException {

        List<WebElement> elementsList = Driver.getDriver().findElements(By.xpath("//*[@id=\"fileList\"]/tr[1]/td[2]/a/span[1]/span"));

        if (elementsList.isEmpty()){
            Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            filesPage.newFileBtn.click();

            Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            action.moveToElement(filesPage.newFolderOption).click().sendKeys("yeet"+ Keys.ENTER).perform();
        }else {

        }


        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        action.moveToElement(filesPage.freshFolder).contextClick(filesPage.freshFolder).perform();

        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        action.moveToElement(filesPage.detailsOption).click().perform();

        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        action.moveToElement(filesPage.commentsTab).click().perform();

        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        action.moveToElement(filesPage.commentInputBox).click().sendKeys("yeet comment").perform();

        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        action.moveToElement(filesPage.postCommentBtn).click().perform();


    }

    @When("user clicks on delete comment button")
    public void user_clicks_on_delete_comment_button() throws InterruptedException {
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        action.moveToElement(filesPage.commentOptions).click().perform();

        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        action.moveToElement(filesPage.deleteCommentOption).click().perform();
    }

    @Then("comment should be deleted")
    public void comment_should_be_deleted() throws InterruptedException {
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        List<WebElement> elementsList = Driver.getDriver().findElements(By.xpath("//span[contains(@title, 'New note')]"));

        Assert.assertTrue(elementsList.isEmpty());

    }
    //(4)----------------------------------------------------------------------------------


}
