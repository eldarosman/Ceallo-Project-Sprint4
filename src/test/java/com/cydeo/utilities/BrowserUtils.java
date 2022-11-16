package com.cydeo.utilities;

import org.junit.Assert;

import java.util.Set;

public class BrowserUtils {

    public static void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {

        }
    }

    public static void switchWindowAndVerify(String expectedInUrl, String expectedInTitle) {
        Set<String> allWindowsHandles = Driver.getDriver().getWindowHandles();

        for (String each : allWindowsHandles) {
            Driver.getDriver().switchTo().window(each);
            System.out.println("Current URL: " + Driver.getDriver().getCurrentUrl());
            if (Driver.getDriver().getCurrentUrl().contains(expectedInUrl)) {
                break;
            }
        }

        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }

    public static void verifyTitle(String expectedTitle) {
        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);
    }

    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
