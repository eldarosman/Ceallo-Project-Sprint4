package com.cydeo.step_definitions;

import com.cydeo.pages.OnlineStatusPage;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

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
            if(emoji.getAttribute("data-title").equals(emojiTitle)){
                emoji.click();
                BrowserUtils.sleep(1);
                break;
            }
        }
    }


}
