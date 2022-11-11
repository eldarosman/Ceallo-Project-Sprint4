package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.TalkModulePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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
        talkModulePage.createdConversation.isEnabled();
    }
    @When("user click on conversation")
    public void user_click_on_conversation() {

    }
    @Then("user can see the participants of the conversation")
    public void user_can_see_the_participants_of_the_conversation() {

    }
    @Then("user can remove any participant from the conversation")
    public void user_can_remove_any_participant_from_the_conversation() {

    }
    @When("user type a massage inside the inputbox")
    public void user_type_a_massage_inside_the_inputbox() {

    }
    @Then("user can send this massage")
    public void user_can_send_this_massage() {

    }
    @Then("user can delete this conversation")
    public void user_can_delete_this_conversation() {

    }

}
