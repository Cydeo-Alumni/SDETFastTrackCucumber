package com.cydeo.pages;

import com.cydeo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.devtools.v85.page.*;
import org.openqa.selenium.support.*;

public class GoogleSearchPage {

    public GoogleSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "APjFqb")
    public WebElement searchBar;

    @FindBy(xpath = "//a[@class='FLP8od']")
    public WebElement capitalName;

}
