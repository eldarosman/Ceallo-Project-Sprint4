package com.cydeo.step_definitions;

import com.cydeo.pages.OnlineStatusPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import netscape.javascript.JSException;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class OnlineStatus_step_definitions {

    OnlineStatusPage onlineStatusPage = new OnlineStatusPage();

    @When("user clicks on the User Icon")
    public void user_clicks_on_the_user_icon() {
        onlineStatusPage.userIcon.click();
    }
    @Then("user can see current user status under the User Icon")
    public void user_can_see_current_user_status_under_the_user_icon() {
        Assert.assertTrue(onlineStatusPage.currentUserStatus.isDisplayed());
    }
    @When("user clicks on current user status")
    public void user_clicks_on_current_user_status() {
        onlineStatusPage.currentUserStatus.click();
    }
    @Then("verify if user can view all online status on the page")
    public void verify_if_user_can_view_all_online_status_on_the_page() {
        Assert.assertTrue(onlineStatusPage.statusButton_Online.isDisplayed());
        Assert.assertTrue(onlineStatusPage.statusButton_DoNotDisturb.isDisplayed());
        Assert.assertTrue(onlineStatusPage.statusButton_Away.isDisplayed());
        Assert.assertTrue(onlineStatusPage.statusButton_Invisible.isDisplayed());
    }

    @And("user clicks on one from the available status {string}")
    public void userClicksOnOneFromTheAvailableStatus(String status) {
        for (WebElement eachStatus : onlineStatusPage.allUserStatuses) {
            if(eachStatus.getText().contains(status)){
                eachStatus.click();
                BrowserUtils.sleep(2);
            }
        }
    }

    @And("user clicks on close window button")
    public void userClicksOnCloseWindowButton() {
        BrowserUtils.sleep(2);
        onlineStatusPage.closeStatusWindow.click();
    }

    @Then("verify user can see valid user status under the user icon {string}")
    public void verifyUserCanSeeValidUserStatusUnderTheUserIcon(String status) {
        Assert.assertTrue(onlineStatusPage.currentUserStatus.getText().contains(status));
    }

    @And("user chose a status message from default options {string}")
    public void userChoseAStatusMessageFromDefaultOptions(String statusMessage) {
        for (WebElement eachOption : onlineStatusPage.allDefaultOptionsStatusMessage) {
            if(eachOption.getText().contains(statusMessage)){
                eachOption.click();
            }
        }
    }

    @And("user clicks on Set Status Message button")
    public void userClicksOnSetStatusMessageButton() {
        onlineStatusPage.setStatusMessageButton.click();
    }


    @When("user clicks on online status message input box")
    public void userClicksOnOnlineStatusMessageInputBox() {
        onlineStatusPage.statusMessageInputBox.click();
        onlineStatusPage.statusMessageInputBox.clear();

    }

    @And("user types a custom status message {string}")
    public void userTypesACustomStatusMessage(String status) {
        onlineStatusPage.statusMessageInputBox.sendKeys(status);
    }

    @And("user clicks on emoji option menu and choose one emoji {string}")
    public void userClicksOnEmojiOptionMenuAndChooseOneEmoji(String emojiTitle) {
        onlineStatusPage.emojiButton.click();

        for (WebElement emoji : onlineStatusPage.allEmojis) {
            Actions actions = new Actions(Driver.getDriver());
            if(emoji.getAttribute("data-title").contains(emojiTitle)){
                //System.out.println("emoji.getAttribute(\"data-title\") = " + emoji.getAttribute("data-title"));
                //System.out.println("emoji.getText() = " + emoji.getText());
               //emoji.sendKeys(Keys.PAGE_DOWN);
                JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
                js.executeScript("arguments[0].click();",emoji);
                BrowserUtils.sleep(2);
                //js.executeScript("arguments[0].scrollIntoView();",emoji);
                //js.executeScript("window.scrollBy(0,750);");
                //BrowserUtils.sleep(1);
                //actions.moveToElement(emoji);
                //actions.perform();
                //BrowserUtils.sleep(2);
                //emoji.click();

                break;
            }
        }
    }


    @And("user clicks on Clear status message button")
    public void userClicksOnClearStatusMessageButton() {
        onlineStatusPage.clearStatusMessageButton.click();
    }

    @Then("verify user is not see default status {string} under the user icon")
    public void verifyUserIsNotSeeDefaultStatusUnderTheUserIcon(String status) {
        Assert.assertFalse(onlineStatusPage.currentUserStatus.getText().contains(status));
    }



    @Then("verify user can see valid option - {string} - on the clearStatusDropdown")
    public void verifyUserCanSeeValidOptionOnTheClearStatusDropdown(String currentTimeOption) {
        System.out.println("onlineStatusPage.defaultSelectedOptionFromStatusAfterDropdown.getText() = " + onlineStatusPage.defaultSelectedOptionFromStatusAfterDropdown.getText());
        Assert.assertTrue(onlineStatusPage.defaultSelectedOptionFromStatusAfterDropdown.getText().equals(currentTimeOption));
    }

    @And("user clicks on dropdown and choose one of the option - {string}")
    public void userClicksOnDropdownAndChooseOneOfTheOption(String timeOption) {
        onlineStatusPage.defaultSelectedOptionFromStatusAfterDropdown.click();
        for (WebElement eachOption : onlineStatusPage.clearStatusAfterOptions) {
            if(eachOption.getText().equals(timeOption)){
                eachOption.click();
                break;
            }
        }

    }
}
