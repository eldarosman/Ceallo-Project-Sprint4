package com.cydeo.step_definitions;

import com.cydeo.pages.TalkModulePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class TalkModuleStepDefinition {

    TalkModulePage talkModulePage = new TalkModulePage();

    @Given("user is on Talk page")
    public void user_is_on_talk_page() {
        talkModulePage.talkMenuButton.click();
    }

    @When("user create new group conversation")
    public void user_create_new_group_conversation() {
        talkModulePage.talkMenuButton.click();
    }

    @When("user add other users")
    public void user_add_other_users() {
        talkModulePage.addParticipants();
    }

    @Then("new group conversation is created")
    public void new_group_conversation_is_created() {
        assertTrue(talkModulePage.createdConversation.isEnabled());
    }

    @When("user click on conversation")
    public void user_click_on_conversation() {
        talkModulePage.createdConversation.click();
    }

    @Then("user can see the participants of the conversation")
    public void user_can_see_the_participants_of_the_conversation() {
        for (WebElement each : talkModulePage.chatsParticipants) {
            assertTrue(each.isDisplayed());
        }
    }

    @Then("user can remove any participant from the conversation")
    public void user_can_remove_any_participant_from_the_conversation() {
        talkModulePage.userMeatBallsButton.click();
        talkModulePage.removeParticipantButton.click();
    }

    @When("user type a massage inside the inputbox")
    public void user_type_a_massage_inside_the_inputbox() {
        talkModulePage.chatTextBox.sendKeys("Hello World!" + Keys.ENTER);
    }

    @Then("user can send this massage")
    public void user_can_send_this_massage() {
        assertTrue(talkModulePage.sentMassage.isDisplayed());
    }

    @Then("user can delete this conversation")
    public void user_can_delete_this_conversation() {
        talkModulePage.conversationIsDeleted();
    }

}
