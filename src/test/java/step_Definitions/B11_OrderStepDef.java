package step_Definitions;

import Pages.Order;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class B11_OrderStepDef {
    Order success_Order=new Order();
    @Given("user click on Electronics category")
    public void Electronics_category(){
        success_Order.Electronics().click();
    }
    @When("user choose sub categories like a Cell phones")
    public void Cell_phones(){
        success_Order.Cellphones().click();
    }
    @And("user Add the product want to buy in cart")
    public void product(){
        success_Order.productCart().click();
    }
    @And("the user go to Shopping cart")
    public void product_cart(){
        success_Order.shoppingOrder().click();
    }
    @Then("user click on terms")
    public void terms(){
        success_Order.Terms().click();
    }
    @And("user click on checkout button")
    public void checkout()throws InterruptedException{
        success_Order.Checkout().click();
        Thread.sleep(5000);
    }
    @When("the user fills in his mandatory personal data")
    public void mandatory_data()throws InterruptedException {
        success_Order.FirstNameData().sendKeys("salma");
        success_Order.LastNameData().sendKeys("mahmoud");
        success_Order.EmailData().sendKeys("salma@gmail.com");
        success_Order.CountryId().sendKeys("egypt");
        success_Order.CityData().sendKeys("alexandria");
        success_Order.Address1().sendKeys("city");
        success_Order.ZipPostalCode().sendKeys("12344");
        success_Order.PhoneNumber().sendKeys("12345678917");
        Thread.sleep(5000);

        success_Order.button1().click();
        Thread.sleep(5000);

        success_Order.shippingoption().click();
        success_Order.button2().click();
        success_Order.paymentmethod().click();
        success_Order.button3().click();
        success_Order.button4().click();
        success_Order.button5().click();

    }

    @And("Ensure that the success message is displayed")
    public void Message(){
        SoftAssert soft=new SoftAssert();
        Assert.assertTrue( success_Order.the_success_message_is_displayed().isDisplayed());
        soft.assertAll();



    }
}
