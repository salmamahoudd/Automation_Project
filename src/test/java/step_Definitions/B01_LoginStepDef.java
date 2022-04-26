package step_Definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import Pages.Login;

public class B01_LoginStepDef {
    Login log= new Login();

    @Given("user click on Login link")
    public void Login_link() {

       log.login_Btn().click();
    }
    @When("user fills in his valid email and password")
    public void Email_Password() {
        log.Email().sendKeys("salma@gmail.com");
        log.Password().sendKeys("123456");
    }
    @And("user clicks on Login button")
    public void Login_button() {
        log.LoginButton().click();
    }
    @Then("user navigated to home page")
    public void message() throws InterruptedException{
        Thread.sleep(2000);
        Hooks.driver.navigate().to("https://demo.nopcommerce.com");

    }
}
