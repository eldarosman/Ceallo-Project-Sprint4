package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.NotesModuleFunctionality;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class NotesModule_StepDefinition extends BasePage {
    NotesModuleFunctionality notesModuleFunctionality=new NotesModuleFunctionality();
    @When("user clicks on the notes module")
    public void user_clicks_on_the_notes_module() {
      notesMenuButton.click();
        BrowserUtils.waitFor(5);
    }
    @When("user click on the + button")
    public void user_click_on_the_button() {
notesModuleFunctionality.addNote.click();
BrowserUtils.waitFor(5);
    }

    @Then("user should be able to see the new note added")
    public void user_should_be_able_to_see_the_new_note_added() {
Assert.assertTrue(notesModuleFunctionality.newNote.isEnabled());
    }

    @When("user click on the note")
    public void user_click_on_the_note() {
notesMenuButton.click();

    }
    @When("user clicks on the dots in the right corner of the note")
    public void user_clicks_on_the_dots_in_the_right_corner_of_the_note() {

BrowserUtils.waitFor(5);
        notesModuleFunctionality.dotsButton.click();
    }
    @When("user clicks on the details option")
    public void user_clicks_on_the_details_option() {
BrowserUtils.waitFor(5);
notesModuleFunctionality.detailsButton.click();
    }
    @When("user clicks on the star in the left of note")
    public void user_clicks_on_the_star_in_the_left_of_note() {
        BrowserUtils.waitFor(5);
notesModuleFunctionality.starButton.click();
    }
    @Then("user should be able to see the note added to favorite")
    public void user_should_be_able_to_see_the_note_added_to_favorite() {
BrowserUtils.waitFor(5);
Assert.assertTrue(notesModuleFunctionality.starButton.isDisplayed());
    }



    @When("user clicks one note")
    public void user_clicks_one_note() {
notesMenuButton.click();
BrowserUtils.waitFor(5);
    }
    @When("user clicks on the dots in the right corner")
    public void user_clicks_on_the_dots_in_the_right_corner() {
notesModuleFunctionality.dotsButton.click();
BrowserUtils.waitFor(5);
    }
    @When("user clicks on the details")
    public void user_clicks_on_the_details() {
notesModuleFunctionality.detailsButton.click();
    }
    @Then("user should be able to see the number of letters and words under the note title")
    public void user_should_be_able_to_see_the_number_of_letters_and_words_under_the_note_title() {
String expectedResult="1 cuvânt, 5 characters";
String actualResult=notesModuleFunctionality.wordsLetters.getText();
Assert.assertEquals(expectedResult,actualResult);
    }

    @When("user clicks note module")
    public void userClicksNoteModule() {
        notesMenuButton.click();
        BrowserUtils.waitFor(5);
    }

    @When("user clicks to dots button")
    public void user_clicks_to_dots_button() {
        notesModuleFunctionality.dotsButton.click();
        BrowserUtils.waitFor(5);
    }
    @When("user clicks to the note details")
    public void user_clicks_to_the_note_details() {
notesModuleFunctionality.detailsButton.click();
BrowserUtils.waitFor(5);
    }
    @When("types a new category name and clicks enter")
    public void types_a_new_category_name_and_clicks_enter() {
        notesModuleFunctionality.categoryButton.sendKeys("Java",Keys.ENTER);
        BrowserUtils.waitFor(5);
    }
    @Then("user should be able to see the new category was added in the category column")
    public void user_should_be_able_to_see_the_new_category_was_added_in_the_category_column() {
        Assert.assertTrue(notesModuleFunctionality.newCategory.isEnabled());

    }

    @When("user clicks on the note module")
    public void userClicksOnTheNoteModule() {
        notesMenuButton.click();
        BrowserUtils.waitFor(5);
    }

    @When("user clicks on the dots of the note")
    public void user_clicks_on_the_dots_of_the_note() {
        BrowserUtils.sleep(3);
notesModuleFunctionality.optionButton.click();

BrowserUtils.waitFor(5);
    }
    @When("user clicks on the delete option")
    public void user_clicks_on_the_delete_option() {


    }
    @Then("user should be able to see a message in the right corner and the note removed")
    public void user_should_be_able_to_see_a_message_in_the_right_corner_and_the_note_removed() {

    }



}
