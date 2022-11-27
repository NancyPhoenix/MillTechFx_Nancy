package com.milltech.pages;

import com.milltech.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Form extends Home {

    public Form() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h5[.='Forms']" )
    public WebElement forms;


    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement lastName;

    @FindBy(id = "userEmail")
    public WebElement email;

    @FindBy(id = "userNumber")
    public WebElement phone;

    @FindBy(xpath = "//button[.='Submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//input[@name='gender']")
    public List<WebElement> genderList;

    @FindBy(xpath = "//div[@id='example-modal-sizes-title-lg']")
    public WebElement submitVerification;

    public void genderSelect(String gender) {

        for (WebElement each : genderList) {

            if(each.getAttribute("value").equals(gender)){
                each.click();
            }

        }



    }
}
