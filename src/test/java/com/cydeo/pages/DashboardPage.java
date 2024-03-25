package com.cydeo.pages;

import com.cydeo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class DashboardPage {

    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[.='View all orders']")
    public WebElement allOrderLink;
}
