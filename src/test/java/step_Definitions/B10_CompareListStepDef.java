package step_Definitions;

import Pages.CompareList;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class B10_CompareListStepDef {
    CompareList compare=new CompareList();
    @Given("user click on Gift Cards Category")
    public void Gift_Cards(){
        compare.GiftCards().click();
    }
    @When("user add different products to compare list")
    public void  compareList_product()throws InterruptedException{
        compare.compareListProduct1().click();
        Thread.sleep(2000);
        compare.compareListProduct2().click();
        Thread.sleep(2000);
    }
    @And("user go to compare product list")
    public void compareList()throws InterruptedException{
       compare.compare_List().click();
        Thread.sleep(5000);
    }
    @Then("user clicks on clear list button")
    public void clearList_button()throws InterruptedException{
       compare.ClearListBtn().click();
        Thread.sleep(3000);
    }
    @And("Check for a confirmation message")
    public void confirmation_message(){
        compare.confirmation().click();
    }
}
