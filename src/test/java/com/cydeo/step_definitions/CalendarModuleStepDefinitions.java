package com.cydeo.step_definitions;

import com.cydeo.pages.CalendarPage;
import com.cydeo.pages.CalendarPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CalendarModuleStepDefinitions {

    CalendarPage calendarPage = new CalendarPage();

    @When("User can click Calendar on Module, click dropdown Menu and select Day Option")
    public void user_can_click_calendar_on_module_click_dropdown_menu_and_select_day_option() throws InterruptedException {

        calendarPage.calendarButton.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        calendarPage.clickDateDropdownMenu.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @Then("User can see daily calendar")
    public void user_can_see_daily_calendar() {
        calendarPage.selectDayOfDropdownMenu.click();

        String actualValue = calendarPage.selectionOfDropdownMenu.getAttribute("class");
        String expectedValue = "icon action-item__menutoggle icon-view-day";

        Assert.assertEquals(expectedValue, actualValue);
    }


    @When("User can click Calendar on Module, click Dropdown Menu and select Week Option")
    public void user_can_click_calendar_on_module_click_dropdown_menu_and_select_week_option() {


        calendarPage.calendarButton.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        calendarPage.clickDateDropdownMenu.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @Then("User can see weekly calendar")
    public void user_can_see_weekly_calendar() {
        calendarPage.selectWeekOfDropdownMenu.click();
        String actualValue = calendarPage.selectionOfDropdownMenu.getAttribute("class");
        String expectedValue = "icon action-item__menutoggle icon-view-week";
        Assert.assertEquals(expectedValue, actualValue);
    }

    @When("User can click Calendar on Module, click dropdown Menu and select Month Option")
    public void user_can_click_calendar_on_module_click_dropdown_menu_and_select_month_option() {


        calendarPage.calendarButton.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        calendarPage.clickDateDropdownMenu.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @Then("User can see monthly calendar")
    public void user_can_see_monthly_calendar() {
        calendarPage.selectMonthOfDropdownMenu.click();
        String actualValue = calendarPage.selectionOfDropdownMenu.getAttribute("class");
        String expectedValue = "icon action-item__menutoggle icon-view-module";
        Assert.assertEquals(expectedValue, actualValue);
    }


    @When("User can click Calendar on Module, click dropdown Menu and select List Option")
    public void user_can_click_calendar_on_module_click_dropdown_menu_and_select_list_option() {


        calendarPage.calendarButton.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        calendarPage.clickDateDropdownMenu.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @Then("User can see List")
    public void user_can_see_list() {
        calendarPage.selectListOfDropdownMenu.click();
        String actualValue = calendarPage.selectionOfDropdownMenu.getAttribute("class");
        String expectedValue = "icon action-item__menutoggle icon-view-list";
        Assert.assertEquals(expectedValue, actualValue);
    }




    @When("User can click new event and give name")
    public void user_can_click_new_event_and_give_name() {


        calendarPage.calendarButton.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        calendarPage.clickDateDropdownMenu.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Then("User can see the event on monthly calendar view")
    public void user_can_see_the_event_on_monthly_calendar_view() {
        BrowserUtils.sleep(3);
        calendarPage.addNewEvent.click();
        calendarPage.eventTitleInputbox.sendKeys("Interview");
        calendarPage.eventTitleSaveButton.click();

        Assert.assertTrue(calendarPage.eventIcon.isDisplayed());
        String expectedValue = "Interview";
        String actualValue = calendarPage.eventText.getText();
        Assert.assertEquals(expectedValue, actualValue);

    }



    @When("User can click event name on calendar and delete it")
    public void user_can_click_event_name_on_calendar_and_delete_it() {


        calendarPage.calendarButton.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        calendarPage.clickDateDropdownMenu.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Then("User can see calendar that event is deleted")
    public void user_can_see_calendar_that_event_is_deleted() {
        BrowserUtils.sleep(3);
        calendarPage.addNewEvent.click();
        calendarPage.eventTitleInputbox.sendKeys("Interview");
        calendarPage.eventTitleSaveButton.click();

        calendarPage.eventText.click();
        calendarPage.eventMoreButton.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        calendarPage.eventThreePointIcon.click();
        calendarPage.eventDeleteButton.click();


        List <WebElement> events = Driver.getDriver().findElements(By.xpath("//a[contains(@data-object-id, 'L3JlbW90ZS5waHAvZGF')]"));
        for (WebElement event: events) {
            String eventsText = event.getText();

            SoftAssert softAssert = new SoftAssert();
            softAssert.assertFalse(eventsText.equals("Interview"));
        }



    }


}
