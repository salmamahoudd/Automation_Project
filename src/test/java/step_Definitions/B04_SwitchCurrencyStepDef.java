package step_Definitions;

import Pages.SwitchCurrency;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;

public class B04_SwitchCurrencyStepDef {
    SwitchCurrency Currencies=new SwitchCurrency();
    @Given("the user click on the hamburger icon in the top left corner of the screen")
    public void currencies() {
        Currencies.Switch_Currency().click();
    }

}
