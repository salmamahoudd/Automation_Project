package step_Definitions;

import Pages.FilterColor;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class B05_FilterColorStepDef {
    FilterColor Color=new FilterColor();
    @Given("user click on Apparel category")
    public void Apparel_category() {
        Color.Apparel().click();

    }
    @When("user click on shoes category")
    public void shoes_category() {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/shoes");

    }
    @When("user choose the Gray color")
    public void choose_color() {
        Color.Gray_color().click();
    }
}
