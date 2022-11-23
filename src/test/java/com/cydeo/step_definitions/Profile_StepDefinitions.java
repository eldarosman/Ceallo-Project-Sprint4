package com.cydeo.step_definitions;

import com.cydeo.pages.ProfilePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Profile_StepDefinitions {
    ProfilePage profilePage=new ProfilePage();
    @Given("user click user profile button")
    public void user_click_user_profile_button() {
        profilePage.settings.click();
    }
    @When("user click Settings button")
    public void user_click_settings_button() {
        profilePage.setbutton.click();
    }
    @Then("user verify that full name, email and phonenumber")
    public void user_verify_that_full_name_email_and_phonenumber() {
        String name1=profilePage.fullName.getAttribute("value");
        String email1=profilePage.email.getAttribute("placeholder");
        String phone1=profilePage.phone.getAttribute("placeholder");
        System.out.println(name1+"\n"+email1+"\n"+phone1);
    }

    @Given("user enters name into Full name inputbox")
    public void user_enters_name_into_full_name_inputbox() {
        profilePage.fullName.clear();
        profilePage.fullName.sendKeys("Test51"+Keys.ENTER);

    }
    @When("user verify the name in the inputbox")
    public void user_verify_the_name_in_the_inputbox() {
        String expectedname="Test51";
        String actualname=profilePage.fullName.getAttribute("value");

        Assert.assertEquals(expectedname,actualname);

    }

    @Given("user click phone number s Private button")
    public void user_click_phone_number_s_private_button() {
        profilePage.phoneSetting.click();
        profilePage.phonePrivate.click();
    }

    @Given("user verify that local time appears")
    public void user_verify_that_local_time_appears() {
        String localTime=profilePage.localTime.getText();
        System.out.println(localTime);
    }
}
