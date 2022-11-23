package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class UserProfile {
    public UserProfile(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
