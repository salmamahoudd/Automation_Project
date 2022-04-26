package step_Definitions;

import Pages.RestPassword;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class B02_RestPasswordStepDef {
    RestPassword rest=new RestPassword();
    @Given("user clicks on Forgot password link")
    public void forgot_password() {
       rest.ForgotLink().click();
    }
    @When("user Enter his valid Email")
    public void Email() {
       rest.validEmail().sendKeys("salma@gmail.com");
    }
    @And("user click on recover button")
    public void button() {
        rest.recover_button().click();
    }

    @Then("confirm message is displayed")
    public void confirm_message() {
        SoftAssert soft=new SoftAssert();
        Assert.assertTrue( rest.message_displayed().isDisplayed());
        soft.assertAll();
    }
}
