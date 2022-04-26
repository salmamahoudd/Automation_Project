package step_Definitions;

import Pages.Registration;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import Pages.Registration;
public class B00_registrationStepDef {
Registration register=new  Registration();
    @Given("user click on register link")
    public void register_link(){
        register.registerLink().click();
    }
    @When("user fills in his Personal Details with valid data")
    public void Personal_details()
    {
        register.FirstName().sendKeys("salma");
        register.LastName().sendKeys("Mahmoud");
        register.email().sendKeys("salma@gmail.com");
    }
    @And("user fills in his Password with valid data")
    public void password(){
        register.password().sendKeys("123456");
        register.confirm_password().sendKeys("123456");

    }
    @And("user clicks on register button")
    public void register_button(){
        register.registerBtn().click();

    }
    @Then("success message is displayed")
    public void success_message(){
        SoftAssert soft=new SoftAssert();
       Assert.assertTrue( register.message().isDisplayed());
       soft.assertAll();

    }

}
