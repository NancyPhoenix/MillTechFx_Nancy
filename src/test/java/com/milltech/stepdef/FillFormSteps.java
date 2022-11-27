package com.milltech.stepdef;

import com.milltech.pages.Form;
import com.milltech.pages.Home;
import com.milltech.utilities.ConfigReader;
import com.milltech.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class FillFormSteps {

    Form form = new Form();


    @Given("user is on the demoqa.com website")
    public void user_is_on_the_demoqa_com_website() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("user selects the forms")
    public void user_selects_the_forms() {


            form.forms.click();

    }

    @When("user selects practice forms")
    public void user_selects_practice_forms() {

        if (!form.buttonPracticeForms.isDisplayed()) {
            form.buttonForms.click();
        }
         form.buttonPracticeForms.click();
    }

    @When("user enters the first name {string}")
    public void user_enters_the_first_name(String name) {
        form.firstName.sendKeys(name);
    }

    @When("user enters the last name {string}")
    public void user_enters_the_last_name(String lastName) {
        form.lastName.sendKeys(lastName);
    }

    @When("user enters the email adress {string}")
    public void user_enters_the_email_adress(String email) {
        form.email.sendKeys(email);
    }

    @When("user enters the phone number {string}")
    public void user_enters_the_phone_number(String phone) {
        form.phone.sendKeys(phone);
    }

    @When("user submits the form")
    public void user_submits_the_form() {
        form.submitButton.click();
    }


    @When("user selects the {string}")
    public void user_selects_the(String gender) {

        form.genderSelect(gender);



    }

    @Then("user verifies the form is completed and showing the correct user details")
    public void user_verifies_the_form_is_completed_and_showing_the_correct_user_details() {

        Assert.assertTrue(form.submitVerification.isDisplayed());

    }

}
