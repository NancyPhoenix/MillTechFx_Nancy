package com.milltech.pages;

import com.milltech.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {

    public Home() {

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (xpath = "(//span//div[@class='header-wrapper'])[2]")
    public WebElement buttonForms;

    @FindBy (xpath = "//span[.='Practice Form']")
    public WebElement buttonPracticeForms;

}
